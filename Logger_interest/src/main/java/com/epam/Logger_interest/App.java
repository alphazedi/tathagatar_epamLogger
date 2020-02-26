package com.epam.Logger_interest;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
  
    }
    
    static
    {
    	App.interestcalc();
    }
    
    static void interestcalc()
    {
    	Scanner sc= new Scanner(System.in);
    	while(true)
    	{
    		LOGGER.debug("\t\t\t\t\t\t_________________________________________________________________\n\n");
            LOGGER.debug("\t\t\t\t\t\t|                                                                 |\n");
            LOGGER.debug("\t\t\t\t\t\t|             1  >> Calculate Simple Interest                     |\n");
            LOGGER.debug("\t\t\t\t\t\t|             2  >> Calculate Compound Interest                   |\n");
            LOGGER.debug("\t\t\t\t\t\t|             3  >> Exit                                          |\n");
            LOGGER.debug("\t\t\t\t\t\t|_________________________________________________________________|\n\n");
    		LOGGER.debug("\nEnter your choice: ");
    		int choice= sc.nextInt();
    		switch(choice)
    		{
    			case 1: LOGGER.debug("\nEnter the principal amount: ");
    					double principal=sc.nextDouble();
    					LOGGER.debug("\nEnter the rate of interest: ");
    					double rateofinterest=sc.nextDouble();
    					LOGGER.debug("\nEnter the time period: ");
    					double timeperiod=sc.nextDouble();
    					double simpleInterest= (principal*rateofinterest*timeperiod)/100;
    					LOGGER.debug("\nThe Calculated Simple Interest is: "+simpleInterest);
    					break;
    			case 2: LOGGER.debug("\nEnter the principal amount: ");
						double cprincipal=sc.nextDouble();
						LOGGER.debug("\nEnter the rate of interest: ");
						double crateofinterest=sc.nextDouble();
						LOGGER.debug("\nEnter the time period: ");
						double ctimeperiod=sc.nextDouble();
						double res=1+(crateofinterest/100);
						double compoundInterest=cprincipal*(Math.pow(res, ctimeperiod));
						LOGGER.debug("\nThe Calculated Compound Interest is: "+compoundInterest);
						break;
    			case 3: System.exit(0);
    			default: LOGGER.debug("\nWrong Choice!");
    		}
    	}
    }
}