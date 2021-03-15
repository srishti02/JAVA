package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_pow_sin {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();

	/*Validating values for the following
	 * sin (1.57079)
	sin (PI)
	sin (-1)
	sin (A) or sin (NaN)
	sin (0)*/

	@Test()
	void sin1pt5() throws FactorialException {
		actual=Trigonometry.sin(1.57079);
	   System.out.println(Math.sin(1.57079));
 	   System.out.println("The value of sin(1.57079) is " +actual);
	    //To validate the value of sin 1.57079
	 	assertEquals(0.9999999999799855,actual , "Expected is :9999999999799855 Actual is " +actual);        

           
	}

	@Test()
	void sinPI() throws FactorialException {
		actual=Trigonometry.sin(MyMath.PI);
	   System.out.println(Math.sin(MyMath.PI));
 	   System.out.println("The value of sin(PI) is " +actual);
	    //To validate the value of sin PI
	 	assertEquals(0.9999999999799855,actual , "Expected is :9999999999799855 Actual is " +actual);        

           
	}
	@Test()
	void sinneg1() throws FactorialException {
		actual=Trigonometry.sin(-1);
	   System.out.println(Math.sin(-1));
 	   System.out.println("The value of sin(-1) is " +actual);
	    //To validate the value of sin -1
	 	assertEquals(-0.8414709848078965,actual , "Expected is :-0.8414709848078965 Actual is " +actual);        

           
	}
	@Test()
	void sinNan() throws FactorialException {
		actual=Trigonometry.sin(Double.NaN);
	   System.out.println(Math.sin(Double.NaN));
 	   System.out.println("The value of sin(NaN) is " +actual);
	    //To validate the value of sin NaN
	 	assertEquals(Double.NaN,actual , "Expected is :NaN Actual is " +actual);        

           
	}
	@Test()
	void sin0() throws FactorialException {
		actual=Trigonometry.sin(0);
	   System.out.println(Math.sin(0));
 	   System.out.println("The value of sin(0) is " +actual);
	    //To validate the value of sin 0
	 	assertEquals(0,actual , "Expected is :0 Actual is " +actual);        

           
	}

	}
