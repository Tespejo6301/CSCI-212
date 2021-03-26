/*
 * Trisha Espejo
 * Project 03
 * Section 11G
 * Due 4/29/2019
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
    private StringBuilder unsortedBuilder;
    private StringBuilder sortedBuilder;


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
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        FileMenuHandler fmh = new FileMenuHandler(this);

        // Add the action listener to the menu items
        // * when press on the word it goes to handler and gives result
        open.addActionListener(fmh);
        quit.addActionListener(fmh);
        
        // Add the menu items to the file menu
        // *show the variable on line 24 - 28 to user
        fileMenu.add(open);
        fileMenu.addSeparator();
        fileMenu.add(quit);
        
        // Add file menu to the menu bar, and set this gui's
        // menu bar to the menuBar we created above
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
 
    }
    
   

    public void displayCar(UnsortedCarList unSorted, SortedCarList Sorted, int count)
    {
    	
    	this.unsortedBuilder = new StringBuilder("Unsorted:\n");
        this.sortedBuilder  = new StringBuilder("Sorted:\n");

        // left = unsorted
         // right = sorted
        this.leftTextArea = new JTextArea(this.unsortedBuilder.toString(), count, 4);
        this.rightTextArea =new JTextArea(this.sortedBuilder.toString(), count, 4);

         // Add the JTextArea's to the content pane
        this.getContentPane().add(this.leftTextArea);
        this.getContentPane().add(this.rightTextArea); 
    	
     
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
