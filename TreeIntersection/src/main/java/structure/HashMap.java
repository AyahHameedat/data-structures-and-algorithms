package structure;

import data.HashNode;

import java.util.*;

public class HashMap <K, V> {

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

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }


    private int hash(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;


//        System.out.println("The index of => " + key + " is => " + arrayIndex);

        return arrayIndex;
    }

    public boolean contain(K key) {
        int index = hash(key);

        HashNode<K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                return true;
            }
            head = head.getNext();
        }
        return false;
    }


    public void set(K key, V value) {

        int index = hash(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);

        while (head != null)
        {
            if(head.getKey().equals(key)){
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        size++;

        head = bucketArray.get(index);
        newNode.setNext(head);
        bucketArray.set(index, newNode);



//        if (head == null) {
//            bucketArray.set(index, newNode);
//            size++;
//        } else { // TODO: 5/11/22 We need to check for duplicate keys
//            // this is logic from class mate
//            while (this.contain(key)) {
//                while (head != null) {
//                    if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
//                        return;
//                    }
//                    head = head.getNext();
//                }
//                newNode.setNext(head.getNext());
//                head.setNext(newNode);
//                size++;
//            }
//        }
        // If load factor goes beyond threshold, then
        // double hash table size

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
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

    public V get(K key) {
        int index = hash(key);

        HashNode<K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key))
                return head.getValue();
            head = head.getNext();
        }

        return null;
//        return head.getValue();
    }


    public List<K> getKeys() {
        List temp = new ArrayList<>();

        for (int index = 0; index < bucketArray.size(); index++) {
            HashNode<K, V> head = bucketArray.get(index);

            while (head != null) {
                temp.add(head.getKey());
                head = head.getNext();
            }
        }
        return temp;
    }



    public String repeatedWords(String str) {

        HashMap<String,Integer> temp = new HashMap<>();

        str = str.replace(",","");
        str = str.replace(".","");
        str = str.replace("...","");


        str = str.toLowerCase();


        String[] result = str.split(" ");

        for (int i=0 ; i<result.length;i++){

            if(temp.get(result[i]) == null){
                temp.set(result[i], 1);
            }
            else
                return result[i];
        }
        return "There is no repeated word";
    }




    public boolean isUniqueChars(String str) {

        str = str.replaceAll("\\s+", "");
        HashSet<Character> temp = new HashSet<>();
        char[] array = str.toCharArray();

        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (temp.contains(array[index])) {
                return false;
            } else {
                temp.add(array[index]);
            }
        }

        return true;
    }






    ///////////////////////////////////////////////////





//
//    public ArrayList<ArrayList<String>> leftJoin(HashMap ht1, HashMap ht2) {
//        ArrayList<ArrayList<String>> result = new ArrayList<>();
//
//        Set ht1KeySet  = ht1.keySet();
//        for (Object key : ht1KeySet) {
//            ArrayList<String> strings = new ArrayList<>();
//
//            strings.add(String.valueOf(key));
//            strings.add(String.valueOf(ht1.get(key)));
//
//            if (ht2.containsKey(key)) {
//                strings.add(String.valueOf(ht2.get(key)));
//            } else {
//                strings.add(null);
//            }
//
//            result.add(strings);
//        }
//
//        return result;
//    }
//




    public <V extends Comparable<V>> ArrayList<V> treeIntersection(BinaryTree<V> tree1, BinaryTree<V> tree2) {
        ArrayList<V> response = new ArrayList<>();
        if (tree1.getRoot()==null || tree2.getRoot()==null) {
            return null;
        } else {
            List<V> inTree1 = tree1.preOrder(tree1.getRoot());
            System.out.println(inTree1);
            List<V> inTree2 = tree2.preOrder(tree2.getRoot());
            for (V val : inTree1) {
                if (inTree2.contains(val)) {
                    response.add(val);
                }
            }
            return response;
        }

    }





    public String repeatedWord(String str) {
        String[] inputStr = str.toLowerCase().replace(",", "").split(" ");
        HashMap<String, Integer> setOfWords = new HashMap<>();

        for (String s : inputStr) {
            if (setOfWords.contain(s)) {
                setOfWords.set(s, setOfWords.get(s) + 1); // word exists
                return s; //return the first word repeated
            } else
                // insert new word to set
                setOfWords.set(s, 1);
        }


        return "NoRepetition";
    }



}