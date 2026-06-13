public class ProjectImplemenation {
    public static void main(String[] args) {
        Transaction t1=new Neft();
        t1.credit();
    }
}
abstract class Transaction{
    abstract void credit();
    abstract void debit();
}
class Upi extends Transaction{

    @Override
    void credit() {
        System.out.println("Credit proceed via upi");
    }

    @Override
    void debit() {
         System.out.println("Debit proceed via upi ");
    }
    
}
class Neft extends Transaction{

    @Override
    void credit() {
        System.out.println("Credit proceed via Neft ");
    }

    @Override
    void debit() {
       System.out.println("Debit proceed via Neft ");
    }
    
}