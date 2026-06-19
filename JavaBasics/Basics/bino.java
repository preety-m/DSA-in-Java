public class bino {
    public static int binomial(int n,int r){
        int factN=factn(n);
        int factR=factr(r);
        int factNR=factn(n-r);
        return factN/(factR*factNR);

    }
    public static int factn(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;

    }
    public static int factr(int r){
        int fact=1;
        for(int i=1;i<=r;i++){
            fact*=i;
        }
        return fact;


    }
    public static int factnr(int n,int r){
        int fact=1;
        for(int i=1;i<=n-r;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n=5;
        int r=3;
        System.out.println("Binomial coefficient C("+n+","+r+") is :"+binomial(n,r));
    }
}
// Alternative recursive approach
// public class bino{
// public static int binomial(int n, int r) {
//     if (r == 0 || r == n) {
//         return 1;
//     }
//     return binomial(n - 1, r - 1) + binomial(n - 1, r);
// }
// public static void main(String[] args) {
//     int n = 5;
//     int r = 2;
//     int result = binomial(n, r);
//     System.out.println("Binomial Coefficient C(" + n + ", " + r + ") = " + result);
// }
// }