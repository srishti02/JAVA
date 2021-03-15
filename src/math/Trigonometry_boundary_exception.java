package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import math.MyMath.Trigonometry;

class Trigonometry_boundary_exception {
	double actual=0.0;
	double expected=0.0;
	MyMath mymath=new MyMath();

	@Test()
	void tan9999999999() throws FactorialException {
		actual=Trigonometry.tan(9999999999);
	   System.out.println(Math.tan(9999999999));
 	   System.out.println("The value of tan(9999999999) is " +actual);
	    //To validate the value of tan 9999999999

           
	}

	@Test()
	void cos5div0() throws FactorialException {
		actual=Trigonometry.cos(5/0);
	   System.out.println(Math.cos(5/0));
 	   System.out.println("The value of cos(5/0) is " +actual);
	    //To validate the value of cos 5/0

           
	}
	@Test()
	void tanArrayOutofBound() throws FactorialException {
		double[] a = {90,180};
		actual=Trigonometry.tan(a[2]);
	   System.out.println(Math.tan(a[2]));
 	   System.out.println("The value of tan(a[2]) is " +actual);
	    //To validate the value of tan a[2]

           
	}	
	
	@Test()
	void degToRad() throws FactorialException {
		double[] a = {90,180};
		actual=MyMath.degreesToRadian(((0.8E60*1)+1%0));
	   System.out.println(Math.toRadians(((0.8E60*1)+1%0)));
 	   System.out.println("The value of toRad((0.8E60*1)+1%0)) is " +actual);
	    //To validate the value of toRadians((0.8E60*1)+1%0)

           
	}	
	
}
