import java.util.*;


public class Graph {

        private Map<Vertex, List<Vertex>> adjVertices;

        public Graph() {
            this.adjVertices = new HashMap<>();
        }

        public String  addVertex(String data) {
            Vertex vertex = new Vertex(data);
            adjVertices.putIfAbsent(vertex,new ArrayList<>());
            return adjVertices.toString();
        }

        public void addEdges( String data1, String data2)
        {
            Vertex vertex1 = new Vertex(data1);
            Vertex vertex2 = new Vertex(data2);

            adjVertices.get(vertex1).add(vertex2);
            adjVertices.get(vertex2).add(vertex1);
        }

        public void addEdges( String data1, String data2, int weight){
            Vertex vertex1 = new Vertex(data1, weight);
            Vertex vertex2 = new Vertex(data2, weight);

            adjVertices.get(vertex1).add(vertex2);
            adjVertices.get(vertex2).add(vertex1);
        }

        public List getVertices() {
            List<String> result = new ArrayList<>();
            for (Vertex vertex : adjVertices.keySet()) {
                result.add(vertex.toString());
                result.add(adjVertices.get(vertex).toString());
            }

            return result;
        }

//    get neighbors

        public Collection<List<Vertex>> getNeighbors(){
            return adjVertices.values();
        }


//    size

        public int getSize()
        {
            return adjVertices.size();
        }


        public String printGraph() {
            StringBuilder strBuilder = new StringBuilder();
            for (Vertex vertex : adjVertices.keySet()) {
                strBuilder.append(vertex);
                strBuilder.append(adjVertices.get(vertex));
            }

            return strBuilder.toString();
        }
}


