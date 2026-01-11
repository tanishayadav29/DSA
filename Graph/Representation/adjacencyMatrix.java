package Graph.Representation;

public class adjacencyMatrix {
    public static void main(String[] args) {
        int vertices=3;
        int graph[][]=new int [vertices][vertices];
        graph[0][1]=1;
        graph[1][0]=1;
        graph[0][2]=1;
        graph[2][0]=1;
        graph[1][2]=1;
        graph[2][1]=1;
        for (int i=0; i<vertices;i++){
            for (int j=0; j<vertices;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
