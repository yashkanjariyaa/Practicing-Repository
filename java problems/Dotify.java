import java.util.*;
public class Dotify{
    public static void main(String args[]){
        int N, K, L, temp=0, count=0, k=0;
        int[][] songs;
        int[] M;
        Scanner sc = new Scanner(System.in);
        //input
        N = sc.nextInt();
        K = sc.nextInt();
        L = sc.nextInt();
        //declaring array for N songs on app
        songs = new int[N][2];
        //initalising array for choosing songs on playlist, maximum can be K = N
        M = new int[N];
        for ( int i = 0; i < N; i++){
            songs[i][0] = sc.nextInt();
            songs[i][1] = sc.nextInt();
        }
        //adding from app to playlist if language is same
        for ( int i = 0; i < N; i++){
            if(L == songs[i][1]){
                M[k] = songs[i][0];
                k++;
            }else{
                continue;
            }
        }
        //sorting array in descending order to rank songs lengthwise
        for ( int i = 0; i < N; i++){
            for ( int j = i+1; j < N; j++){
            if(M[i] < M[j]){
                temp = M[i];
                M[i] = M[j];
                M[j] = temp;
            }
            }
        }
        //adding and outputing first K songs from the ranked songs
        for ( int i = 0; i < K; i++){
            count += M[i];
        }
        System.out.println(count);
    }
}