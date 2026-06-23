package Morning_9Am_JavaFSD.JumpStatements;

public class IntroductionBreak {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                // loop will stop at 5
                break;
            }
            System.out.println(i);
        }
    }
}
