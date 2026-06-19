//using kadane's algorithm --> TC=O(n)
import java.util.*;
public class maxSum3 {
    public static void kadane(int num[]){
        int curr=0;
        //int ms=Integer.MIN_VALUE;
        int ms=num[0];
        for(int i=0;i<num.length;i++){
            curr=curr+num[i];
            ms=Math.max(curr,ms);
            if(curr<0){
                curr=0;
            }
           
        }
       
        System.out.println("max sum is "+ ms);
    }
    public static void main (String args[]){
        int num[]={-3,-4,-1,-2,-3};
        kadane(num);
    }
    
}
