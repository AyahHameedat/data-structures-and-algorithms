import java.util.ArrayList;

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
}

//    public static void main(String args[]) {
//        int V = 4;
//        Graph g = new Graph(V);
//
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0);
//        g.addEdge(2, 3);
//
////        System.out.print(convetToMatrix());
//        System.out.println(g.convetToMatrix());
//        System.out.println(g.printGraph(g.convetToMatrix()));
//    }
//
//    public static class Graph {
//
//        private boolean adjMatrix[][];
//        private int numVertices;
//
//
//        // Initialize the matrix
//        public Graph(int numVertices) {
//            this.numVertices = numVertices;
//            adjMatrix = new boolean[numVertices][numVertices];
//        }
//
//        // Add edges
//        public void addEdge(int i, int j) {
//            adjMatrix[i][j] = true;
//            adjMatrix[j][i] = true;
//        }
//
//        // Remove edges
//        public void removeEdge(int i, int j) {
//            adjMatrix[i][j] = false;
//            adjMatrix[j][i] = false;
//        }
//
//        // Print the matrix
//        public ArrayList<String> convetToMatrix() {
////            ArrayList<ArrayList<String>> adj = new ArrayList<>();
//            ArrayList<String> adj
//                = new ArrayList<>();
//            StringBuilder s = new StringBuilder();
//            for (int i = 0; i < numVertices; i++) {
//                adj.add(i + ": ");
////                s.append(i + ": ");
//                for (boolean j : adjMatrix[i]) {
//                    adj.add((j ? 1 :0) + " ");
////                    s.append((j ? 1 : 0) + " ");
//                }
////                s.append("\n");
//                adj.add("\n");
//            }
////            return s.toString();
//            return adj;
//        }
//
//        public boolean printGraph(ArrayList<String> adj)
//        {
//            for (int i = 0; i < adj.size(); i++) {
//                System.out.println("\nAdjacency list of vertex"
//                        + i);
//                System.out.print("head");
//                for (int j = 0; j < adj.get(i).length(); j++) {
//                    System.out.print(" -> "
//                            + adj.get(i));
//                    System.out.println(adj.get(j));
//                }
//                System.out.println();
//            }
//            return false;
//        }
//
//    }
//
//}
//    public static void main(String[] args) {
//
//        int V = 7;
//
//        ArrayList<ArrayList<Integer>> adj
//                = new ArrayList<ArrayList<Integer>>(V);
//
//
////        addEdge(0, 1);
////        .addEdge(0, 2);
////        .addEdge(1, 2);
////        .addEdge(2, 0);
////        g.addEdge(2, 3);
//
////        ArrayList<String> letters
////                = new ArrayList<String>(){"a","b","c","d","e","f","g"};
//
//        for (int i = 0; i < V; i++)
//            adj.add(new ArrayList<Integer>());
//
////        Graph g = new Graph(V);
//
//        addEdge(adj, 0, 1);
//        addEdge(adj, 0, 4);
//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 3);
//        addEdge(adj, 1, 4);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 4);
//
//        System.out.print(toString(adj, ));
//
//        System.out.print(adj.toString());
//
//        printGraph(adj);
//
////        System.out.println();
//    }
//
//
//
//    // Initialize the matrix
//    // Add edges
//
//
//    // Remove edges
//
//    // Print the matrix
//    public String toString(boolean adjMatrix[][], int numVertices) {
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < numVertices; i++) {
//            s.append(i + ": ");
//            for (boolean j : adjMatrix[i]) {
//                s.append((j ? 1 : 0) + " ");
//            }
//            s.append("\n");
//        }
//        return s.toString();
//    }
//
////    public static void main(String args[]) {
////        Graph g = new Graph(4);
////
////        g.
////    }
//
//
////        System.out.println(new App().getGreeting());
////
////        HashMap<String, String> hashMap = new HashMap<>();
////        hashMap.set("JAVA", "JAVA");
////        hashMap.set("Amman", "Amman");
////        hashMap.set("Jordan", "Jordan");
////        hashMap.set("J", "J");
////        hashMap.set("Bob", "Bob");
////        hashMap.set("Carl", "Carl");
////
////        System.out.println("*******************************");
////        System.out.println(hashMap.contain("J"));
////        System.out.println(hashMap.contain("Aya"));
////
////        System.out.println("============");
////        System.out.println(hashMap.getKeys());
////        System.out.println(hashMap.get("Carl"));
////
////        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
////
////        System.out.println(hashMap.isUniqueChars("The quick brown fox jumps over the lazy dog"));
////        System.out.println(hashMap.isUniqueChars("I love cats"));
////        System.out.println(hashMap.isUniqueChars("Donald the duck"));
////
////
////        System.out.println("---------------------------CC31-----------------------------------)");
////
//////
////        System.out.println("kkkk");
////        System.out.println(hashMap.repeatedWord("The quick brown fox jumps over quick the lazy dog quick"));
////
////        System.out.println(hashMap.repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));
////
////        System.out.println(hashMap.repeatedWord("Once upon a time, there was a brave princess who..."));
////
////        System.out.println(hashMap.repeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
////    }
//
//
//// Adjacency Matrix representation in Java
//
////    public static class Graph {
//            private boolean adjMatrix[][];
//            private int numVertices;
////
////            // Initialize the matrix
////            public Graph(int numVertices) {
////                this.numVertices = numVertices;
////                adjMatrix = new boolean[numVertices][numVertices];
////            }
////
////            // Add edges
////            public static void addEdge(ArrayList<ArrayList<Integer> > adj,
////                                int u, int v)
////            {
////                adj.get(u).add(v);
////                adj.get(v).add(u);
////            }
////
//            public void addEdgeMat(ArrayList<ArrayList<Integer> > adj, int i, int j) {
//                adjMatrix[i][j] = true;
//                adjMatrix[j][i] = true;
//            }
////
////            // Remove edges
////            public void removeEdge(int i, int j) {
////                adjMatrix[i][j] = false;
////                adjMatrix[j][i] = false;
////            }
////
////            // Print the matrix
//            public String toString() {
//                StringBuilder s = new StringBuilder();
//                for (int i = 0; i < numVertices; i++) {
//                    s.append(i + ": ");
//                    for (boolean j : adjMatrix[i]) {
//                        s.append((j ? 1 : 0) + " ");
//                    }
//                    s.append("\n");
//                }
//                return s.toString();
//            }
////
////
////
////            public static List printGraph(ArrayList<ArrayList<Integer>> adj)
////            {
////                for (int i = 0; i < adj.size(); i++) {
////                    System.out.println("\nAdjacency list of vertex"
////                            + i);
////                    System.out.print("head");
////                    for (int j = 0; j < adj.get(i).size(); j++) {
////                        System.out.print(" -> "
////                                + adj.get(i).get(j));
////                    }
////                    System.out.println();
////                }
////                return adj;
////            }
//
//
//
//            // A utility function to add an edge in an
//            // undirected graph
//            public static void addEdge(ArrayList<ArrayList<Integer>> adj,
//                                int u, int v) {
//                adj.get(u).add(v);
//                adj.get(v).add(u);
//            }
//
//            // A utility function to print the adjacency list
//            // representation of graph
//            public static List printGraph(ArrayList<String> letters, ArrayList<ArrayList<Integer>> adj) {
//
//                List result = null;
//                for (int i = 0; i < letters.size(); i++) {
//                    System.out.println("\nAdjacency list of vertex"
//                            + i);
////                    System.out.print("head");
//                    for (int j = 0; j < adj.get(i).size(); j++) {
//                        System.out.print(" -> "
//                                + adj.get(i).get(j));
////                        adj.addAll(adj.get(i).get(j));
////                        result.add(adj.get(i).get(j));
//                    }
//                    System.out.println();
//                }
//                System.out.println("++++++++RESULT++++++++");
////                System.out.println(result);
//                return result;
//            }
//
//        }
//
