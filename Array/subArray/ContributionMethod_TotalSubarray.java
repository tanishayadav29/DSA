package subArray;

public class ContributionMethod_TotalSubarray {
    static void brute(int[]arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                for (int k=i;k<=j;k++){
                    sum+=arr[k];
                }
            }
        }
        System.out.println(sum);
    }

    static void contri(int[]arr){
        int contri;
        int total=0;
        for (int i=0; i<arr.length;i++){
            contri= (i+1)*(arr.length-i)*arr[i];
            total+=contri;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int[] arr={7,5,4,2};

        System.out.println("using brute force:");
        brute(arr);

        System.out.println("using contribution method:");
        contri(arr);
    }
}
