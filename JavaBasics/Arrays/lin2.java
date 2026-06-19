// linear search
public class lin2 {
    public static int linearSearch(String menu[],String key ){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){ // for string comparison use equals function
                return i;
            }
        }
        return -1;

    }
    

public static void main(String args[]){
   
    String menu[]={"apple","banana","mango","grapes"};
    String key= "mango";
    int index= linearSearch(menu,key);
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("key found at index "+index);
    }


}
}

    

