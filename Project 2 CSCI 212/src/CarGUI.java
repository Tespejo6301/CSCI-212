/*
 * Trisha Espejo
 * Project 02
 * Section 11G
 * Due 4/08/2019
 * 
 */
 
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JFrame;


class CarGUI extends JFrame
{
  
   
	private JTextArea leftTextArea;
    private JTextArea rightTextArea;
    private StringBuilder unsortedBuilder;
    private StringBuilder sortedBuilder;


    public CarGUI(UnsortedCarList unSorted, SortedCarList Sorted, int a)
    {

       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new  GridLayout(1, 2)); // set the layout


       this.unsortedBuilder = new StringBuilder("Unsorted:\n");
       this.sortedBuilder  = new StringBuilder("Sorted:\n");

       // left = unsorted
        // right = sorted
        this.leftTextArea = new JTextArea(this.unsortedBuilder.toString(), a, 4);
        this.rightTextArea =new JTextArea(this.sortedBuilder.toString(), a, 4);

        // Add the JTextArea's to the content pane
        this.getContentPane().add(this.leftTextArea);
        this.getContentPane().add(this.rightTextArea); 
    }
        
    public void showgui()
    {
        this.pack();
        this.setVisible(true);
    }
    
    
    public void displayCar(UnsortedCarList unSorted, SortedCarList Sorted)
    {
    	
    	String getunSorted = null;
    	String getSorted = null;
    	getunSorted = unSorted.toString();
    	getSorted = Sorted.toString();
    	this.unsortedBuilder.append (getunSorted + "\n");
    	this.sortedBuilder.append (getSorted + "\n");
    	this.leftTextArea.setText(this.unsortedBuilder.toString());
        this.rightTextArea.setText(this.sortedBuilder.toString());
    }
}  
