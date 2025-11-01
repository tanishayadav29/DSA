package TwoPointer;

// given a sorted array and integer k, find any pair i,j such that A[i]+A[j]=k, and i!=j
public class addPairFind {
    public static void main(String[] args) {
        int [] A={-5,-2,1,8,10,12,15};
        int [] arr={0,0};
        int i=0;
        int j=A.length-1;
        int k=11;
        while(i<j){
            if (A[i]+A[j]<k){
                i++;
            }
            else if(A[i]+A[j]>k){
                j--;
            }
            else{
                arr[0]=i;
                arr[1]=j;
                break;
            }
        }
        System.out.println("i is: "+A[arr[0]]);
        System.out.println("j is: "+A[arr[1]]);
    }
}
