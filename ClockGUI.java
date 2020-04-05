import javax.swing.*;
import java.awt.*;


public class ClockGUI extends JFrame {

    private JFrame myGUI;
    //private Clock [] cArr1;
    //private Clock [] cArr2;
    private TextArea text;
    private TextArea textArea2;
    private int size;

    public ClockGUI(SortedClockList Arr1, UnsortedClockList Arr2,int size) {
        //this.cArr1=Arr1;
        //this.cArr2=Arr2;
        this.size=size;
        this.text = new TextArea();      //unsorted array side, text area
        this.textArea2 = new TextArea(); //sorted array side, text area
        this.myGUI=new JFrame();
        this.createGUI(Arr1,Arr2);
        this.addText(Arr1,Arr2);
        myGUI.setVisible(true);
    }

    public void createGUI (SortedClockList Arr1, UnsortedClockList Arr2)
    {
        myGUI.setTitle("Clocks");
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.setSize(400,400);//width, height;
        myGUI.setLocation(100,100);//x, y);
        myGUI.setLayout(new GridLayout(1,2));
    }

    public void addText(SortedClockList Arr1, UnsortedClockList Arr2) {

        myGUI.getContentPane().add(text);      //add unsorted text box to the GUI window
        text.setEditable(false);
        text.setText("Unsorted: " + "\n");


        myGUI.getContentPane().add(textArea2); //add sorted text box to the GUI window
        textArea2.setEditable(false);
        textArea2.setText("Sorted: " + "\n");


        for (ClockNode i = Arr2.first; i != null; i = i.next) {            //adds the clocks from the areas to each text area
            text.append(i.data + "\n");
        }

        for (ClockNode i = Arr1.first; i != null; i = i.next) {            //adds the clocks from the areas to each text area
            textArea2.append(i.data + "\n");
        }

    }
}