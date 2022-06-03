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


        return arrayIndex;
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


    public void set(K key, V value) {

        int index = hash(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);

        while (head != null) {
            if (head.getKey().equals(key)) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        size++;

        head = bucketArray.get(index);
        newNode.setNext(head);
        bucketArray.set(index, newNode);



        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else { // TODO: 5/11/22 We need to check for duplicate keys
            // this is logic from class mate
            while (this.contain(key)) {
                while (head != null) {
                    if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                        return;
                    }
                    head = head.getNext();
                }
                newNode.setNext(head.getNext());
                head.setNext(newNode);
                size++;
            }
        }
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


        if (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode(key)) {
                return head.getValue();
            }
        } else { // TODO: 5/11/22 We need to check for duplicate keys
            // this is logic from class mate
            while (head.getNext() == null) {
                return head.getValue();
            }
        }
        return null;
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

        String[] res = str.split(" ");
        HashMap<String, Integer> temp = new HashMap<>();
//        char[] array = str.toCharArray();
//        String[] spaces = str.split("");
//        HashSet<Character> second = new HashSet<>();
        int count = 0;


        if (res.length == 0) {
            System.out.println("null");
        }

        for (int index = 0; index < res.length - 1; index++) {
            String word = res[index];
            word = checking(word);
            if (temp.contain(word)) {
                temp.set(word, 1);
            } else
                return word;

        }
//            for(int j = index+1; j<res.length; j++) {
//                String secWord = res[j];
//                if(word.contains(secWord)) {
//                    temp.add(secWord);
//                    count++;
//                }
//                if(secWord.contains(word)) {
//                    temp.add(word);
//                    count++;
//                }
//
//            }
//
//        }
//        System.out.println(count);
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }
        return res[count];

    }

    public String checking(String str) {
        if (str.contains(",") || str.contains(";") || str.contains(".") || str.contains(" ")) {
            str = str.substring(0, str.length() - 1);
            System.out.println(str);
            System.out.println("jjjj");
        }
        else
            System.out.println("helo");
        return str;
    }


    public boolean isUniqueChars(String str) {

        str = str.replaceAll("\\s+", "");
        HashSet<Character> temp = new HashSet<>();
        char[] array = str.toCharArray();
//        String[] spaces = str.split("");
        int count = 0;


        if (str.length() == 0) {
            return false;
        }

        System.out.println(array.length);
//        System.out.println(spaces.length);
        for (int index = 0; index < str.length(); index++) {
            if (temp.contains(array[index])) {
                return false;
            } else {
                temp.add(array[index]);
            }
        }

        return true;
    }


}