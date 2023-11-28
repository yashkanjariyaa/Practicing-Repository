
import java.util.*;
public class exp4_2 {
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);

Vector<String> vector = new Vector<>();

System.out.print("Enter the number of strings to add: "); 
int n = scanner.nextInt();

// Add n strings to the vector
 for (int i = 0; i < n; i++) {
System.out.print("Enter a string to add: ");
 String str = scanner.next();
 vector.add(str);
}
System.out.print("Enter a string to check and add/delete: ");
 String newString = scanner.next();

if (vector.contains(newString)) { 
vector.remove(newString);
System.out.println("String removed from the vector.");
}else {
vector.add(newString);
System.out.println("String added to the vector.");
}

System.out.println("Updated vector: " + vector);
}
}
