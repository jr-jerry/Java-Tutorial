package Morning_9Am_JavaFSD.JumpStatements;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > 1){
                    continue;
                }                    
                System.out.println("Hi");
            }
        }
    }
}
// i-0
// j-0,1,2,3

// i-1
// j-0,1,2,3

// i-2
// j-0,1,2,3 

// i-3
// j-0,1,2,3

// i-4
// j-0,1,2,3