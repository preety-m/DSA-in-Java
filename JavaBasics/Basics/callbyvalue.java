public class callbyvalue {
    public static void Changea(int a){
        a=10;
    }
    public static void main(String[] args) {
        int a=5;
        Changea(a);
        System.out.println(a);
       
    }
}
