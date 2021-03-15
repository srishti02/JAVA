package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_tan {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();



	@Test()
	void tan1pt5() throws FactorialException {
		actual=Trigonometry.tan(1.57079);
	   System.out.println(Math.tan(1.57079));
 	   System.out.println("The value of tan(1.57079) is " +actual);
	    //To validate the value of tan 1.57079
	 	assertEquals(6.3267948967760925E-6,actual , "Expected is :6.3267948967760925E-6 Actual is " +actual);        

           
	}

	@Test()
	void tanPI() throws FactorialException {
		actual=Trigonometry.tan(MyMath.PI);
	   System.out.println(Math.tan(MyMath.PI));
 	   System.out.println("The value of tan(PI) is " +actual);
	    //To validate the value of tan PI
	 	assertEquals(0.9999999999799855,actual , "Expected is :9999999999799855 Actual is " +actual);        

           
	}
	@Test()
	void tanneg1() throws FactorialException {
		actual=Trigonometry.tan(-1);
	   System.out.println(Math.tan(-1));
 	   System.out.println("The value of tan(-1) is " +actual);
	    //To validate the value of tan -1
	 	assertEquals(-0.8414709848078965,actual , "Expected is :-0.8414709848078965 Actual is " +actual);        

           
	}
	@Test()
	void tanNan() throws FactorialException {
		actual=Trigonometry.tan(Double.NaN);
	   System.out.println(Math.tan(Double.NaN));
 	   System.out.println("The value of tan(NaN) is " +actual);
	    //To validate the value of tan NaN
	 	assertEquals(Double.NaN,actual , "Expected is :NaN Actual is " +actual);        

           
	}
	@Test()
	void tan0() throws FactorialException {
		actual=Trigonometry.tan(0);
	   System.out.println(Math.tan(0));
 	   System.out.println("The value of tan(0) is " +actual);
	    //To validate the value of tan 0
	 	assertEquals(0,actual , "Expected is :0 Actual is " +actual);        

           
	}

	}
