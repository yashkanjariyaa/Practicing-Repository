import java.util.*;
import java.lang;
class userAge {
    int age = 25;
    void method () {
        System.out.println("This is method of class userAge");
    }
}
public class deleteObject {
    public static void main(String args[]){
        userAge obj = new userAge();
        int userAge = obj.age;
        obj.method();
        System.out.println(userAge);
        obj = null;
        System.gc();
    }
}