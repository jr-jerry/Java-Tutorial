package WE.pm2.Abstraction;
public class AbstractionExample2 {
    public static void main(String[] args){
        Shape obj=new Rectangle(10,20);
        obj.area();
        obj.display();
    }
}
abstract class Shape{
 abstract void area();
 abstract void display();
}
 
class Circle extends Shape{
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
    void display() {
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