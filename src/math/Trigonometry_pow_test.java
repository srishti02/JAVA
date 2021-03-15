package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Trigonometry_pow_test {
	double actual=0.0;
	double expected=0.0;

	@Test()
	void pow10to0() {
	    actual=MyMath.pow(10, 0);
 	   System.out.println("The value of pow(10,0) is " +actual);
	    //To validate the value of 10^0
       assertEquals(1,actual , "Expected is :1 Actual is " +actual);
           
	}
	@Test()
	void pow5to1() {
	    actual=MyMath.pow(5, 1);
 	   System.out.println("The value of pow(5,1) is " +actual);
	    //To validate the value of 5^1
       assertEquals(5,actual , "Expected is :5 Actual is " +actual);
           
	}
	@Test()
	void powNanto7() {
	    actual=MyMath.pow(Double.NaN, 7);
	    //To validate the value of NaN^7
 	   System.out.println("The value of pow(NaN,7) is " +actual);
       assertEquals(Double.NaN,actual , "Expected is :NaN Actual is " +actual);

	}
	@Test()
	void powNanto0() {
	    actual=MyMath.pow(Double.NaN, 0);
	    //To validate the value of NaN^0
 	   System.out.println("The value of pow(NaN,0) is " +actual);
 	   assertEquals(1,actual , "Expected is :1 Actual is " +actual);
	            
	}
	
	@Test()
	void pow17toNan() {
	    actual=MyMath.pow(17,Double.NaN);
	  
	    //To validate the value of 17^NaN
	    System.out.println("The value of pow(17,NaN) is " +MyMath.pow(17,Double.NaN));
	 	assertEquals(Double.NaN,actual , "Expected is :NaN Actual is " +actual);
       
	}
	
	@Test()
	void powneg2to2() {
	    actual=MyMath.pow(-2,2);
	   
	    //To validate the value of -2^2
	    System.out.println("The value of pow(-2,2) is " +actual);
	 	assertEquals(4,actual , "Expected is :4 Actual is " +actual);        
	}
	
	
	@Test()
	void pown2toneg2() {
	    actual=MyMath.pow(2,-2);
	   
	    //To validate the value of 2^-2
	    System.out.println("The value of pow(2,-2) is " +actual);
	 	assertEquals(0.25,actual , "Expected is :0.25 Actual is " +actual);        
	}

	@Test()
	void pown2to2() {
	    actual=MyMath.pow(2,2);
	   
	    //To validate the value of 2^2
	    System.out.println("The value of pow(2,2) is " +actual);
	 	assertEquals(4,actual , "Expected is :4 Actual is " +actual);        
	}
	
	@Test()
	void powpt5topt5() {
	    actual=MyMath.pow(0.5,0.5);
	    System.out.println(Math.pow(0.5, 0.5));
	    //To validate the value of 0.5^0.5
	    System.out.println("The value of pow(0.5,0.5) is " +actual);
	 	assertEquals(0.5,actual , "Expected is :4 Actual is " +actual);        
	}
	
	@Test()
	void powneg8toneg2() {
	    actual=MyMath.pow(-8,-2);
	    //To validate the value of -8^-2
	    System.out.println("The value of pow(-8,-2) is " +actual);
	 	assertEquals(0.015625,actual , "Expected is :4 Actual is " +actual);        
	}
	
	
}
