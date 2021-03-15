package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_degtorad {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();



	@Test()
	void tanDegToRad45() throws FactorialException {
		actual=MyMath.degreesToRadian(45);
	   System.out.println(Math.toRadians(45));
 	   System.out.println("The value of toRadian(45) is " +actual);
	    //To validate the value of radiantoDegree 45
	 	assertEquals(0.7853981633974483,actual , "Expected is :0.7853981633974483\r\n" + 
	 			" Actual is " +actual);        

           
	}

	@Test()
	void tanRadToDegStr() throws FactorialException {
		actual=MyMath.degreesToRadian(test);
		   System.out.println(Math.toRadians(test));
	 	   System.out.println("The value of toRadian(test) is " +actual);
		    //To validate the value of radiantoDegree test
		 	   
           
	}
	
	@Test()
	void tanRadToDegE() throws FactorialException {
		   actual=MyMath.degreesToRadian(0.2E30);
		   System.out.println(Math.toRadians(0.2E30));
	 	   System.out.println("The value of toRadian(0.2E30) is " +actual);
		    //To validate the value of radiantoDegree E
	 	  assertEquals(3.4906585039886587E27,actual , "Expected is 3.4906585039886587E27\r\n" + 
		 			" Actual is " +actual);        

	 	  
	}
	@Test()
	void piTest() throws FactorialException {
actual=MyMath.PI;
assertEquals(3.141592653589793,actual , "Expected is 3.141592653589793\r\n" + 
		"\r\n" + 
			" Actual is " +actual);        

	}

	}

