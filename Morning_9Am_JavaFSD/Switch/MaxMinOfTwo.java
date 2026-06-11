public class MaxMinOfTwo {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        
        int check = n1 > n2 ? 1 : 0;

        switch (check) {
            case 1:
                System.out.println("n1 is greater " + n1);
                break;

            case 0:
                System.out.println("n2 is greater " + n2);
                break;
        }

    }
}