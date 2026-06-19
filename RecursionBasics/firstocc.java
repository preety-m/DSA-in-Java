public class firstocc {
    public static int first_occurence(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occurence(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,5,4,6,7};
        int key=5;
        System.out.println(first_occurence(arr,0,key));
    }
}
 