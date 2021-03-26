/*
 * Trisha Espejo
 * Project 04
 * Section 11G
 * Due 5/14/2019
 * 
 */

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EditMenuHandler implements ActionListener 
{
	 private CarGUI gui;
	 
	 public static TextFileInput myFile; 
	 public static String line;
	
	 
	 public EditMenuHandler(CarGUI gui) 
	 {
		 this.gui = gui;        
	 }
	 public void actionPerformed(ActionEvent event) 
	    {
	        // Get the command name from the event
	    	String menuName = event.getActionCommand();
	
	        if (menuName.equals("Search"))
	        {
	        	// ask the user to input car make
	        	String inputMake = JOptionPane.showInputDialog("Please enter a car make");
	        	Project04 read = new Project04();
	        	// sends the objects to search method in Project 04
	        	read.search(inputMake, gui);
	        		
	        }
	        
	    }


	             
}
