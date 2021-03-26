/*
 * Trisha Espejo
 * Project 02
 * Section 11G
 * Due 4/08/2019
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
