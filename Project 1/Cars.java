/*
 * Trisha Espejo
 * Project 01
 * Section 11G
 * Due 3/18/2019
 * 
 */

public class Cars {

	
	private String make;
	private String model;
	private int year;
	private int mileage;
	
	
	public Cars (String a, String b, int c, int d)
	{
		
		make = a;
		model = b;
		year = c;
		mileage = d;
	}

	public String getMake ()
	{
		return make;
	}

	public String getmodel()
	{
		return model;
	}
	public int getYear()
	{
		return year;	
	}
	public int getMileage()
	{
		return mileage;
	}

	 
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setMadel(int year)
	{
		this.year = year;
	}	
	
	public void setMileage( int mileage)
	{
		this.mileage = mileage;
	}
	
	// override the toString
	public String toString() 
	{
		return "Cars [make=" + make + ", model=" + model + ", year=" + year + ", mileage=" + mileage + "]";
	} 

}
