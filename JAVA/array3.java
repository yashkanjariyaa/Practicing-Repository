import java.util.*;
	public class array3{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);		
		int no_students = 3;
		int no_subjects = 3;
		int student[][] = new int[no_students][no_subjects];
		int sum[] = new int[no_students];
		int i,j,g1,g2,g;
		
			for(i=0;i<no_students;i++){
				System.out.println("Enter student "+(i+1)+" details");
				for(j=0;j<no_subjects;j++){
					System.out.println("Enter roll no. "+(i+1)+" student's "+(j+1)+" subject's marks");
					student[i][j] = sc.nextInt();
					sum[i] += student[i][j];
					}
				}
			
			g1 = (sum[0]>sum[1])?sum[0]:sum[1];
			g2 = (sum[2]>sum[1])?sum[2]:sum[1];
			g = (g1>g2)?g1:g2;
			
		System.out.println(g + " is greatest score");
		}
	}