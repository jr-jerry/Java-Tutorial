package WE.pm2.Abstraction;
public class AbstractionExample2 {
    public static void main(String[] args){
        Shape obj=new Rectangle(10,20);
        obj.area();
        obj.display();
    }
}
interface Shape2{
    //by default saare method h abstract method hote hai!
    void area();
    void display();    
}
abstract class Shape{
 abstract void area();
 abstract void display();
 void m1(){
    System.out.println("Shape method ");
 }
}

class Circle implements Shape2{
    int radius;
    double cirArea;
    public Circle(int radius) {
        this.radius = radius;
    }
   
    // area();
    @Override
    public void area(){
         cirArea=3.14*radius*radius;
    }
    @Override
    public void display() {
         System.out.println("area of circle "+cirArea);
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int recArea;
    @Override
    public void area(){
        recArea=length*breadth;
    }
    @Override
    void display() {
        System.out.println("Area of reactangle "+recArea);
    }
}