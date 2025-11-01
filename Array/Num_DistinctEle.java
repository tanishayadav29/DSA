//wap to find number of distinct element in an array
public class Num_DistinctEle {
    public static void main(String[] args) {
        int[] arr={3,3,6,5,4,6,7,8,10,10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean isDup=false;
            for(int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    isDup=true;
                    break;
                }
            }
            if (!isDup){
                count++;
            }
        }
        System.out.println("number of distinct elements in array is:"+count);
    }
}
