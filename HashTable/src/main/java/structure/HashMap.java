package structure;

import data.HashNode;

import java.util.ArrayList;
import java.util.Objects;

public class HashMap <K, V>{

    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        buckets = 10;

        // init bucket array to prevent index out of
        // bounds exception for first time insert / retrieval
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    private int hashCode(K key){
        return Objects.hashCode(key);
    }


    private int hash(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;
        

        System.out.println("The index of => " + key + " is => " + arrayIndex);

        return arrayIndex;
    }


    public void set(K key, V value) {

        int index = hash(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);


        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else { // TODO: 5/11/22 We need to check for duplicate keys
            // this is logic from class mate
//            while(newNode.contains(key) > 1 ){
//            while (head != null) {
//                if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
////                    return head.getValue();
//                }
//                head = head.getNext();
//            }
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
            }

        // If load factor goes beyond threshold, then
        // double hash table size

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }



    public boolean contain(K key) {
        int index = hash(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                return true;
            }
            head = head.getNext();
        }
        return false;
    }


}
