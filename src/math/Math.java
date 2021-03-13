package math;

import java.util.stream.LongStream;

/**
 * @description Class to support basic math operations.
 */
public class Math 
{
  /** PI value*/
  final static double PI = 3.141592653589793;

  /** Taylor series expansion limit*/
  final static int EXPANSION_LIMIT = 10;

  final static double RADIAN_ANGLE_MAX = 2 * PI;

  /**
   * @description A static class providing access to basic trigonometry methods.
   *              Class expects input in form of Radian.
   */
  static class Trigonometry
  {
    /**
     * @brief Calculate trigonometric sine of an angle using taylor series.
     *
     * @param angle - for which sin is to be calculated
     *
     * @return result
     */
    public static double sin(double angle)
    {
    	double result = 0;
      double normalisedAngle = normalizeRadian(angle);

      for ( int i = 1, j = 1; i <= EXPANSION_LIMIT; ++i, j = j+2)
      {
        if( i % 2 != 0 )
        {
          result = result + pow(normalisedAngle,j)/(double)fact(j);
        }
        else
        {
          result = result - pow(normalisedAngle,j)/(double)fact(j);
        }
      }
    	return result;
    }
    
    /**
     * @brief Calculate trigonometric cosine of an angle using taylor series.
     *
     * @param angle - for which cos is to be calculated
     *
     * @return result
     */
    public static double cos(double angle)
    {
    	double result = 1;
      double normalisedAngle = normalizeRadian(angle);

      for ( int i = 1, j = 2; i < EXPANSION_LIMIT + 1; ++i, j = j+2)
      {
        if( i % 2 != 0 )
        {
          result = result - pow(normalisedAngle,j)/(double)fact(j);
        }
        else
        {
          result = result + pow(normalisedAngle,j)/(double)fact(j);
        }
      }
    	return result;
    }
    
    /**
     * @brief Calculate trigonometric tangent of an angle using taylor series.
     *
     * @param angle - for which tan is to be calculated
     *
     * @return result
     */
    public static double tan(double angle)
    {
    	return sin(angle)/cos(angle);
    }
  }

  /**
   * @brief Calculate base raised to the power of exponent.
   *
   * @param base
   * @param exponent
   *
   * @return return result
   */
  public static double pow(double base, double exponent)
  {
    double result = 1;

    if( exponent == 0 )
      return result;

    double tempExponent = exponent;
    if( tempExponent < 0 )
    {
      result = result / base;
      tempExponent++;
    }

    if( exponent > 0 )
    {
      for(int i = 0; i < exponent; i++)
      {
        result = result * base;
      }
    }

    return result;
  }

  /**
   * @brief calculate n! or factorial of n
   *
   * @param num : n for which factorial is to be calculated
   *
   * @return result
   */
  public static long fact(int num)
  {
    return LongStream.rangeClosed(1,num).reduce(
        1, (long x, long y) -> x * y);
  }

  /**
   * @brief Convert an angle measured in degrees to an approximately equivalent
   *        angle measured in radians.
   *
   * @param angle - in degrees
   *
   * @return result in radians
   */
  public static double degreesToRadian(double angle)
  {
    return (PI * angle) / 180;
  }

  /**
   * @brief Convert an angle measured in radians to an approximately equivalent
   *        angle measured in degrees.
   *
   * @param angle - in radians
   *
   * @return result in degrees
   */
  public static double radiansToDegrees(double angle)
  {
    return (angle * 180) / PI;
  }

  /**
   * @brief Normalize an angle in radians between 0 to RADIAN_ANGLE_MAX
   *
   * @param angle - to normalize
   *
   * @return normalized result
   */
  public static double normalizeRadian(double angle)
  {
  	return angle % RADIAN_ANGLE_MAX;
  }
  
  public static void main(String[] args)
  {
    System.out.println(fact(5));
    System.out.println(pow(-2,0));
    System.out.println(Trigonometry.sin(10));
    System.out.println(Trigonometry.cos(10));
    System.out.println(Trigonometry.tan(10));
    System.out.println(Trigonometry.sin(degreesToRadian(90)));
    System.out.println(degreesToRadian(90));
    System.out.println(Trigonometry.cos(degreesToRadian(90)));
  }
}
