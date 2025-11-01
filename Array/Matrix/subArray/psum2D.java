package Matrix.subArray;



class psum2D{
    static void psum(int [][] arr,int [][] psum_arr,int rows, int cols){
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (i==0 && j==0){
                    psum_arr[i][j]=arr[i][j];
                }
                else if (i==0){
                    psum_arr[i][j]= arr[i][j]+psum_arr[i][j-1];
                }
                else if (j==0){
                    psum_arr[i][j]=arr[i][j]+psum_arr[i-1][j];
                }
                else{
                    psum_arr[i][j]=arr[i][j]+psum_arr[i-1][j]+psum_arr[i][j-1]-psum_arr[i-1][j-1];
                }
            }
        }
    }
    static void display(int [][] psum_arr,int r, int c){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(psum_arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int [][] arr= {{1,2},
                        {3,4}};
        int [][] psum_arr= {{0,0},
                       {0,0}};
        psum(arr,psum_arr,2,2);
        display(psum_arr,2,2);
        
    }
}