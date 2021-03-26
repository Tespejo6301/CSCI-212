/*
 * Trisha Espejo
 * Project 04
 * Section 11G
 * Due 5/14/2019
 * 
 */


import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.io.File;
import java.util.StringTokenizer;


public class FileMenuHandler implements ActionListener 
{

    // Save the reference to the gui object this FileMenuHandler is 
    // associated with
    private CarGUI gui;
    
   
    // Constructor that takes as its parameter the gui associated 
    // with this FileMenuHandler
    public FileMenuHandler(CarGUI gui) 
    {
        this.gui = gui;
          
    }

    @Override
    public void actionPerformed(ActionEvent event) 
    {
        // Get the command name from the event
    	String menuName = event.getActionCommand();
        
    	
        if (menuName.equals("Open")) 
        {
        	 JFileChooser fc = new JFileChooser();

             // Attempt to open the file
             int returnVal = fc.showOpenDialog(null);

             // If user selected a file, create File object and pass it to
             // the Project03 
             if (returnVal == JFileChooser.APPROVE_OPTION) 
             {
                 File file = fc.getSelectedFile();
                 Project04 text = new Project04();
                 // convert the type of object of file to String
                 String car = file.toString();
                 // send the cars.txt to Project 03 to do tokenizer 
                 text.readFile(car, gui); 
   
             }
 
             
             else if (returnVal == JFileChooser.CANCEL_OPTION)
             {
                 System.out.println("Open command cancelled by user.");
             }
             
        } 
        else if (menuName.equals("Quit"))
        {
            System.exit(0);
        }

    }

    // converts file to String
	@Override
	public String toString()
	{
		return "file";
	} 


}
