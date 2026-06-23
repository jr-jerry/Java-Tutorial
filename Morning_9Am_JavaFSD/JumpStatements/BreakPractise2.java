package Morning_9Am_JavaFSD.JumpStatements;

public class BreakPractise2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(i>1){
                    break;
                }
            }
            System.out.println("Hello");
        }
    }
}
