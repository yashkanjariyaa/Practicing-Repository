import java.util.Scanner;
public class slow_solution{
    public static void main(String[] args){                  //finding value of N^2[0..Tmax], such that N[]<=Nmax and N[0..Tmax]<=sumN    
            Scanner myobj = new Scanner(System.in);  
            int Tmax = myobj.nextInt();
            int Nmax = myobj.nextInt();
            int sumN = myobj.nextInt();   
            int T=1,t=0;
            while(T<=Tmax && sumN!=0){
                if( sumN>Nmax ){
                        t+=Nmax*Nmax;
                        sumN-=Nmax;
                }else{
                    t+=sumN*sumN;
                    sumN-=sumN;
                }
                T++;
            }
                System.out.println(t);
    }
}