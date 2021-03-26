/*
 * Trisha Espejo
 * Project 04
 * Section 11G
 * Due 5/14/2019
 * 
 */

 
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;


class CarGUI extends JFrame
{  
   
	private JTextArea leftTextArea;
    private JTextArea rightTextArea;
    StringBuilder unsortedBuilder;
    StringBuilder sortedBuilder;
	public UnsortedCarList unSorted;


    public CarGUI(String title)
    {
    
    	super(title);
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setLocation(400, 200);
        this.setLayout(new  GridLayout(1, 2)); // set the layout

        // Create file menu objects
        //* creates variable in which is displayed i file
        JMenuItem open = new JMenuItem("Open");
        JMenuItem quit = new JMenuItem("Quit");
        JMenuItem search = new JMenuItem( "Search");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu fileEdit = new JMenu("Edit");
        FileMenuHandler fmh = new FileMenuHandler(this);
        EditMenuHandler emh = new EditMenuHandler(this);

        // Add the action listener to the menu items
        // * when press on the word it goes to handler and gives result
        open.addActionListener(fmh);
        quit.addActionListener(fmh);
        search.addActionListener(emh);     
       
        // Add the menu items to the file menu
        // *show the variable on line 24 - 28 to user
        fileMenu.add(open);
        fileMenu.addSeparator();
        fileMenu.add(quit);       
        
        fileEdit.add(search);
        
        // Add file menu to the menu bar, and set this gui's
        // menu bar to the menuBar we created above
        menuBar.add(fileMenu);
        menuBar.add(fileEdit);
        this.setJMenuBar(menuBar);
        this.setJMenuBar(menuBar);
        
       	this.unsortedBuilder = new StringBuilder();
        this.sortedBuilder  = new StringBuilder();
        
        // left = unsorted
        // right = sorted
       this.leftTextArea = new JTextArea(this.unsortedBuilder.toString(), 13, 4);
       this.rightTextArea =new JTextArea(this.sortedBuilder.toString(), 13, 4);

        // Add the JTextArea's to the content pane
       // generate two columns 
       this.getContentPane().add(this.leftTextArea);
       this.getContentPane().add(this.rightTextArea);

        
        
     
        
    }
    
   

    public void displayCar(UnsortedCarList unSorted, SortedCarList Sorted)
    {
        
    	this.unsortedBuilder = new StringBuilder("Unsorted:\n");
        this.sortedBuilder  = new StringBuilder("Sorted:\n");

    	
     
    	String getunSorted = null;
    	String getSorted = null;
    	getunSorted = unSorted.toString();
    	getSorted = Sorted.toString();
    	this.unsortedBuilder.append(getunSorted + "\n");
    	this.sortedBuilder.append(getSorted + "\n");
    	this.leftTextArea.setText(this.unsortedBuilder.toString());
        this.rightTextArea.setText(this.sortedBuilder.toString());
       
    }



    public void showgui()
    {
        this.pack();
        this.setVisible(true);
    }

}  
