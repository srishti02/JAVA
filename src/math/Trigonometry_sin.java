package math;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import math.MyMath.Trigonometry;

/* @author Srishti Jain , Margaret
 * Validating values for the following
 * sin (1.57079)
sin (PI)
sin (-1)
sin (A) or sin (NaN)
sin (0)*/

 public class Trigonometry_sin {
	double actual=0.0;
	double expected=0.0;
	double decimalDigits=0.001;

	MyMath mymath=new MyMath();

	@Test()
	public void sin1pt5() throws FactorialException {
		actual=Trigonometry.sin(1.57079);
	   System.out.println(Math.sin(1.57079));
 	   System.out.println("The value of sin(1.57079) is " +actual);
	    //To validate the value of sin 1.57079
	 	assertEquals("Expected is :9999999999799855 Actual is " +actual,0.9999999999799855,actual ,decimalDigits );        

           
	}

	@Test()
	public void sinPI() throws FactorialException {
		actual=Trigonometry.sin(MyMath.PI);
 	   System.out.println("The value of sin(PI) is " +actual);
	    //To validate the value of sin PI
	 	assertEquals("Expected is :9999999999799855 Actual is " +actual,-5.289187244469688E-10,actual ,decimalDigits );        

           
	}
	@Test()
	public void sinneg1() throws FactorialException {
		actual=Trigonometry.sin(-1);
	   System.out.println(Math.sin(-1));
 	   System.out.println("The value of sin(-1) is " +actual);
	    //To validate the value of sin -1
	 	assertEquals("Expected is :-0.8414709848078965 Actual is " +actual,-0.8414709848078965,actual ,decimalDigits );        

           
	}
	@Test()
	public void sinNan() throws FactorialException {
		actual=Trigonometry.sin(Double.NaN);
	   System.out.println(Math.sin(Double.NaN));
 	   System.out.println("The value of sin(NaN) is " +actual);
	    //To validate the value of sin NaN
	 	assertEquals("Expected is :NaN Actual is " +actual,Double.NaN,actual ,decimalDigits );        

           
	}
	public @Test()
	void sin0() throws FactorialException {
		actual=Trigonometry.sin(0);
	   System.out.println(Math.sin(0));
 	   System.out.println("The value of sin(0) is " +actual);
	    //To validate the value of sin 0
	 	assertEquals( "Expected is :0 Actual is " +actual,0,actual ,decimalDigits);        

           
	}

	}
