public class atm {
	/**
	 * @param args
	 */
	public static void main(String[] args){ 
		int K=15,i;
		int[] A = {5,6,7,3,1};
		for(i=0;i<5;i++){
				if(A[i]<=K){
					System.out.print("1");
					K=K-A[i];
				}else{
					System.out.print("0");
					continue;
				}
		}
	}
}