import java.util.*;

class Staff {
    int code;
    String name;
    Staff(int staffCode, String staffName){
        code = staffCode;
        name = staffName;
    }
}
class Teacher extends Staff {
    int exp;
    String sub;
    Scanner sc = new Scanner(System.in);
    Teacher(){
        super(2134, "Prof. Hezal");
    }
    void read(){
        System.out.println("Enter Teacher's exp");
        exp = sc.nextInt();
        System.out.println("Enter Teacher's subject");
        sub = sc.next();
    }
    void display(){
        System.out.println("Teacher's name is "+ name);
        System.out.println("Teacher's code is "+ code);
        System.out.println("Teacher's experience is "+ exp);
        System.out.println("Teacher's subject is "+ sub);
    }
}
class Officer extends Staff {
    int grade;
    String dept;
    Scanner sc = new Scanner(System.in);
    Officer(){
        super(1245, "Dr. Verma");
    }
     void read(){
        System.out.println("Enter Officer's grade");
        grade = sc.nextInt();
        System.out.println("Enter Officer's dept");
        dept = sc.next();
    }
    void display(){
        System.out.println("Officer's name is "+ name);
        System.out.println("Officer's code is "+ code);
        System.out.println("Officer's dept is "+ dept);
        System.out.println("Officer's grade is "+ grade);
    }
}
class Typist extends Staff {
    int speed;
    int exp;
    Typist(int staffCode, String staffName, int staffSpeed, int staffExp){
        super(staffCode, staffName);
        speed = staffSpeed;
        exp = staffExp;
    }
}
class Regular extends Typist {
    int sal;
    int Speed;
    int Exp;
    Scanner sc = new Scanner(System.in);
    Regular(int speed, int exp){
        super(1234, "Piyush Bansal", speed, exp);
    }
    void read(){
        System.out.println("Enter Typist's salary");
        sal = sc.nextInt();
    }
    void display(){
    System.out.println("Typist's name is "+ name);
    System.out.println("Typist's code is "+ code);
    System.out.println("Typist's speed is "+ speed);
    System.out.println("Typist's exp is "+ exp);  
    System.out.println("Typist's Salary is "+sal); 
    }
}
class Casual extends Typist {
    int daily_wage;
    int Speed;
    int Exp;
    Scanner sc = new Scanner(System.in);
    Casual(int speed, int exp){
        super(1234, "Piyush Bansal", speed, exp);
    }
    void read(){
        System.out.println("Enter Typist's daily wage");
        daily_wage = sc.nextInt();
    }
    void display(){
    System.out.println("Typist's name is "+ name);
    System.out.println("Typist's code is "+ code);
    System.out.println("Typist's speed is "+ speed);
    System.out.println("Typist's exp is "+ exp); 
    System.out.println("Typsit's daily wage is"+daily_wage);
    }
}
public class myclass{
    public static void main(String[] args){
        Teacher obj = new Teacher();
        obj.read();
        obj.display();
        Officer obj1 = new Officer();
        obj1.read();
        obj1.display();
        Regular obj2 = new Regular(200, 2);
        obj2.read();
        obj2.display();
        Casual obj3 = new Casual(300, 3);
        obj3.read();
        obj3.display();
    }
}