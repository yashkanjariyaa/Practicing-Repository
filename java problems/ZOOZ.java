import java.util.Scanner;
public class ZOOZ{
    public static void main(String[] args){
       Scanner myObj = new Scanner(System.in);
       int i,count1=0,count2=0;
       int T = myObj.nextInt();
        while(T!=0){
            int N = myObj.nextInt();
            String[] A = new String[N];
            A[0]="0";
            A[N-1]="0";
            for(i=1;i<N-1;i++){
                if(i!=N/2 && N%2!=0){
                    A[N/2]=1;
                }else if( (i==(N/2)+1 || i==(N/2)-1) && N%2==0 ){
                    A[N/2+1]=1;
                }
           }
           System.out.println(A);
         T--;
        }
    }
}