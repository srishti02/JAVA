package math;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
/*
 * @author Srishti Jain , Margaret
 * fact (-2)
fact (0)
fact (5)
fact (5.5)

 */
public class Trigonometry_fact {
	long actual=0;
	long expected=0;
	double decimalDigits=0.01;

	@Test()
	public void factneg2() throws FactorialException {
	    actual=MyMath.fact(-2);
 	   System.out.println("The value of fact(-2) is " +actual);
	    //To validate the value of fact -2
           
	}


	@Test()
	public void fact0() throws FactorialException {
	    actual=MyMath.fact(0);
 	   System.out.println("The value of fact(0) is " +actual);
	    //To validate the value of fact 0
	 	assertEquals( "Expected is :1 Actual is " +actual,1,actual ,decimalDigits);        

           
	}
	
	@Test()
	public void fact5() throws FactorialException {
	    try {
			actual=MyMath.fact(5);
		} catch (FactorialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	   System.out.println("The value of fact(5) is " +actual);
	    //To validate the value of fact 5
	 	assertEquals("Expected is :120 Actual is " +actual,120,actual ,decimalDigits );        
   
	}


	@Test()
	public void fact5pt5() {
	    actual=MyMath.fact(5.5);
 	   System.out.println("The value of fact() is " +actual);
	    //To validate the value of fact 0
	 	assertEquals( "Expected is :1 Actual is " +actual,1,actual ,decimalDigits);        

           
	}
}
