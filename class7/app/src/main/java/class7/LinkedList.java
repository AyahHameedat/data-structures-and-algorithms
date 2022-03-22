package class7;

public class LinkedList<T> {

    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() { }

    public void insert(T value)
    {
        Node newValue = new Node(value);
        newValue.next = this.head;
        this.head = newValue;
    }

    /*
    The boundaries of containers are also available as queries lower and upper. For a LIST the value of lower is a constant 1.
    From the observation above it follows that a LIST (and a LINKED_LIST) cannot have elements at index 0 (or below).

    Resources => From Stackoverfolw
    Link : https://stackoverflow.com/questions/47045993/linked-list-indexing-from-0-not-1-possible
     */
    public String kthFromEnd(int k)
    {
        int length = 0;
        Node result = this.head;

        while(result != null)
        {
            result = result.next;
            length++;
        }

//        System.out.println("Length is => "+ length);

        if (length < k)
        {
            try {
                System.out.println("ERROR, K > Length");
            } catch(Exception e) {
                e.printStackTrace();
            }
//                throw new IllegalArgumentException("k is not invalid");
        }
        else {
            result = head;

            for (int i = 1; i < length - k + 1 ; i++) {
                result = result.next;
            }
            System.out.println(result.value);
        }
        return String.valueOf(result.value);
    }

    @Override
    public String toString() {
        Node<T> pointer = this.head;
        String result = "";
        while(pointer != null)
        {
            result += "{" +pointer.value +"}->";
            pointer = pointer.next;
        }
        return result + "X";
    }
}
