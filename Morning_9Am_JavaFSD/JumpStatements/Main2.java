package Morning_9Am_JavaFSD.JumpStatements;

public class Main2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a++;
            if (i == 3) {
                break;
            }
        }
        System.out.print(a);
    }
}

