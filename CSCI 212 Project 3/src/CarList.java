/*
 * Trisha Espejo
 * Project 03
 * Section 11G
 * Due 4/29/2019
 * 
 */

abstract class CarList
{
    protected CarNode head;
    protected CarNode tail;

    // The length of the linked list may be public
    public int length;

    // Default constructor
    public CarList()
    {
        this.head = new CarNode(); 
        this.tail = this.head;
        this.length = 0;
    }
    // adds to the end of the list
    public void append(Car data)
    {
        // Create new node
        CarNode newNode = new CarNode(data); 
        
        // Make the tail node's next node point to the new node
        this.tail.next = newNode;

        // Set the tail node to point to the new node
        this.tail = newNode; 

        // Increment the length property of this linked list
        this.length++;
    }
    
    public String toString()
    {
        // Create the StringBuilder we'll use to append every node's data to
        StringBuilder sb = new StringBuilder();

        // Iterate through linked list until we hit null, adding the string 
        // that's inside each node to the StringBuilder
        for (CarNode i = head.next; i != null; i = i.next)
        {
            sb.append(i.toString() + "\n");
        }
    
        // Add to the StringBuilder the last string

        // Return the string representation of the StringBuilder
        return sb.toString();
    }
    

}
