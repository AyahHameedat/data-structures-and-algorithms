package linkedList;

public class LinkedList<T> {

    Node headValue;

    public LinkedList(){
        this.headValue = null;
    }

    public void insertValue(T value ){
        //Node pointer = this.headValue;
        // head -> val / valNew -> Head.next(val) / head -> valNew

//        this.headValue = null;
        Node newValue = new Node(value);
        newValue.nextValue = this.headValue;
        this.headValue = newValue;
    }

    //Boolean
    public Boolean includesValue( T value )
    {
        Node pointer = this.headValue;
        boolean result = false;
        while (pointer != null) {
            if (pointer.value == value) {
                return true;
            }
            pointer = pointer.nextValue;
        }
        return false;
    }

    public String toString()
    {
        Node pointer = this.headValue;
        String result = "";

        while(pointer != null){
            result += "{" + pointer.value + "}->" ;
            pointer = pointer.nextValue;//50
        }
        return result + "NULL";
    }


}
