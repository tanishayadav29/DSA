package Recursion;

public class power {
    //very simple basic approach
    static int solve1(int x,int a){
        if (a==0){
            return 1;
        }
        return x*solve1(x, a-1);
    }

    //2nd approach
    static int solve2(int x, int a){
        if (a==0){
            return 1;
        }
        if (a%2==0){
            return solve2(x, a/2)*solve2(x,a/2);
        }
        else{
            return solve2(x, a/2)*solve2(x,a/2)*x;
        }
    }

    //3rd approach
    static int solve3(int x, int a){
        if(a==0){
            return 1;
        }
        int p=solve3(x, a/2);
        if(a%2==0){
            return p*p;
        }
        else{
            return p*p*x;
        }
    }

    public static void main(String[] args) {
        
        int ans1=solve1(2,6);
        System.out.println("approch 1: "+ans1);
        System.out.println();
        
        int ans2=solve2(2,6);
        System.out.println("approch 2: "+ans2);
        System.out.println();
 
        int ans3=solve3(2,6);
        System.out.println("approch 3: "+ans3);
        System.out.println();
    }
}
