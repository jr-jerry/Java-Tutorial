package Evening_5_30Pm_JFSD;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class IntroDuctionSerialization {
    public static void main(String[] args)   {
        Employee amit=new Employee(24,"amit verma",24000L);
        String targetFile="Evening_5_30Pm_JFSD/target.txt"; //FileOutputStream 

        try(
            FileOutputStream fileOutputStream=new FileOutputStream(targetFile);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        ){
            // amit-->file Store -->
            objectOutputStream.writeObject(amit);
            System.out.println("Object Serialize Succesfully! ");

        }catch(IOException e){
            e.printStackTrace();
        }
        Employee.setCompanyName("Google");

        
        try(
             FileInputStream fileInputStream=new FileInputStream(targetFile);
             ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        ){
            System.out.println("Object Read Succesfully! ");
            Employee readObject=(Employee)objectInputStream.readObject();
            System.out.println(readObject);

        }catch(IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
class Employee implements Serializable{
    private static final long serialVersionUID=123L;
    private int age;
    private String empName;
    private static String companyName = "IBM";
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    private transient long salary;

    

    @Override
    public String toString() {
        return "Employee [age=" + age + ", empName=" + empName + ", salary=" + salary + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + "]";
    }

    public Employee(int age, String empName, long salary) {
        this.age = age;
        this.empName = empName;
        this.salary = salary;
    }
   
     
}
//[23,"amit verma"]-->#fasdlkfjas;dfjas;fjasd;fjasdl;fjasl;d

//#fasdlkfjas;dfjas;fjasd;fjasdl;fjasl;d--->obj[23,"amit verma"];
