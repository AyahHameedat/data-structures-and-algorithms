import java.util.ArrayList;
import data.BTNode;
import structure.BinaryTree;
import structure.HashMap;
import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }


    public static void main(String[] args) {
        // Creating a graph with 5 vertices
        int[][] a = {{0, 0, 1},
                {0, 0, 1},
                {1, 1, 0}};

        // function to convert adjacency
        // list to adjacency matrix
        ArrayList<ArrayList<Integer>> adjListArray = Graph.convert(a);
        System.out.println("Adjacency List: ");

        Graph.printArrayList(adjListArray);
    }

    public static class Graph {

        // A utility function to add an edge in an
        public static ArrayList<ArrayList<Integer>> convert(int[][] a) {
            // no of vertices
            int l = a[0].length;
            char[] let = {'a','b','c','d','e'};
            ArrayList<ArrayList<Integer>> adjListArray
                    = new ArrayList<ArrayList<Integer>>(l);

            for (int i = 0; i < l; i++) {
                adjListArray.add(new ArrayList<Integer>());
            }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.set("JAVA", "JAVA");
        hashMap.set("Amman", "Amman");
        hashMap.set("Jordan", "Jordan");
        hashMap.set("J", "J");
        hashMap.set("Bob", "Bob");
        hashMap.set("Carl", "Carl");

        System.out.println(hashMap.hashCode());

        System.out.println("*******************************");
        System.out.println(hashMap.contain("J"));
        System.out.println(hashMap.contain("Aya"));

        System.out.println("============");
        System.out.println(hashMap.getKeys());
        System.out.println(hashMap.get("Carl"));



        BinaryTree<Integer> BinTree1 = new BinaryTree<>();
        BinTree1.setRoot(new BTNode(15));

        BinTree1.getRoot().setLeft(new BTNode(8));
        BinTree1.getRoot().setRight(new BTNode(20));

        BinTree1.getRoot().getRight().setRight(new BTNode(35));
        BinTree1.getRoot().getRight().setLeft(new BTNode(22));



        BinaryTree<Integer> BinTree2 = new BinaryTree<>();
        BinTree2.setRoot(new BTNode(20));

        BinTree2.getRoot().setLeft(new BTNode(8));
        BinTree2.getRoot().setRight(new BTNode(20));

        BinTree2.getRoot().getRight().setRight(new BTNode(35));
        BinTree2.getRoot().getRight().setLeft(new BTNode(62));

            int i, j;
            for (i = 0; i < a[0].length; i++) {
                for (j = 0; j < a.length; j++) {
                    if (a[i][j] == 1) {
                        adjListArray.get(i).add(j);
                    }
                }
            }

            return adjListArray;
        }

        // Function to print the adjacency list
        public static void printArrayList(ArrayList<ArrayList<Integer>>
                                                  adjListArray) {
            // Print the adjacency list
            for (int v = 0; v < adjListArray.size(); v++) {
                System.out.print(v);
                for (Integer u : adjListArray.get(v)) {
                    System.out.print(" -> " + u);
                }
                System.out.println();
            }
        }

    }


        System.out.println(hashMap.repeatedWord("Once upon a time, there was a brave princess who..."));
        System.out.println(hashMap.repeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way ??? in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
        System.out.println(hashMap.repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn???t know what I was doing in New York..."));


        System.out.println("--------------------TREE-------------------");

        System.out.println(hashMap.treeIntersection(BinTree1, BinTree2));


        System.out.println("------------LEFT JOIN -----------------");


        HashMap<String, String> hash1 = new HashMap<>();
        hash1.set("fond", "enamored");
        hash1.set("wrath", "anger");
        hash1.set("diligent", "employed");
        hash1.set("outfit", "garb");
        hash1.set("guide", "usher");

        HashMap<String, String> hash2 = new HashMap<>();
        hash2.set("fond", "averse");
        hash2.set("something", "delight");

        System.out.println(hashMap.leftJoin(hash1,hash2));

    }

}