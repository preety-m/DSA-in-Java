class in_dec{
    public static void printdecreasing(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.print(n + " ");
    printdecreasing(n-1);
}
public static void printincreasing(int n){
    if(n==1){
        System.out.print(n + " ");
        return;
    }
    printincreasing(n-1);
    System.out.print(n + " ");
}
public static void main(String args[]){
    int n=10;
    printincreasing(n);
    System.out.println();
    printdecreasing(n);
}
}