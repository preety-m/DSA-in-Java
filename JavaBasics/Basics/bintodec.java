import java.util.*;
public class bintodec{
    public static int binarytodec(int n){
        int dec=0;
        int power=0;
        while(n>0){
            int lastdigit=n%10;
            dec=dec+ lastdigit* (int)Math.pow(2,power);
            n=n/10;
            power++;
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in binary(0 or 1):");
        int n=sc.nextInt();
        int dec=binarytodec(n);
        System.out.println("The decimal value is:"+dec);
         sc.close();
    }
   
}