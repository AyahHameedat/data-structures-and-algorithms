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


        public List<Vertex> getAdjVertices(String data){
            return adjVertices.get(new Vertex(data));
        }

            // breadth first

        public Set<String> bfs(String root){
            Set<String> visited = new LinkedHashSet<>();
            Queue<String> queue = new LinkedList<>();
            queue.add(root);
            visited.add(root);
            while (!queue.isEmpty()){
                String vertex = queue.poll();
                for(Vertex v : getAdjVertices(vertex)){
                    if(!visited.contains((v.data)))
                    {
                        queue.add(v.data);
                        visited.add(v.data);

                    }
                }
            }
            return visited;
        }




    public String printGraph() {
            StringBuilder strBuilder = new StringBuilder();
            for (Vertex vertex : adjVertices.keySet()) {
                strBuilder.append(vertex);
                strBuilder.append(adjVertices.get(vertex));
            }

            return strBuilder.toString();
        }


        public String businessTrip (Graph<T> graph, Vertex<T>[] cities)
        {
         int cost = 0;
         boolean flag = false;

            for (Vertex<T> ver: cities) {
                if(!graph.getVertices().contains(ver))
                    return "false, $0";
            }


            for (int i = 0; i < cities.length -1; i++) {
                flag = false;
                for (Edge<T> e: graph.getNeighbors(cities[i]) {

                    if(e.vertex.value.equals(cities[i+1].value))
                    {
                        cost += e.wighet;
                        flag = true;
                        break;
                    }
                }

                if(!flag)
                {
                    return "false, $0";
                }
            }
            return flag + ".$" + cost;
        }


}


