import java.util.*;
public class arraysum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];
        int[] arraySum = new int[n];
        int i,j;
        for(i=0;i<n;i++){
            arraySum[i] = 0;
        }
        for(i=0;i<n;i++){
            myArray[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    continue;
                }else{
                    arraySum[i] = arraySum[i] + myArray[j];
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(arraySum[i]);
        }
    }
}