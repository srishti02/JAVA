package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Trigonometry_fact {
	long actual=0;
	long expected=0;
	@Test()
	void factneg2() throws FactorialException {
	    actual=MyMath.fact(-2);
 	   System.out.println("The value of fact(-2) is " +actual);
	    //To validate the value of fact -2
           
	}


	@Test()
	void fact0() throws FactorialException {
	    actual=MyMath.fact(0);
 	   System.out.println("The value of fact(0) is " +actual);
	    //To validate the value of fact 0
	 	assertEquals(1,actual , "Expected is :1 Actual is " +actual);        

           
	}
	
	@Test()
	void fact5() throws FactorialException {
	    try {
			actual=MyMath.fact(5);
		} catch (FactorialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	   System.out.println("The value of fact(5) is " +actual);
	    //To validate the value of fact 5
	 	assertEquals(120,actual , "Expected is :120 Actual is " +actual);        
   
	}


	@Test()
	void fact5pt5() {
	    actual=MyMath.fact(5.5);
 	   System.out.println("The value of fact() is " +actual);
	    //To validate the value of fact 0
	 	assertEquals(1,actual , "Expected is :1 Actual is " +actual);        

           
	}
}
