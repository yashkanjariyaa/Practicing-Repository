import java.util.*;
	class calc{
		static calc ncr(int n, int r){
			return fact(n)/(fact(r)*fact(n-r));
		}
		static calc npr(int n, int r){
			return fact(n)/fact(n-r);
		}
		static clac fact(int n){
			if(n>0){
				return n*fact(n-1);
			}else{
				return 1;
			}
		}
	public class vampire1{
      	public static void main(String[] args){
            	int n, a=0, ncr, npr;
			int[] numArray;
            	Scanner sc = new Scanner(System.in);
            	n=sc.nextInt();
			String temp = Integer.toString(n);
			size = temp.length();
			numArray = new int[size];
			for(int i = 0; i<size; i++){
				numArray[i] = temp.charAt(i) - '0';
			}
			for(int i = 0; i<size; i++){
				System.out.println(numArray[i]);
			}
			ncr = ncr(size, size/2);
			npr = npr(size/2, size/2);
			for(int i = 0; i < ncr; i++){
				int k = 0;
				for(int j = 0; j < npr; j++){
					int temp += numArray[i]*pow(10,((size/2)-k));
					k++ 
				}
			}
		}
	}
			