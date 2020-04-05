public abstract class ClockList {

    //Instance Variables for ClockList
    protected ClockNode first,last;
    protected int length;

    /**
     * Default constructor for a ClockList
     * Creates an empty list
     */
    public ClockList() {
        first = null;
        last = null;
        length = 0;
    }//ClockList Constructor

    /**
     * Adds a ClockNode to the ClockList
     * @param c a Clock object with a hours, minutes, and seconds
     */
    public void append(Clock clock) {

        // create new ListNode with string d.
        ClockNode newNode= new ClockNode(clock);

        if(first == null)						//if there is no element, first and last element is added as the same node
        {
            this.first = newNode;
            this.last = newNode;
        }

        //make last ListNode
        last.next = newNode;
        //make LinkedList variable last point to the new node.
        last= newNode;
        length++;
    }


}//ClockList



