import java.util.*;
    public class exp1_g2{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int charNum, temp = 1;
            int r = sc.nextInt();
            int Num = 65;
            for(int i=0; i<=r; i++){
                for(int j=1; j<i; j++){
                    System.out.print(" ");
                }
                charNum = Num;
                for(int k=0; k<i; k++){
                    System.out.print((char)(charNum));
                    charNum--;
                    System.out.println(" ");
                }
                Num += (++temp);
            }
        }
    }