import java.util.*;
public class exp5_5 {
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Students: "); 
int n=sc.nextInt();
Student temp=new Student(); Student[] s=new Student[n]; 
for(int i=0;i<n;i++){
s[i]=new Student();
}
for(int i=0;i<n;i++){
     System.out.println("Enter name: ");
      s[i].name=sc.next();
       System.out.print("Enter roll no: ");
        s[i].roll = sc.nextInt();
System.out.print("Enter marks scored in physics,chem and maths: ");
s[i].p = sc.nextInt();
s[i].c = sc.nextInt();
s[i].math = sc.nextInt();
s[i].total = s[i].p + s[i].c + s[i].math;
}
for(int i=1;i<n;i++){ if(s[i].total>s[i-1].total){
temp = s[i]; s[i] = s[i-1]; s[i-1] = temp;
}
}
System.out.println("Name\tRoll\tPhy\tChem\tMaths\ttotal"); for(int i = 0; i<n; i++){
System.out.println(s[i].name + "\t" + s[i].roll + "\t" + s[i].p
+ "\t" + s[i].c + "\t" + s[i].math + "\t" + s[i].total);
}
}
}
class Student{ String name;
int roll,p,c,math,total;
}
