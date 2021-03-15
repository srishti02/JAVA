package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_pow_MathVsLib_Accuracy {
	
	double expected=0.0;
double actual=0.0;
	MyMath mymath=new MyMath();

	@Test()
	void accuracyPowpt5() throws FactorialException {
		actual=MyMath.pow(5, 5);
 	   System.out.println("The value of pow(5,5) is " +actual);
	    //To validate the value of pow(5,5)
	 	assertEquals(Math.pow(5, 5),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	@Test()
	void accuracyPow1000to150() throws FactorialException {
		actual=MyMath.pow(10000.9999,150);
 	   System.out.println("The value of pow(10000.9999,150) is " +actual);
	    //To validate the value of pow(10000.9999,150)
	 	assertEquals(Math.pow(10000.9999,150),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	
	@Test()
	void accuracyDegToRad60() throws FactorialException {
		actual=MyMath.degreesToRadian(60);
 	   System.out.println("The value of degreesToRadian(60) is " +actual);
	    //To validate the value of degreesToRadian(60)
	 	assertEquals(Math.toRadians(60),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	
	@Test()
	void accuracyDegToRad45() throws FactorialException {
		actual=MyMath.degreesToRadian(45);
 	   System.out.println("The value of degreesToRadian(45) is " +actual);
	    //To validate the value of degreesToRadian(45)
	 	assertEquals(Math.toRadians(45),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	
	@Test()
	void accuracyDegToRadPt8E60() throws FactorialException {
		actual=MyMath.degreesToRadian(0.8E60);
 	   System.out.println("The value of degreesToRadian(0.8E60) is " +actual);
	    //To validate the value of degreesToRadian(0.8E60)
	 	assertEquals(Math.toRadians(0.8E60),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	
	@Test()
	void sin1pt5() throws FactorialException {
		actual=Trigonometry.sin(1.57079);
 	  // System.out.println("The value of sin(1.57079) is " +actual);
	    //To validate the value of sin(1.57079)
	 	assertEquals(Math.sin(1.57079),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	

	@Test()
	void sinNeg1() throws FactorialException {
		actual=Trigonometry.sin(-1);
 	  // System.out.println("The value of sin(-1) is " +actual);
	    //To validate the value of sin(-1)
	 	assertEquals(Math.sin(-1),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	
	@Test()
	void cos1pt5() throws FactorialException {
		actual=Trigonometry.cos(1.57079);
 	  // System.out.println("The value of cos(1.57079) is " +actual);
	    //To validate the value of cos(1.57079)
	 	assertEquals(Math.cos(1.57079),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	

	@Test()
	void cosNeg1() throws FactorialException {
		actual=Trigonometry.cos(-1);
 	  // System.out.println("The value of cos(-1) is " +actual);
	    //To validate the value of cos(-1)
	 	assertEquals(Math.cos(-1),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	
	@Test()
	void tan1pt5() throws FactorialException {
		actual=Trigonometry.tan(1.57079);
 	  // System.out.println("The value of tan(1.57079) is " +actual);
	    //To validate the value of tan(1.57079)
	 	assertEquals(Math.tan(1.57079),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	
	@Test()
	void tanNeg1() throws FactorialException {
		actual=Trigonometry.tan(-1);
 	  // System.out.println("The value of cos(-1) is " +actual);
	    //To validate the value of cos(-1)
	 	assertEquals(Math.cos(-1),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}

	@Test()
	void tanDegtoRad90() throws FactorialException {
		actual=Trigonometry.tan(MyMath.degreesToRadian(90));
 	  // System.out.println("The value of tan(MyMath.degreesToRadian(90) is " +actual);
	    //To validate the value of tan(MyMath.degreesToRadian(90)
	 	assertEquals(Math.tan(Math.toRadians(90)),actual , "Expected is :-1\r\n" + 
	 			" Actual is " +actual);        
           
	}
	}

		

