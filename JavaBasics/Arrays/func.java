//array as function arguments
//call by reference
import java.util.*;
public class func{
    public static void update(int marks[],int unchangeable){
        unchangeable=10;
       
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]){
        int marks[]={97,85,88};
        int unchangeable=5;
        update(marks,unchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(unchangeable);



    }
}