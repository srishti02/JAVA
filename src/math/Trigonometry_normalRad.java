package math;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
import math.MyMath.Trigonometry;
/* *  * @author Srishti Jain , Margaret

 * normalizeRadian(-1)
normalizeRadian(0)
normalizeRadian(6.2832)
normalizeRadian(16) normalizeRadian(1000000)

 */

public class Trigonometry_normalRad {
	double actual=0.0;
	double expected=0.0;
	double decimalDigits=0.001;

	MyMath mymath=new MyMath();

	@Test()
	public void degNmlRadneg1() throws FactorialException {
		actual=MyMath.normalizeRadian(-1);
 	   System.out.println("The value of normalizeRadian(-1) is " +actual);
	    //To validate the value of normalizeRadian -1
 	  assertEquals( "Expected is :-1\r\n" + 
	 			" Actual is " +actual,-1,actual ,decimalDigits);        

           
	}

	@Test()
	public void degNmlRad0() throws FactorialException {
		actual=MyMath.normalizeRadian(0);
 	   System.out.println("The value of normalizeRadian(0) is " +actual);
	    //To validate the value of normalizeRadian 0
	 	assertEquals("Expected is :0\r\n" + 
	 			" Actual is " +actual,0,actual ,decimalDigits );        

           
	}

	@Test()
	public void degNmlRad6pt28() throws FactorialException {
		actual=MyMath.normalizeRadian(6.2832);
 	   System.out.println("The value of normalizeRadian(6.2832) is " +actual);
	    //To validate the value of normalizeRadian -1
	 	assertEquals( "Expected is :1.4692820413664265E-5\r\n" + 
	 			" Actual is " +actual,1.4692820413664265E-5,actual ,decimalDigits);        

           
	}

	@Test()
	public void degNmlRad16() throws FactorialException {
		actual=MyMath.normalizeRadian(16);
 	   System.out.println("The value of normalizeRadian(16) is " +actual);
	    //To validate the value of normalizeRadian 16
	 	assertEquals( "Expected is :3.4336293856408275\r\n" + 
	 			" Actual is " +actual,3.4336293856408275,actual ,decimalDigits);        

           
	}
	@Test()
	public void degNmlRad1000000() throws FactorialException {
		actual=MyMath.normalizeRadian(1000000);
 	   System.out.println("The value of normalizeRadian(1000000) is " +actual);
	    //To validate the value of normalizeRadian 1000000
	 	assertEquals( "Expected is :5.925621140132833\r\n" + 
	 			" Actual is " +actual,5.925621140132833,actual ,decimalDigits);        

           
	}

		}

