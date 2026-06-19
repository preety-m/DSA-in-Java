//TC: O(n)
//SC: O(n)  //for function call stack
public class facto {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factnm1=fact(n-1);
        int factn=n*factnm1;
        return factn;
    }
    public static void main(String args[]){
        int n=7;
        System.out.println(fact(n));
    }
}
