import java.util.*;
import java.lang.*;
class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String error){
        super(error);
    }
}
public class customexcep{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try{
            check(marks);
        }catch(MarksOutOfBoundException e){
            System.out.println(e);
        }
    }
    public static void check(int input) throws MarksOutOfBoundException{ 
        if(input>100 || input<0){
            throw new MarksOutOfBoundException("Invalid marks entered");
        }
    }
}