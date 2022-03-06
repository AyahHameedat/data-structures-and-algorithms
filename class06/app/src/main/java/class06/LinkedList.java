package class06;

public class LinkedList<T> {

    Node headValue;

    public LinkedList(){
        this.headValue = headValue;
    }

    public void insertValue( T value ){
        //Node pointer = this.headValue;
        // head -> val / valNew -> Head.next(val) / head -> valNew

//        this.headValue = null;
        Node newValue = new Node(value);
        newValue.nextValue = this.headValue;
        this.headValue = newValue;
    }

    public void append(T value)
    {
        Node newValue = new Node(value);
        if(headValue == null) {
            headValue = newValue;
        }
        else
        {
            Node tail = headValue;
            while(tail.nextValue != null){
                tail = tail.nextValue;
            }
            tail.nextValue = newValue;
        }
    }


    public void insertAfter(T oldValue, T newValue)
    {
        Node prevNode = new Node(oldValue);
//        oldValue = headValue.nextValue;
        //Node prevNode = new Node(value);
        if (prevNode == null)
        {
            System.out.println("HI, Its null");
        }
        System.out.println("YOSHI");
        Node newNode = new Node(newValue);
        newNode.nextValue = prevNode.nextValue;
        prevNode.nextValue = newNode;

    }


    public String toString()
    {
        Node pointer = this.headValue;
        String result = "";

        while(pointer != null){
            result += "{" + pointer.value + "}->" ;
            pointer = pointer.nextValue;//50
        }

        return result;
    }

}

