public class LeftmostAndRightmostIndex {
    public static int bsearch(int arr[],int b, boolean isFirstIndex ){
        int l=0;
        int r=arr.length-1;
        int result=-1;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (arr[mid]==b){
                result = mid;
                if (isFirstIndex){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if (arr[mid]<b){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr={1,1,2,2,2,3,3,4,5};
        int b=2;
        int [] ans={-1,-1};
        ans[0]=bsearch(arr,b,true);
        ans[1]=bsearch(arr,b,false);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
