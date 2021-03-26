/*
 * Trisha Espejo
 * Project 04
 * Section 11G
 * Due 5/14/2019
 * 
 */

import java.util.StringTokenizer;

import javax.swing.JOptionPane;


public class Project04 
{
	
	public static TextFileInput myFile; 
	public static String line;
	public static UnsortedCarList unSorted;
	public static SortedCarList Sorted;
	


	public static void main(String[] args) 
    {
      //refers to class CarGUI
       CarGUI gui = new CarGUI("Cars");
      //opens the gui that has menu bar and empty field
       gui.showgui();
       
      
    }    

	public void search(String inputMake, CarGUI gui)
	{
		
		CarNode unsortedNode = unSorted.head;
		UnsortedCarList unsortedFilter = new UnsortedCarList();
		SortedCarList sortedFilter = new SortedCarList();
		while ( unsortedNode.next != null)
		{
			String UnsortedMake = unsortedNode.next.data.getMake();
			// search for make that is same as user input
			if (inputMake.equalsIgnoreCase(UnsortedMake))
			{
			// goes to append method of UnsortedCarList
			unsortedFilter.add(unsortedNode.next.data);
			// goes to the add method of the SortedCarList
			sortedFilter.add(unsortedNode.next.data);	
			}
			// go to the next node
			unsortedNode = unsortedNode.next;
		}
		// prints both the filtered unsorted and sorted 
		gui.displayCar(unsortedFilter, sortedFilter);	
	 }

		
	
	
    public void readFile (String car, CarGUI gui)
    {
    	 String delimiter = ",";
         String make = null;
         String model = null;
         int year = 0;
         int mileage = 0;
    
         unSorted = new UnsortedCarList();
         Sorted = new SortedCarList();
  
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
        gui.displayCar(unSorted, Sorted);
        // displays the unsorted and sorted when open
        gui.showgui();
         
    }

}  

