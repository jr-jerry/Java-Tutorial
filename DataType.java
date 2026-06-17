public class DataType{
    public static void main(String[] args){
        Student s1=new Student(24,"gautam");
        s1.sleep();
    }
}
class Student{
    private int age;
    private String name;

    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    public void sleep(){
        System.out.println("Student sleep");
    }
}