package math;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Trigonometry_cos.class,Trigonometry_MathVsLib_Accuracy.class,Trigonometry_normalRad.class,Trigonometry_sin.class,Trigonometry_pow_test.class,Trigonometry_radtodeg.class,Trigonometry_degtorad.class,Trigonometry_fact.class,Trigonometry_boundary_exception.class})
public class AllTests {

}
