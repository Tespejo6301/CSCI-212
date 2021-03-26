/**
 * Trisha Espejo
 * Project 0
 * Section 11G
 * Due 2/27/2018
 * 
 **/
 
import javax.swing.JOptionPane;


public class Project0 
{

	public static void main(String[] args)
	{
		String inputSent = null;
		int upperE =0, lowE = 0;
		
	
		while(true)
		{
		// ask user for sentence	
		inputSent = JOptionPane.showInputDialog("Please enter a sentence.");
		// ends program when user inputs "stop"
		// .equalsIgnoreCase - ignore case
		 if (inputSent.equalsIgnoreCase("stop"))
             System.exit(0);
		 // counts how many lowercase e and uppercase E present in the string
		 for (int i = 0; i < inputSent.length(); i++) 
		 {
			 // charAt() - allows to go over each element of a string
			 if (inputSent.charAt(i) == 'e')
				 lowE++;
			 if (inputSent.charAt(i) == 'E')
				 upperE++;
		 }
		 
		 // prints result
		 JOptionPane.showMessageDialog( null, "Number of lower case e's: " + lowE + "\n"+ "Number of upper case E's: " + upperE);
		 lowE = 0;
		 upperE = 0;
		}
	}
}


