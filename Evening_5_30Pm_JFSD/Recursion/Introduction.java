public class Introduction{
    public static void main(String[] args){
        int c=1;
        c=increase(c);
        //c-->2
    }
    public static int increase(int c){
        if(c==10)return 10;
        return increase(c+1);
    }
}