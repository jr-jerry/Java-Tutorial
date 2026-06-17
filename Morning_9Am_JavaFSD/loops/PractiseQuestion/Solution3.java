package Morning_9Am_JavaFSD.loops.PractiseQuestion;

public class Solution3 {
    public static void main(String[] args) {
        for(int row=5;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// 5 
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1 
// 1 
// 1 2 
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5 

//         1
//       1 2
//     1 2 3
//   1 2 3 4
// 1 2 3 4 5 
//            * 
//          * * 
//        * * * 
//      * * * * 
//    * * * * * 

// * * * * 1 
// * * * 1 2 
// * * 1 2 3
// * 1 2 3 4
// 1 2 3 4 5

// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2 
// 1 