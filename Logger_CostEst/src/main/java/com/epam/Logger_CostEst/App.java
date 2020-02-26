package com.epam.Logger_CostEst;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class App 
{
    private static final Logger Logcollect = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        
    }
    
    static
    {
    	App.costCalculation();
    }
    
    static void costCalculation()
    {
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		double totalCost=0, squareFeet;
    		Logcollect.debug("\t\t\t\t\t\t__________________________________________________________________\n\n");
    		Logcollect.debug("\t\t\t\t\t\t|                                                                 |\n");
    		Logcollect.debug("\t\t\t\t\t\t|             1  >> Use Standard Materials                        |\n");
    		Logcollect.debug("\t\t\t\t\t\t|             2  >> Use Above standard materials                  |\n");
    		Logcollect.debug("\t\t\t\t\t\t|             3  >>Use High Standard Materials                    |\n");
    		Logcollect.debug("\t\t\t\t\t\t|    4 >>Use High Standard Material and Need fully automated home |\n");
    		Logcollect.debug("\t\t\t\t\t\t|             5  >>Exit                                           |\n");
    		Logcollect.debug("\t\t\t\t\t\t|_________________________________________________________________|\n\n");
           
    		Logcollect.debug("\nEnter Option:");
    		int opt = sc.nextInt();
    		switch(opt)
    		{
    			case 1: Logcollect.debug("\nHow many square feet do you want? : ");
        				sqrFt = sc.nextDouble();
        				Logcollect.debug("\nPer Square Feet cost is 1200INR");
    					totalCost=sqrFt*1200;
    					Logcollect.debug("\nThe Total Cost is   "+totalCost);
    					break;
    			case 2: Logcollect.debug("\nHow many square feet do you want? : ");
        				sqrFt = sc.nextDouble();
        				Logcollect.debug("\nPer Square Feet is 1500INR");
						totalCost=sqrFt*1500;
						Logcollect.debug("\nThe Total Cost is "+totalCost);
						break;
    			case 3: Logcollect.debug("\nHow many square feet do you want? : ");
        				sqrFt = sc.nextDouble();
        				Logcollect.debug("\nPer Square Feet cost 1800INR");
						totalCost=sqrFt*1800;
						Logcollect.debug("\nThe Total Cost is: "+totalCost);
						break;
    			case 4: Logcollect.debug("\nHow many square feet do you want? : ");
        				sqrFt = sc.nextDouble();
        				Logcollect.debug("\nPer Square Feet cost: 2500INR");
						totalCost=sqrFt*2500;
						Logcollect.debug("\nThe Total Cost is: "+totalCost);
						break;
    			case 5: System.exit(0);
    			default: Logcollect.debug("\nWrong Choice!\n");
    		}
    	}
    }
}