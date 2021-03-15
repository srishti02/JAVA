package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_pow_normalRad {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();
/*
 * normalizeRadian(-1)
normalizeRadian(0)
normalizeRadian(6.2832)
normalizeRadian(16) normalizeRadian(1000000)

 */
	@Test()
	void degNmlRadneg1() throws FactorialException {
		actual=MyMath.normalizeRadian(-1);
 	   System.out.println("The value of normalizeRadian(-1) is " +actual);
	    //To validate the value of normalizeRadian -1
	 	assertEquals(-1,actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        

           
	}

	@Test()
	void degNmlRad0() throws FactorialException {
		actual=MyMath.normalizeRadian(0);
 	   System.out.println("The value of normalizeRadian(0) is " +actual);
	    //To validate the value of normalizeRadian 0
	 	assertEquals(0,actual , "Expected is :0\r\n" + 
	 			" Actual is " +actual);        

           
	}

	@Test()
	void degNmlRad6pt28() throws FactorialException {
		actual=MyMath.normalizeRadian(6.2832);
 	   System.out.println("The value of normalizeRadian(6.2832) is " +actual);
	    //To validate the value of normalizeRadian -1
	 	assertEquals(1.4692820413664265E-5,actual , "Expected is :1.4692820413664265E-5\r\n" + 
	 			" Actual is " +actual);        

           
	}

	@Test()
	void degNmlRad16() throws FactorialException {
		actual=MyMath.normalizeRadian(16);
 	   System.out.println("The value of normalizeRadian(16) is " +actual);
	    //To validate the value of normalizeRadian 16
	 	assertEquals(3.4336293856408275,actual , "Expected is :3.4336293856408275\r\n" + 
	 			" Actual is " +actual);        

           
	}
	@Test()
	void degNmlRad1000000() throws FactorialException {
		actual=MyMath.normalizeRadian(1000000);
 	   System.out.println("The value of normalizeRadian(1000000) is " +actual);
	    //To validate the value of normalizeRadian 1000000
	 	assertEquals(5.925621140132833,actual , "Expected is :5.925621140132833\r\n" + 
	 			" Actual is " +actual);        

           
	}

		}

