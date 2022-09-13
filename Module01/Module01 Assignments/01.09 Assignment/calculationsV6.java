
/**
 * The purpose of my program is to use variables with either a integer or double value in expression
 *
 * @author (Brandon Hugger)
 * @version (7/24/20)
 */
 /* decimals.
 *  
 * @ author APCS Team
 * @ version 2020
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
           // Addition
        System.out.println("Addition");
        int iNum1 = 29;
        int iNum2 = 9;
        int d = 11 - 17 / 5 % 4 + 2;
        System.out.println(d);
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        System.out.println((iNum1 + " + " + iNum2 + " = ") + (iNum1 + iNum2) );
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        int iNum3 = 11;
        int iNum4 = 9;
        int iNum5 = 25;
        double dNum3 = 3.14;
        double dNum4 = 10.0;
        double dNum7 = 43.21;
        double dNum5 = 3.14;
        double dNum6 = 10.0;
        System.out.println( iNum3 + " - " +  iNum4 + " - " + iNum5 + " = " + (iNum3 - iNum4 - iNum5) );
        System.out.println(dNum3 + " - " + dNum4 + " = " + (dNum3 - dNum4) );
        System.out.println(dNum5 + " + " + dNum4 + " + " + dNum6 + " = "  + (dNum5 + dNum4 + dNum5));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        int iNum6 = 25;
        int iNum7 = 9;
        int iNumQ = 16;
        int iNumW = 22;
        System.out.println(iNum6 +" * " + iNum7 + " = " + (iNum6 * iNum7) );
        System.out.println(iNumQ + " * " + iNumW + " = " + (iNumQ * iNumW));
        System.out.println(dNum5 + " * " + dNum6 + " * " + dNum6 + " = "+ (dNum5 * dNum6 * dNum6) );
        System.out.println(dNum7 + " * " + dNum5 + " = " + (dNum7 * dNum5));
        System.out.println();
        
        // Division
        System.out.println("Division");
        int iNum8 = 9;
        int iNum9 = 25;
        int iNumE = 5;
        System.out.println(iNum8 + " / " + iNum9 + " = " +  (iNum8 / iNum9) );
        System.out.println(iNum9 + " / " + iNumE + " = " + (iNum9 / iNumE));
        System.out.println(dNum7 + " / " + dNum6 + " = " + (dNum7 / dNum6) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        int iNum10 = 11;
        int iNum11 = 9;
        int iNum12 = 33;
        System.out.println(iNum10 + " % " + iNum11 + " = " + (iNum10 % iNum11) );
        System.out.println(iNum12 + " % " + iNum10 + " = " + (iNum12 % iNum10));
        System.out.println(dNum6 + " % " + dNum5 + " = " + (dNum6 % dNum5) );
        System.out.println(dNum6 + " % " + dNum7 + " = " + (dNum6 % dNum7));
        System.out.println();
        
        // 1.08 Additional int Equations
        int iNum13 = 54;
        System.out.println(iNum13 + " / " + iNum11 + " * " + iNumE + " = "+ (iNum13/iNum11) * iNumE);
        System.out.println(iNum11 + " * " + iNum12 + " + " + iNum10 + " = " + iNum11 * iNum12 + iNum10);
        // 1.09 Additional double Equations
        double dNum14 = 98.9;
        System.out.println(dNum14 + " * " + dNum4 + " % " + dNum5 + " = " + (dNum14 * dNum4) % dNum5); 
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
