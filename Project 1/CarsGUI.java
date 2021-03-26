/*
 * Trisha Espejo
 * Project 01
 * Section 11G
 * Due 3/18/2019
 * 
 */
 
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JFrame;


class CarsGUI extends JFrame
{
  
   
	private JTextArea leftTextArea;
    private JTextArea rightTextArea;
    private StringBuilder unsortedBuilder;
    private StringBuilder sortedBuilder;


    public CarsGUI(Cars[] unSorted, Cars[] Sorted, int a, int b)
    {

       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new  GridLayout(1, 2)); // set the layout


       this.unsortedBuilder = new StringBuilder("Unsorted:\n ");
       this.sortedBuilder  = new StringBuilder("Sorted:\n ");

       // left = unsorted
        // right = sorted
        this.leftTextArea = new JTextArea(this.unsortedBuilder.toString(), 13, 4);
        this.rightTextArea =new JTextArea(this.sortedBuilder.toString(), 13, 4 );

        // Add the JTextArea's to the content pane
        this.getContentPane().add(this.leftTextArea);
        this.getContentPane().add(this.rightTextArea); 
    }
        
    public void showgui()
    {
        this.pack();
        this.setVisible(true);
    }
    
    
    public void displayCar(Cars[] unsorted, Cars[] sorted, int a, int b)
    {
    	String getUnsorted = null;
        String getSorted = null;
        for ( int i = 0; i < a; i++)
        {

    		    getUnsorted = unsorted[i].toString();
        		this.unsortedBuilder.append (getUnsorted + " ");
        }
        for ( int j = 0; j < b; j++)
        {
        		getSorted = sorted[j].toString();
        		this.sortedBuilder.append (getSorted + " ");
        }
        this.leftTextArea.setText(this.unsortedBuilder.toString());
        this.rightTextArea.setText(this.sortedBuilder.toString());
    }
}      