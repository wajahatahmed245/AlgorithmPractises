import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int vertex;
    private LinkedList<Integer> graphStructure[];

    public Graph(int vertex) {
        this.vertex = vertex;
        this.graphStructure = new LinkedList[this.vertex];

        for (int i = 0; i < this.vertex; i++) {
            this.graphStructure[i] = new LinkedList<Integer>();

        }

    }

    public void addEdge(Integer atVertex, Integer value) {
        this.graphStructure[atVertex].add(value);
        //undirected graph mn isay include kratya hain
        this.graphStructure[value].add(atVertex);

    }


    public void printGraph() {
        for (int i = 0; i < this.vertex; i++) {
            System.out.println("at vertex = " + i);
            for (Integer edges : this.graphStructure[i]) {

                System.out.println("->" + edges);
            }
            System.out.println(" ");
        }
    }

    public void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[this.vertex];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
//            Iterator<Integer> i = this.graphStructure[s].listIterator();
//            while (i.hasNext()) {
//                int n = i.next();
//                System.out.println(String.format("i is = %s and this.graphStructure[%s] size is %s and n is %s", i, s, this.graphStructure[s].size(), n));
//
//                if (!visited[n]) {
//                    visited[n] = true;
//                    queue.add(n);
//                }
//            }


            System.out.println("--------------for loop chal rha-------------------------");
            for (int itr = 0; itr < this.graphStructure[s].size(); itr++) {
                int n = this.graphStructure[s].get(itr);
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }

            }
        }

    }

}
