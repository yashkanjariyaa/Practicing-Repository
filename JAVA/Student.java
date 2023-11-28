import java.util.*;
    public class Student{
        int id, chem, phy, math, total;
        String name;
        public Student(int ID, int CHEM, int PHY, int MATH, int TOTAL, String NAME){
            id = ID;
            chem = CHEM;
            phy = PHY;
            math = MATH;
            total = TOTAL;
            name = NAME;
        }
        public static void main(String args[]){
            int Id, Chem, Phy, Math, N, Total;
            String Name;
            Scanner sc = new Scanner(System.in);
            Student s[];
                System.out.println("Enter the number of student's you want to record : ");
                N = sc.nextInt();
                s = new Student[N];
                for(int i=0; i < s.length; i++){
                    System.out.println("Enter "+(i+1)+" student's id");
                    Id = sc.nextInt();
                    System.out.println("Enter "+(i+1)+" student's name");
                    Name = sc.next();
                    System.out.println("Enter "+(i+1)+" student's marks in the following order - Chemistry, Physics, Maths");
                    Chem = sc.nextInt();
                    Phy = sc.nextInt();
                    Math = sc.nextInt();
                    Total = Chem + Phy + Math;
                    s[i] = new Student(Id, Chem, Phy, Math, Total, Name);
                }
                for(int i = 0; i<s.length -1; i++){
                    for(int j = 0; j<s.length -1; j++){
                        if(s[j].total < s[j+1].total){
                            Student temp = s[j];
                            s[j] = s[j+1];
                            s[j+1] = temp;
                        }
                    }
                }
                for(int i = 0; i<s.length; i++){
                    System.out.println(s[i].id + "\t" + s[i].name + "\t" + s[i].phy + "\t" + s[i].chem + "\t" + s[i].math +"\t" + s[i].total);
                }
        }
    }