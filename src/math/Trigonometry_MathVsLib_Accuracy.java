package math;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import math.MyMath.Trigonometry;
/*
 *  * @author Srishti Jain , Margaret

pow(5,5)
pow (10000.9999,150)
degreesToRadians(60)
degreesToRadians(45)
degreesToRadians (0.8E60)
sin (1.57079)
sin (-1)
cos (1.57079)
cos (-1)
tan (1.57079)
tan (-1)
tan(degreesToRadians(90))

 */
public class Trigonometry_MathVsLib_Accuracy {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();
	double decimalDigits=0.001;

	@Test()
	public void accuracyPowpt5() throws FactorialException {
		actual=MyMath.pow(5, 5);
 	   System.out.println("The value of pow(5,5) is " +actual);
	    //To validate the value of pow(5,5)
 	  assertEquals(Math.pow(5, 5),actual ,decimalDigits);        
           
	}
	@Test()
	public void accuracyPow1000to150() throws FactorialException {
		actual=MyMath.pow(10000.9999,150);
 	   System.out.println("The value of pow(10000.9999,150) is " +actual);
	    //To validate the value of pow(10000.9999,150)
	 	assertEquals(Math.pow(10000.9999,150),actual ,decimalDigits);        
           
	}
	
	@Test()
	public void accuracyDegToRad60() throws FactorialException {
		actual=MyMath.degreesToRadian(60);
 	   System.out.println("The value of degreesToRadian(60) is " +actual);
	    //To validate the value of degreesToRadian(60)
	 	assertEquals(Math.toRadians(60),actual ,decimalDigits);        
           
	}
	
	@Test()
	public void accuracyDegToRad45() throws FactorialException {
		actual=MyMath.degreesToRadian(45);
 	   System.out.println("The value of degreesToRadian(45) is " +actual);
	    //To validate the value of degreesToRadian(45)
	 	assertEquals(Math.toRadians(45),actual ,decimalDigits);        
           
	}
	
	@Test()
	public void accuracyDegToRadPt8E60() throws FactorialException {
		actual=MyMath.degreesToRadian(0.8E60);
 	   System.out.println("The value of degreesToRadian(0.8E60) is " +actual);
	    //To validate the value of degreesToRadian(0.8E60)
	 	assertEquals(Math.toRadians(0.8E60),actual ,decimalDigits);        
           
	}
	
	@Test()
	public void sin1pt5() throws FactorialException {
		actual=Trigonometry.sin(1.57079);
 	   System.out.println("The value of sin(1.57079) is " +actual);
	    //To validate the value of sin(1.57079)
	 	assertEquals(Math.sin(1.57079),actual ,decimalDigits);        
           
	}
	

	@Test()
	public void sinNeg1() throws FactorialException {
		actual=Trigonometry.sin(-1);
 	   System.out.println("The value of sin(-1) is " +actual);
	    //To validate the value of sin(-1)
	 	assertEquals(Math.sin(-1),actual ,decimalDigits);        
           
	}
	
	@Test()
	public void cos1pt5() throws FactorialException {
		actual=Trigonometry.cos(1.57079);
 	    System.out.println("The value of cos(1.57079) is " +actual);
	    //To validate the value of cos(1.57079)
	 	assertEquals(Math.cos(1.57079),actual ,decimalDigits);        
           
	}
	

	@Test()
	public void cosNeg1() throws FactorialException {
		actual=Trigonometry.cos(-1);
 	    System.out.println("The value of cos(-1) is " +actual);
	    //To validate the value of cos(-1)
	 	assertEquals(Math.cos(-1),actual ,decimalDigits);        
           
	}
	
	@Test()
	public void tan1pt5() throws FactorialException {
		actual=Trigonometry.tan(1.57079);
 	    System.out.println("The value of tan(1.57079) is " +actual);
	    //To validate the value of tan(1.57079)
	 	assertEquals(Math.tan(1.57079),actual ,decimalDigits);        
           
	}
	
	@Test()
	public void tanNeg1() throws FactorialException {
		actual=Trigonometry.tan(-1);
	    //To validate the value of cos(-1)
	 	assertEquals(Math.tan(-1),actual ,decimalDigits);        
           
	}

	@Test()
	public void tanDegtoRad90() throws FactorialException {
		actual=Trigonometry.tan(MyMath.degreesToRadian(90));
		double expected=Math.tan(Math.toRadians(90));
Assert.assertTrue("Invalid",expected>2147483647&&actual>2147483647 );        
			
	
 	    System.out.println("The value of tan(MyMath.degreesToRadian(90) is " +actual);
	    
	}
	}

		

