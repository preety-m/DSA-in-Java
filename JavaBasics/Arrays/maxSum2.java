//using prefix -->TC=O(n^2)
public class maxSum2 {
    public static void maxSumarr(int num[]){
    int maxsum=Integer.MIN_VALUE;
    int currsum=0;
    int prefix[]=new int[num.length];
    //calculate prefix array 
    prefix[0]=num[0];
    for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+num[i];
    }   

    for(int i=0;i<num.length;i++){
        int start=i;   
        for(int j=i;j<num.length;j++){
            int end=j;
    
            currsum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
            if(maxsum<currsum){
                maxsum=currsum;
            }

        }
    }
    System.out.println("Max sum of the subarrays  = "+ maxsum);  

}
public static void main(String args[]){
    int num[]={2,4,6,8};
    maxSumarr(num);
}
}

    

    

