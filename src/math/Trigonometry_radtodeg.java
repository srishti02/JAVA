package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_radtodeg {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();



	@Test()
	void tanRadToDeg45() throws FactorialException {
		actual=MyMath.radiansToDegrees(45);
	   System.out.println(Math.toDegrees(45));
 	   System.out.println("The value of todegree(45) is " +actual);
	    //To validate the value of radiansToDegrees 45
	 	assertEquals(2578.3100780887044,actual , "Expected is :2578.3100780887044\r\n" + 
	 			" Actual is " +actual);        

           
	}

	@Test()
	void tanRadToDegStr() throws FactorialException {
		actual=MyMath.radiansToDegrees("test");
		   System.out.println(Math.toDegrees("test"));
	 	   System.out.println("The value of todegree(test) is " +actual);
		    //To validate the value of radiansToDegrees test

	           
           
	}
	}
