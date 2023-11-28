import java.util.Scanner; class Staff {
    String code; String name;
    
    Staff(String c, String n) { code = c;
    name = n;
    }
    }
    
    class Teacher extends Staff { String sub;
    int exp;
    
    Teacher() {
    super("DJ:707", "Prof. Sudhir");
    }
    
    public void read() {
    Scanner sc = new Scanner(System.in);
     
    
     
    System.out.println("Enter Teacher Subject and Experience:"); 
    sub = sc.next();
    exp = sc.nextInt();
    }
    
    public void display() { System.out.println("**Teacher Information**"); 
    System.out.println("Code: " + code); 
    System.out.println("Name: " + name); 
    System.out.println("Teacher Subject: " + sub); 
    System.out.println("Teacher Experience: " + exp);
    }
    }
    
    class Typist extends Staff { int speed;
    int exp;
    
    Typist(int speed, int exp, String code, String name) { super(code, name);
    this.speed = speed; this.exp = exp;
    }
    }
    
    class Regular extends Typist { int sal;
    Scanner sc = new Scanner(System.in);
    
    Regular(int speed, int exp, String code, String name) { super(speed, exp, code, name);
    }
    
    public void read() {
    System.out.println("Enter salary of Regular Typist:"); sal = sc.nextInt();
    }
    
    public void display() {
    System.out.println("**Regular Typist Information**"); System.out.println("Code: " + code); System.out.println("Name: " + name); System.out.println("Typing Speed: " + speed); System.out.println("Experience: " + exp); System.out.println("Salary: " + sal);
    }
    }
    
    class Casual extends Typist {
     
    
     
    int sal;
    Scanner sc = new Scanner(System.in);
    
    Casual(int speed, int exp, String code, String name) { super(speed, exp, code, name);
    }
    
    public void read() {
    System.out.println("Enter salary of Casual Typist:"); sal = sc.nextInt();
    }
    
    public void display() {
    System.out.println("**Casual Typist Information**"); System.out.println("Code: " + code); System.out.println("Name: " + name); System.out.println("Typing Speed: " + speed); System.out.println("Experience: " + exp); System.out.println("Salary: " + sal);
    }
    }
    
    class Officer extends Staff { String dept;
    String grade;
    Scanner sc = new Scanner(System.in);
    
    Officer() {
    super("DJ:808", "Dr. Nilesh");
    }
    
    public void read() { System.out.println("Enter Officer Dept: "); dept = sc.next();
    System.out.println("Enter Officer Grade: "); grade = sc.next();
    }
    
    public void display() { System.out.println("**Officer Information**"); System.out.println("Code: " + code); System.out.println("Name: " + name);
    System.out.println("Officer Department: " + dept); System.out.println("Officer Grade: " + grade);
    }
    }
    
    class exp7_2 {
    public static void main(String args[]) {
     
    
     
    Teacher t = new Teacher(); t.read();
    t.display();
    Officer o = new Officer(); o.read();
    o.display();
    Regular r = new Regular(30, 10, "DJ:505", "Mr. Subhash"); r.read();
    r.display();
    Casual c = new Casual(25, 5, "DJ:404", "Mr. Rahul"); c.read();
    c.display();
    }
    }
    