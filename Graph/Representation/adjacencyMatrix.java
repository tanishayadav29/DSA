package Graph.Representation;
import java.util.*;

public class adjacencyMatrix {
    public static void main(String[] args) {
        int vertices=3;
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for (int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(2);
        graph.get(2).add(0);
        graph.get(1).add(2);
        graph.get(2).add(1);
        for (int i=0;i<vertices;i++){
            System.out.print(i+"->"+graph.get(i));
        }
    }
}
