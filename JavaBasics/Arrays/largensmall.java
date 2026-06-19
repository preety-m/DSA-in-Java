public class largensmall {
    public static int getLargest(int num[] ){

        int largest= Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest< num[i]){
                largest=num[i];

            }
        }
        return largest;
    }
    public static int getSmallest(int num[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int num[]={1,2,7,9,11,25,3,5,24};
        int largest= getLargest(num);
        int smallest=getSmallest(num);
        System.out.println("smallest value is "+smallest);
        System.out.println("largest value is "+largest);

    }

}

