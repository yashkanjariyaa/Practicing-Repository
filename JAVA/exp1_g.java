import java.util.*;
    public class exp1_g{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            for(int i=1;i<=r;i++){
                if(i%2!=0){
                    for(int j=1;j<=i;j++){
                        System.out.print(j+" ");
                    }
                }else{
                    for(int k = i;k>=1;k--){
                        System.out.print(k+" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
