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
}
