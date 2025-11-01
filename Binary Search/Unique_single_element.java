public class Unique_single_element {
    public static int uniqueEle(int []A){
        int l=0;
        int r=A.length-1;
        while (l<=r){
            int mid=(l+r)/2;
            if ((mid==0 || A[mid-1]!=A[mid]) && (mid==A.length-1||A[mid+1]!=A[mid])){
                return A[mid];
            }
            if (mid==0|| A[mid-1]!=A[mid]){
                if (mid%2==0){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            else{
                if(mid%2==0){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,3,3,4,4,8,9,9,10,10};
        int ans= uniqueEle(arr);
        int a[]={8,8,3,3,7,9,9,1,1};
        int ans1= uniqueEle(a);
        System.out.println("the unique element is:"+ans);
        System.out.println();
        System.out.println("second array k liye answer is:"+ans1);
    }
}
