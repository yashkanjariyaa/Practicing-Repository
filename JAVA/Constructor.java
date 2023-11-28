public class Constructor { static int count=0; public Constructor(){
    count++;
    }
    static void display(){
    System.out.println("The number of objects are: "+count);
    }
    public static void main(String[] args) { Constructor obj1=new Constructor(); Constructor obj2=new Constructor(); Constructor obj3=new Constructor(); display();
    }
    }
    