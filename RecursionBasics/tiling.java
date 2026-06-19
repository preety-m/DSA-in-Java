import java.util.*;
public class tiling {
    public static int tilingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //choice
        //horizontal
        int fnm1=tilingproblem(n-1);
        //vertical
        int fnm2=tilingproblem(n-2);
        int totalways=fnm1+fnm2;
        return totalways;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("number of ways :");
        System.out.println(tilingproblem(n));
        sc.close();

    }

}
