import java.util.*;
public class pattern{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
		int i,j;
            int r = sc.nextInt();
            int myArray[][] = new int[r][];
            for(i=0;i<r;i++){
                myArray[i] = new int[i+1];
            }
			for(i=0;i<r;i++){
				for(j=0;j<=i;j++){
					myArray[i][j] = j+1;
				}
			} 
			for(i=0;i<r;i++){
				for(j=0;j<=i;j++){
					System.out.print(myArray[i][j]);	
				}
				System.out.println(" ");
			} 	
    }
}