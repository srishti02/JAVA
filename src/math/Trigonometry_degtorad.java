package math;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import math.MyMath.Trigonometry;
/*@author Srishti Jain , Margaret
 * degreeToRadians(45)
degreeToRadians(test)
degreeToRadians(0.2E30)
Verify the value of PI

 */
public class Trigonometry_degtorad {
	double actual=0.0;
	double expected=0.0;
	double decimalDigits=0.01;

	MyMath mymath=new MyMath();



	@Test()
	public void tanDegToRad45() throws FactorialException {
		actual=MyMath.degreesToRadian(45);
	   System.out.println(Math.toRadians(45));
 	   System.out.println("The value of toRadian(45) is " +actual);
	    //To validate the value of radiantoDegree 45
	 	assertEquals( "Expected is :0.7853981633974483\r\n" + 
	 			" Actual is " +actual,0.7853981633974483,actual ,decimalDigits);        

           
	}

	@Test(expected=Error.class)
	public void tanRadToDegStr() throws FactorialException {
		actual=MyMath.degreesToRadian(test);
		   System.out.println(Math.toRadians(test));
	 	   System.out.println("The value of toRadian(test) is " +actual);
		    //To validate the value of radiantoDegree test
		 	   
           
	}
	
	@Test()
	public void tanRadToDegE() throws FactorialException {
		   actual=MyMath.degreesToRadian(0.2E30);
		   System.out.println(Math.toRadians(0.2E30));
	 	   System.out.println("The value of toRadian(0.2E30) is " +actual);
		    //To validate the value of radiantoDegree E
	 	  assertEquals("Expected is 3.4906585039886587E27\r\n" + 
		 			" Actual is " +actual,3.4906585039886587E27,actual , decimalDigits);        

	 	  
	}
	@Test()
	public void piTest() throws FactorialException {
actual=MyMath.PI;
assertEquals( "Expected is 3.141592653589793\r\n" + 
		"\r\n" + 
		" Actual is " +actual,3.141592653589793,actual ,decimalDigits);        

	}

	}

