/*
 * Trisha Espejo
 * Project 01
 * Section 11G
 * Due 3/18/2019
 * 
 */
import java.util.StringTokenizer;

public class Project01
{
	public static TextFileInput myFile; 
	public static String line;
	public static Cars unSorted [];
	public static Cars Sorted [];
	
	
	
    

	public static void main(String[] args) 
    {
        
    		
    	myFile = new TextFileInput("cars.txt");
        line = myFile.readLine();
        String delimiter = ",";
        StringTokenizer tokenizer = new StringTokenizer(line, delimiter);
        String make = null;
        String model = null;
        int year = 0;
        int mileage = 0;
        int count = 0;
        Cars [] unSorted = new Cars[13];
        Cars [] Sorted = new Cars[13];
        		
    

    // when there is no longer token on following line the while stop
        while (tokenizer.hasMoreTokens()) 
        {
        	
        	if ( tokenizer.countTokens() == 4)
        	{
        		
        		make = tokenizer.nextToken();
        		model = tokenizer.nextToken();
        		// change the type of year and mileage to int
        		year =  Integer.parseInt(tokenizer.nextToken());
        		mileage = Integer.parseInt(tokenizer.nextToken());
        		//takes the objects and allow class Cars to use it
        		Cars mycar = new Cars(make, model, year, mileage);
       
        		// unSorted[i] = value of myCar
        		unSorted[count] = mycar;
        		// perform selection sort
        		selectionSort(unSorted);
        		// Sorted[i] = value of myCar
        		Sorted [count] =  mycar;
        		count++;
        		
        		 
            }
        	// read the next line
        	line = myFile.readLine();	
           
         }
        
      //takes the objects and allow class CarGUI to use it
        CarsGUI myGui = new CarsGUI(unSorted, Sorted, count, count);        
        myGui.showgui();
      
        myGui.displayCar(unSorted, Sorted, count, count);
   
    }   
	public static void selectionSort (Cars[] input) 
	{
		 for (int i = 0; i < input.length; i++)
	        {
	            Cars min = input[i];
	            // store the index of smallest
	            int smallIndex = i;
	            for (int j = i + 1; j < input.length; j++)
	            {
	            	//makes sure that it wont compare an empty line with a line
	            	if ( input [j] != null)
	            	{
	            		// compare which values is the lowest
	            		if (min.getMake().compareTo(input[j].getMake()) > 0)
	            		{
	            			min = unSorted[j];
	            			smallIndex = j;
	            		}	
	            	
	                    
	                }
	            }
	            swap(input, i, smallIndex);
	         }
	}
	  //swap  the values from smallest to largest
	  private static void swap(Cars[] input, int i, int j)
	    {
	        Cars temp = input[i];
	        input[i] = input[j];
	        input[j] = temp;
	    }   


}	 
 