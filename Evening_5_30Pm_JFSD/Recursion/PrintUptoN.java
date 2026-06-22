public class PrintUptoN {
    public static int NumPrint(int n){
      
        if(n==11){
            return 0;
        }
        System.out.println(n);
       return NumPrint(n+1);
    }
    public static void main(String[] args) {
        NumPrint(1);
    }
}
