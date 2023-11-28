import java.util.*;
	public class array2{
		public static void main(String args[]){
			int a[] = new int[3];
			int b[] = new int[3];
			int i,sum=0;
			Scanner sc = new Scanner(System.in);
				
				for(i=0;i<a.length;i++){
					a[i] = sc.nextInt();
					sum+=a[i];
				}
				for(i=0;i<a.length;i++){
					b[i] = sum - a[i];
				}
				for(i=0;i<a.length;i++){
					System.out.println(b[i]);
				}
			}
		}