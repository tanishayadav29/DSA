package extendedPrefixSum;

//whose left index sum= right index sum
//approach1
//create psum from left and another from right, the common element in both the arrays is equilibrium index

//approach2
//create and array which includes the sum of all the indices from left of that index excluding that index, also do the same for the right of the index. common element is the equilibrium index.

//approach3 below

public class equilibrium_Index {
    int solve(int[] arr){
        int total=0;
        int ls=0;
        for (int i=0; i<arr.length;i++){
            total+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            total-=arr[i];
            if (total==ls){
                return i;
            }
            ls+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        equilibrium_Index ob=new equilibrium_Index();
        int ans= ob.solve(new int[]{-3, 2, 4, -1});
        System.out.println("equilibirum index is:"+ans);
    }
}
