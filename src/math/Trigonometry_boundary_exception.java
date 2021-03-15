package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_boundary_exception {
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

		}
