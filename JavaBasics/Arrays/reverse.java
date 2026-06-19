public class reverse {
    public static void reverseNumber(int num[]){

        int first=0;
        int last=num.length-1;
        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;     
            first++;
            last--;
        }

    }
    public static void main(String args[]){
        int num[]={1,4,75,89,40,50,44,12,10};
        reverseNumber(num);
        for(int i=0;i<num.length;i++){

            System.out.print(num[i]+" ");
        }
        System.out.println();

    }
}
