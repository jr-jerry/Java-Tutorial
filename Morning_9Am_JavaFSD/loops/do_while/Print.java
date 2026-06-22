import java.util.Scanner;
public class Print{
    public static void main(String[] args) {
        int n=0;
        System.out.println("enter a value \n");
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        int i=1;
        do{
            System.out.println("*");
            i++;
        }while(i<=n);

        sc.close();
    }
}