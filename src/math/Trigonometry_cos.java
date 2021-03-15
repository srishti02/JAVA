package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_cos {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();



	@Test()
	void cos1pt5() throws FactorialException {
		actual=Trigonometry.cos(1.57079);
	   System.out.println(Math.cos(1.57079));
 	   System.out.println("The value of cos(1.57079) is " +actual);
	    //To validate the value of cos 1.57079
	 	assertEquals(6.3267948967760925E-6,actual , "Expected is :6.3267948967760925E-6 Actual is " +actual);        

           
	}

	@Test()
	void cosPI() throws FactorialException {
		actual=Trigonometry.cos(MyMath.PI);
	   System.out.println(Math.cos(MyMath.PI));
 	   System.out.println("The value of cos(PI) is " +actual);
	    //To validate the value of cos PI
	 	assertEquals(0.9999999999799855,actual , "Expected is :9999999999799855 Actual is " +actual);        

           
	}
	@Test()
	void sinneg1() throws FactorialException {
		actual=Trigonometry.cos(-1);
	   System.out.println(Math.cos(-1));
 	   System.out.println("The value of cos(-1) is " +actual);
	    //To validate the value of cos -1
	 	assertEquals(-0.8414709848078965,actual , "Expected is :-0.8414709848078965 Actual is " +actual);        

           
	}
	@Test()
	void cosNan() throws FactorialException {
		actual=Trigonometry.cos(Double.NaN);
	   System.out.println(Math.cos(Double.NaN));
 	   System.out.println("The value of cos(NaN) is " +actual);
	    //To validate the value of cos NaN
	 	assertEquals(Double.NaN,actual , "Expected is :NaN Actual is " +actual);        

           
	}
	@Test()
	void cos0() throws FactorialException {
		actual=Trigonometry.cos(0);
	   System.out.println(Math.cos(0));
 	   System.out.println("The value of cos(0) is " +actual);
	    //To validate the value of cos 0
	 	assertEquals(1,actual , "Expected is :1 Actual is " +actual);        

           
	}

	}
