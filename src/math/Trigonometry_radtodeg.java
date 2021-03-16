package math;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import math.MyMath.Trigonometry;

/*
 @author Srishti Jain , Margaret
degreeToRadians(45)
degreeToRadians(test)
degreeToRadians(0.2E30)

 */

public class Trigonometry_radtodeg {
	double actual=0.0;
	double expected=0.0;
	double decimalDigits=0.001;

	MyMath mymath=new MyMath();



	@Test()
	public void tanRadToDeg45() throws FactorialException {
		actual=MyMath.radiansToDegrees(45);
	   System.out.println(Math.toDegrees(45));
 	   System.out.println("The value of todegree(45) is " +actual);
	    //To validate the value of radiansToDegrees 45
	 	assertEquals( "Expected is :2578.3100780887044\r\n" + 
	 			" Actual is " +actual,2578.3100780887044,actual ,decimalDigits);        

           
	}

	@Test()
	public void tanRadToDegStr() throws FactorialException {
		actual=MyMath.radiansToDegrees("test");
		   System.out.println(Math.toDegrees("test"));
	 	   System.out.println("The value of todegree(test) is " +actual);
		    //To validate the value of radiansToDegrees test

	           
           
	}
	}
