/*
 * Trisha Espejo
 * Project 02
 * Section 11G
 * Due 4/08/2019
 * 
 */

class SortedCarList extends CarList
{
	public SortedCarList () 
    {
        super();
    }
	
    public void add(Car data) 
    {
        // Create new node
        CarNode n = new CarNode(data);

        // Create iterator node
        CarNode i = this.head;

        //Look for the two spots we want to insert the new node between
        // compare the make object of data
        while (i.next != null && n.data.getMake().compareTo(i.next.data.getMake()) > 0)
        {
        	 // moves i forward
            i = i.next;
           
        }
        
        //Insert the new node between current node and the next node
        n.next = i.next;
        i.next = n;
        this.length++;

        //  Check if we need to update tail as well
        if (n.next == null) this.tail = n;
    }

    
	
}
