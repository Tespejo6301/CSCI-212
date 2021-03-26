/*
 * Trisha Espejo
 * Project 02
 * Section 11G
 * Due 4/08/2019
 * 
 */

import java.util.StringTokenizer;

public class Project02
{
	public static TextFileInput myFile; 
	public static String line;

	public static void main(String[] args) 
    {
        
    		
    	myFile = new TextFileInput("cars.txt");
        line = myFile.readLine();
        String delimiter = ",";
        String make = null;
        String model = null;
        int year = 0;
        int mileage = 0;
        int count = 0;
        UnsortedCarList unSorted = new UnsortedCarList();
        SortedCarList Sorted = new SortedCarList();
        while (line != null) 
        {
        	// helps reset tokenizer countTokens and print the rest of value
            StringTokenizer tokenizer = new StringTokenizer(line, delimiter);

        	if ( tokenizer.countTokens() == 4)
        	{
        		
        		make = tokenizer.nextToken();
        		model = tokenizer.nextToken();
        		// change the type of year and mileage to int
        		year =  Integer.parseInt(tokenizer.nextToken());
        		mileage = Integer.parseInt(tokenizer.nextToken());
        		//takes the objects and allow class Cars to use it
        		Car data = new Car(make, model, year, mileage);
        		// count how many tokens would be print
        		count++;
        		// allows the object of data
        		//to be access by the add method unsortedCarlist
        		unSorted.add(data);
        		// allows the object of data
        		//to be access by the add method sortedCarlist
        		Sorted.add(data);		
        		
            }

        	// read the next line
        	line=myFile.readLine();
        	
           
         }
        
      CarGUI myGui = new CarGUI(unSorted, Sorted,  count) ;        
      myGui.showgui();
      //display the GUI
      myGui.displayCar(unSorted, Sorted);
   
    }

}
