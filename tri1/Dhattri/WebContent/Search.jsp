<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
var xmlHttp;  

function searchEmployee(str){
if (typeof XMLHttpRequest != "undefined"){
xmlHttp= new XMLHttpRequest();


}
  else if (window.ActiveXObject){
  xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
  }
  if (xmlHttp==null){
  alert("Browser does not support XMLHTTP Request")
  return;
  } 
  var url="SearchEmployee";
  url +="?searchemp=" +str;
  xmlHttp.onreadystatechange = stateChange;
  xmlHttp.open("GET", url, true);
  xmlHttp.send(null);
  }

  function stateChange(){   
  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
   document.getElementById("result").innerHTML=xmlHttp.responseText; 
     }
  }
  
 
  

</script>
</head>
<body>
<div align="center">
<jsp:include page="Module.html"></jsp:include>
</div>
<div align="center">

<input type="text" name="searchemployee" placeholder="Name | ID" onkeyup="searchEmployee(this.value)">
<div>
<!-- <input type="text" name="searchemployee"  placeholder="Loaction" onkeyup="searchEmployee(this.value)" > -->
<input type="radio" name="serach" value="location" onclick="searchEmployee(this.value)">location<br>

<input type="radio" name="serach" value="Salary" onclick="searchEmployee(this.value)">Salary<br>

</div>

</div>
<div align="center">
<div id="result"></div>
</div>

</body>
</html>