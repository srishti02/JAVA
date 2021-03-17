package math;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
/* @author Srishti Jain , Margaret
 * pow (10,0)
pow (5,1)
pow (NaN,7)
pow (NaN,0)
pow (17,NaN)
pow (-2,2)
pow (2,-2)
pow (2,2)
pow (0.5,0.5)
pow (-8,-2)

 */
public class Trigonometry_pow_test {
	double actual=0.0;
	double expected=0.0;
	double decimalDigits=0.001;

	@Test()
	public void pow10to0() {
	    actual=MyMath.pow(10, 0);
 	   System.out.println("The value of pow(10,0) is " +actual);
	    //To validate the value of 10^0
       assertEquals("Expected is :1 Actual is " +actual,1,actual ,decimalDigits );
           
	}
	@Test()
	public void pow5to1() {
	    actual=MyMath.pow(5, 1);
 	   System.out.println("The value of pow(5,1) is " +actual);
	    //To validate the value of 5^1
       assertEquals("Expected is :5 Actual is " +actual,5,actual ,decimalDigits );
           
	}
	@Test()
	public void powNanto7() {
	    actual=MyMath.pow(Double.NaN, 7);
	    //To validate the value of NaN^7
 	   System.out.println("The value of pow(NaN,7) is " +actual);
       assertEquals("Expected is :NaN Actual is " +actual,Double.NaN,actual ,decimalDigits );

	}
	@Test()
	public void powNanto0() {
	    actual=MyMath.pow(Double.NaN, 0);
	    //To validate the value of NaN^0
 	   System.out.println("The value of pow(NaN,0) is " +actual);
 	   assertEquals( "Expected is :1 Actual is " +actual,1,actual ,decimalDigits);
	            
	}
	
	@Test(expected=Error.class)
	public void pow17toNan() {
	    actual=MyMath.pow(17,Double.NaN);
	  
	    //To validate the value of 17^NaN
	    System.out.println("The value of pow(17,NaN) is " +MyMath.pow(17,Double.NaN));
	 	assertEquals("Expected is :NaN Actual is " +actual,Double.NaN,actual ,decimalDigits );
       
	}
	
	@Test()
	public void powneg2to2() {
	    actual=MyMath.pow(-2,2);
	   
	    //To validate the value of -2^2
	    System.out.println("The value of pow(-2,2) is " +actual);
	 	assertEquals("Expected is :4 Actual is " +actual,4,actual ,decimalDigits );        
	}
	
	
	@Test()
	public void pown2toneg2() {
	    actual=MyMath.pow(2,-2);
	   
	    //To validate the value of 2^-2
	    System.out.println("The value of pow(2,-2) is " +actual);
	 	assertEquals("Expected is :0.25 Actual is " +actual,0.25,actual ,decimalDigits );        
	}

	@Test()
	public void pown2to2() {
	    actual=MyMath.pow(2,2);
	   
	    //To validate the value of 2^2
	    System.out.println("The value of pow(2,2) is " +actual);
	 	assertEquals( "Expected is :4 Actual is " +actual,4,actual ,decimalDigits);        
	}
	
	@Test(expected=Error.class)
	public void powpt5topt5() {
	    actual=MyMath.pow(0.5,0.5);
	    System.out.println(Math.pow(0.5, 0.5));
	    //To validate the value of 0.5^0.5
	    System.out.println("The value of pow(0.5,0.5) is " +actual);
	 	//assertEquals("Expected is :0.5 Actual is " +actual,0.5,actual ,decimalDigits ); 
	 	boolean flag=actual==0.5;
    
	}
	
	@Test()
	public void powneg8toneg2() {
	    actual=MyMath.pow(-8,-2);
	    //To validate the value of -8^-2
	    System.out.println("The value of pow(-8,-2) is " +actual);
	 	assertEquals( "Expected is :0.015625 Actual is " +actual,0.015625,actual ,decimalDigits);        
	}
	
	
}
