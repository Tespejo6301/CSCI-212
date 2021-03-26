/*
 * Trisha Espejo
 * Project 03
 * Section 11G
 * Due 4/29/2019
 * 
 */

import java.util.StringTokenizer;


public class Project03
{
	
	public static TextFileInput myFile; 
	public static String line;
	public CarGUI gui;
	
	public static void main(String[] args) 
    {
      //refers to class CarGUI
       CarGUI gui = new CarGUI("Cars");
      //opens the gui that has menu bar and empty field
       gui.showgui();
       
    }    

    public void readFile (String car, CarGUI gui)
    {
    	 String delimiter = ",";
         String make = null;
         String model = null;
         int year = 0;
         int mileage = 0;
         int count = 0;
         UnsortedCarList unSorted = new UnsortedCarList();
         SortedCarList Sorted = new SortedCarList();
         myFile = new TextFileInput(car);
         line = myFile.readLine();
         
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
        	line = myFile.readLine();
        }
        // goes to the method displayCar in gui
        gui.displayCar(unSorted, Sorted, count);
        // displays the unsorted and sorted when open
        gui.showgui();
         
    }
}  

