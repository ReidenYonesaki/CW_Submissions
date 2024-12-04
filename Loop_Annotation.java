package Reiden_Yonesaki;

public class Loop_Annotation {
	/*
	 * so we start by putting a number then it prints out the month and to get through the month it has to 
	 * go through the whole code below which contains if statements, and strings to declare the month.
	*/
	public static String getMonth(int n)
		{
			//declaring the months for the string 
		
			String months = "January February March April May June "
					+ "July August September October November December ";

	    	//the i will equal 1 and will go until it is less than or equal to 12, it increments adding 1

			for (int i = 1; i <= 12; i++)
			{
				// it locates a space in the months 
				
				int sL = months.indexOf(' ');

	    		  	//shpws if n will be equal to 1
				
				if (n == i)
				{
	        		//if n equals to i it will print out index of 0 and ends before spce
					
					return months.substring(0, sL);
				}
	      			//this will happen when n is not equal to 1
					
				else
				{
	        		//it adds an index to the sL then it sets a new month string
					
					months = months.substring(sL + 1);
				}
			}
			//it returns if n never equals 1

			return " /* What String would you put here? */ ";
			
		}
