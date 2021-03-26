/*
 * Trisha Espejo
 * Project 04
 * Section 11G
 * Due 5/14/2019
 * 
 */

class UnsortedCarList extends CarList
{
	public UnsortedCarList () 
    {
        super();
    }
	
    // Add the data to the end of the list by the append method on Carlist 
    public void add(Car data)
    {
        super.append(data);
    }
	    
}
