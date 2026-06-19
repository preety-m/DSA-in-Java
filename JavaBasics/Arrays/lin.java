// linear search
public class lin {
    public static int linearSearch(int num[],int key ){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }
    

public static void main(String args[]){
    int num[]={1,2,45,9,7,5,3};
    int key= 20;
    int index= linearSearch(num,key);
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("key found at index "+index);
    }


}
}
