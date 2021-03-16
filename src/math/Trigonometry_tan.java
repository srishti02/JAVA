package math;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import math.MyMath.Trigonometry;
/*
 *  @author Srishti Jain , Margaret
 *  tan (1.57079)
 tan (PI)
 tan (-1)
 tan (NaN)
 tan (0)

 */
public class Trigonometry_tan {
	double actual=0.0;
	double expected=0.0;
	double decimalDigits=0.001;

	MyMath mymath=new MyMath();



	@Test()
	public void tan1pt5() throws FactorialException {
		actual=Trigonometry.tan(1.57079);
	   System.out.println(Math.tan(1.57079));
 	   System.out.println("The value of tan(1.57079) is " +actual);
	    //To validate the value of tan 1.57079
	 	assertEquals( "Expected is :6.3267948967760925E-6 Actual is " +actual,6.3267948967760925E-6,actual ,decimalDigits);        

           
	}

	@Test()
	public void tanPI() throws FactorialException {
		actual=Trigonometry.tan(MyMath.PI);
	   System.out.println(Math.tan(MyMath.PI));
 	   System.out.println("The value of tan(PI) is " +actual);
	    //To validate the value of tan PI
	 	assertEquals("Expected is :9999999999799855 Actual is " +actual,0.9999999999799855,actual ,decimalDigits );        

           
	}
	@Test()
	public void tanneg1() throws FactorialException {
		actual=Trigonometry.tan(-1);
	   System.out.println(Math.tan(-1));
 	   System.out.println("The value of tan(-1) is " +actual);
	    //To validate the value of tan -1
	 	assertEquals("Expected is :-0.8414709848078965 Actual is " +actual,-0.8414709848078965,actual ,decimalDigits );        

           
	}
	@Test()
	public void tanNan() throws FactorialException {
		actual=Trigonometry.tan(Double.NaN);
	   System.out.println(Math.tan(Double.NaN));
 	   System.out.println("The value of tan(NaN) is " +actual);
	    //To validate the value of tan NaN
	 	assertEquals( "Expected is :NaN Actual is " +actual,Double.NaN,actual ,decimalDigits);        

           
	}
	@Test()
	public void tan0() throws FactorialException {
		actual=Trigonometry.tan(0);
	   System.out.println(Math.tan(0));
 	   System.out.println("The value of tan(0) is " +actual);
	    //To validate the value of tan 0
	 	assertEquals("Expected is :0 Actual is " +actual,0,actual ,decimalDigits );        

           
	}

	}
