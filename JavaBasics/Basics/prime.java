
public class prime {
    public static void main(String[] args) {
        int num=22;
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
            }

        }
        if(isPrime==true){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
      
        }
    }

