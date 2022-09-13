
/**
 * The purpose of my program is to demonstrate my knowlege of module 1 by using
 * conotation, casting, division, and values.
 *
 * @author (Brandon Hugger)
 * @version (8/3/20)
 */
public class calc
{
 
    public static void main(String args [])
    {
       int value = 7;
       double value2 = 2;
       System.out.println("The original value is " + value);//calculation and output statments
       System.out.println("When " + value + " divided by " + (int)value2 + " , the whole number result is: " + (int)(value/value2));
       System.out.println("The remainder of " + value + " divided by " + (int)value2 + " is " + (int)(value % value2));
       System.out.println("when " + value + " is divided by " +  (int)value2  + " the decimal result is " + (value2 = value/value2)); 
        
        
    }
}
