package com.dhatriinfo.logics;

import java.text.DecimalFormat;
import java.util.Random;

public class GenerateId 
{
	private static String employeeId="DS-";
	/*private static String uniqueNo;*/
	public static String generateNumber()
	{
		
		
		Random random=new Random();
		int randomNo=random.nextInt(100);
		String unquieNo=factorial(randomNo);
		
		return employeeId+unquieNo;
	}
	
	public static String factorial(int randomNo)
	{
		String uniqueNo="";
		
		long fact=1;
		for(int i=0;i<=randomNo-1;i++)
		{
			fact=(fact*i)+randomNo;
		}
		if(fact<0)
		{
			fact=fact*(-1);
		}
		Long longobj=new Long(fact);
		String temp=longobj.toString();
		
		if(temp.length()>=4)
		{
			for(int i=0;i<=3;i++)
			{
				
				 uniqueNo=uniqueNo+temp.charAt(i);
				 
			}
			
		}
		else
		{
			uniqueNo="";
			long tempfac=Long.parseLong(temp);
			DecimalFormat df = new DecimalFormat("0000");
			uniqueNo=df.format(tempfac);
		}
		return uniqueNo;
	}
	

	
}
