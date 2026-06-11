package Evening_5_30Pm_JFSD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDeserialization {
    public static void main(String[] args) {
        Student amit=new Student(23, "Amit yadav", 12);
        try(
            FileOutputStream fileOutputStream=new FileOutputStream("Evening_5_30Pm_JFSD/store.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(amit);

        }catch(Exception e){
            e.printStackTrace();
        }

        try(
            FileInputStream fileInputStream=new FileInputStream("Evening_5_30Pm_JFSD/store.txt");
            ObjectInputStream ObjectInputStream=new ObjectInputStream(fileInputStream);
        ){  
           Student readObject=(Student) ObjectInputStream.readObject();
           System.out.println(readObject);
           System.out.println("Object Deserilized");

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Object Succesfully Serialized into ByteStream");
    }
}
class Student implements Serializable{
    private static final long serialVersionUID=12345L;
    private int age;
    private String name;
    private static String school="DPS";
    private transient int clss;
    public Student(int age, String name, int clss) {
        this.age = age;
        this.name = name;
        this.clss = clss;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", clss=" + clss + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + "]";
    }
    
}
