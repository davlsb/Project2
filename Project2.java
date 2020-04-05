import java.util.StringTokenizer;

public class Project2{

    public static void main(String[] args) {

        int size=0; //array size
        TextFileInput in; //the TextFileInput to read from the text file
        in = new TextFileInput(args[0]);
        String line = in.readLine(); // reading the first line

        UnsortedClockList unsorted = new UnsortedClockList(); //unsorted array of clocks
        SortedClockList sorted = new SortedClockList(); //sorted array of clocks

        while(line!=null){ //as long as we didn't reach the last line
            StringTokenizer Str = new StringTokenizer(line,":");
            if(Str.countTokens()==3) size++;
            line = in.readLine(); //read the line

        }

        in.close();
        in = new TextFileInput(args[0]);

        System.out.println("made");

        line=in.readLine(); //read the line

        while(line!=null) { //as long as we didn't reach the end of the file

            StringTokenizer Str = new StringTokenizer(line,":"); //tokenize the line based on :

            if(Str.countTokens()==3){            //if there are all 3 parts of the clock (hours, minutes, seconds)

                int hours=Integer.parseInt(Str.nextToken());   //first token is hours
                int minutes=Integer.parseInt(Str.nextToken()); //second token is minutes
                int seconds=Integer.parseInt(Str.nextToken()); //third token is seconds

                Clock clock = new Clock(hours,minutes,seconds); //create the clock instance based on the line
                System.out.println("We got here");
                unsorted.add(clock);
                System.out.print("GotHere1");
               //sorted.add(clock);

                System.out.print("GotHere2");
            }

            else System.out.println(line); //if it didn't have all 3 parts, print line to console
            line = in.readLine();
        }
        System.out.print("GotHere3");
        ClockGUI window = new ClockGUI(sorted,unsorted,size); //open GUI, window

        //window.setVisible(true);
        //window.show(cArr1,cArr2,size);
    }


}
