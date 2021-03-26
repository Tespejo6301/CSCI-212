/*
 * Trisha Espejo
 * Project 04
 * Section 11G
 * Due 5/14/2019
 * 
 */


public class CarNode {
	protected Car data;
	protected CarNode next;
	   // Public instance variables



    public CarNode()
    {
        this(new Car(), null);
    }

    // Constructor that takes only the data as a parameter
    public CarNode(Car data)
    {
        this(data, null);
    }

    // Constructor that takes in the data and another node as parameters
    public CarNode(Car data, CarNode next)
    {
        this.data = data;
        this.next = next;
    }
    @Override
    public String toString()
    {
        return String.format(" %s", this.data);
    }

}