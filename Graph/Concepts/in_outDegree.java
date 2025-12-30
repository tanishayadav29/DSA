package Graph.Concepts;

public class in_outDegree {
    public static void main(String[] args) {
        int v=5;
        int [][] edges= {
            {0,1},
            {0,2},
            {1,2},
            {2,3},
            {3,4}
        };
        int [] indeg= new int [v];
        int [] outdeg= new int[v];

        for(int [] edge: edges){
            int from=edge[0];
            int to= edge[1];
            outdeg[from]++;
            indeg[to]++;
        }

        for(int i=0; i<v;i++){
            System.out.println(i+"->"+"out degree is: "+outdeg[i]+" in degree is: "+indeg[i]);
        }
    }
}
