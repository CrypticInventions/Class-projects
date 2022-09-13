
/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Brandon Hugger 
 * @version 08/02/20       
 * my program converts foreign money into USD and subtracts it from a set
 * budget
 */
public class Currencyv1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here
        double poundsSpent = 521.92;
        double poundsExchangeRate = 0.74;
        double dollarsSpentInBritain = 0.0;
        double dollarsAfterBritain = 0.0;
        
        double yenSpent = 202100.91;
        double yenExchangeRate = 100.20;
        double dollarsSpentInJapan = 0.0;
        double dollarsAfterJapan = 0.0;
        
        double eurosSpent = 791.55;
        double eurosExchangeRate = 0.81;
        double dollarsSpentInEurope = 0.0;
        double dollarsAfterEurope = 0.0;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println("starting US dollars: \t 6500.0");
        System.out.println();
        
        dollarsSpentInMexico = pesosSpent/pesoExchangeRate;
        System.out.println("Mexico:");
        System.out.println("Pesos spent: \t" + pesosSpent);
        System.out.println("US dollars equivalent: \t" + dollarsSpentInMexico);
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        System.out.println("US dollars remaining: \t" + dollarsAfterMexico);
        System.out.println();
        
        
        
        dollarsSpentInJapan = yenSpent/yenExchangeRate;
        System.out.println("Japan:");
        System.out.println("Yen spent: \t" + yenSpent);
        System.out.println("US dollars equivalent: \t" + dollarsSpentInJapan);
        dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;
        System.out.println("US dollars remaining: \t" + dollarsAfterJapan);
        System.out.println();
        
        
        dollarsSpentInBritain = poundsSpent/poundsExchangeRate;
        System.out.println("Britain:");
        System.out.println("Pounds spent: \t" + poundsSpent);
        System.out.println("US dollars equivalent: \t" + dollarsSpentInBritain);
        dollarsAfterBritain = dollarsAfterJapan - dollarsSpentInBritain;
        System.out.println("US dollars remaining \t" + dollarsAfterBritain);
        System.out.println();
        
        
        
        dollarsSpentInEurope = eurosSpent/eurosExchangeRate;
        System.out.println("Europe:");
        System.out.println("Euros spent: \t" + eurosSpent);
        System.out.println("US dollars equivalent: \t" + dollarsSpentInEurope);
        dollarsAfterEurope = dollarsAfterBritain - dollarsSpentInEurope;
        System.out.println("US dollars remaining \t" + dollarsAfterEurope);
        System.out.println();
        
        System.out.println("===============================================");
        System.out.println("Remaining US dollars: \t" + dollarsAfterEurope);
        System.out.println();
        System.out.println();
        
        
        
        
        




        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1/costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1%costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	        System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = budget2/((int)costItem2 + 1);//how many items can be purchased
		System.out.println(costItem2);
		double fundsRemaining2 = ((double)budget2%costItem2);  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

