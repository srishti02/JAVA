package math;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import math.MyMath.Trigonometry;

/*@author Srishti Jain , Margaret
 * cos (1.57079)
cos (PI)
cos (-1)
cos (NaN)
cos (0)

 */

public class Trigonometry_cos {
	double actual=0.0;
	double expected=0.0;
	double decimalDigits=0.01;
	MyMath mymath=new MyMath();



	@Test()
	public void cos1pt5() throws FactorialException {
		actual=Trigonometry.cos(1.57079);
	   System.out.println(Math.cos(1.57079));
 	   System.out.println("The value of cos(1.57079) is " +actual);
	    //To validate the value of cos 1.57079
 	  assertEquals( "Expected is :6.3267948967760925E-6 Actual is " +actual,6.3267948967760925E-6,actual,decimalDigits );        

           
	}

	@Test()
	public void cosPI() throws FactorialException {
		actual=Trigonometry.cos(MyMath.PI);
	   System.out.println(Math.cos(MyMath.PI));
 	   System.out.println("The value of cos(PI) is " +actual);
	    //To validate the value of cos PI
	 	assertEquals("Expected is : -0.9999999999243491 Actual is " +actual, -0.9999999999243491,actual , decimalDigits);        

           
	}
	@Test()
	public void cosneg1() throws FactorialException {
		actual=Trigonometry.cos(-1);
	   System.out.println(Math.cos(-1));
 	   System.out.println("The value of cos(-1) is " +actual);
	    //To validate the value of cos -1
	 	assertEquals("Expected is :0.5403023058681397 Actual is " +actual,0.5403023058681397,actual ,decimalDigits);        

           
	}
	@Test()
	public void cosNan() throws FactorialException {
		actual=Trigonometry.cos(Double.NaN);
	   System.out.println(Math.cos(Double.NaN));
 	   System.out.println("The value of cos(NaN) is " +actual);
	    //To validate the value of cos NaN
	 	assertEquals("Expected is :NaN Actual is " +actual,Double.NaN,actual ,decimalDigits);        

           
	}
	@Test()
	public void cos0() throws FactorialException {
		actual=Trigonometry.cos(0);
	   System.out.println(Math.cos(0));
 	   System.out.println("The value of cos(0) is " +actual);
	    //To validate the value of cos 0
	 	assertEquals("Expected is :1 Actual is " +actual,1,actual , decimalDigits);        

           
	}

	}
