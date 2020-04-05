public class SortedClockList extends ClockList {

    public SortedClockList() {
        // uses the constructor from the super class
        super();
    }

    public void add(Clock c) {

        ClockNode newNode = new ClockNode (c);
        ClockNode curNode = first;

        while(curNode.next!=null && curNode.next.data.getHours()<newNode.data.getHours()) {
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

}

