public class pow_n{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);

    }

    //optimized 
    public static int optipower(int x,int n){
        if(n==0){
            return 1;
        }
        // int halfsq=optipower(x,n/2)*optipower(x,n/2); //tc-->O(n)
        int halfpow=optipower(x,n/2);
        int halfpowsq=halfpow*halfpow; //tc-->O(logn)
        if(n%2!=0){ 
            return x*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(optipower(x,n));


    }
} 
