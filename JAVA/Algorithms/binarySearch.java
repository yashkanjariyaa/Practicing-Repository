public class binarySearch{
    static int found = 0;
     public void search(int[] Array, int t){
        int n = Array.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(Array[mid] == t){
                found = mid;
            }else if(t < Array[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,7,10,13,16,20};
        int target = 7;
        binarySearch myObj = new binarySearch();
        myObj.search(array, target);
        if(!(found == 0)){
            System.out.println(found);
        }else{
            System.out.println(0);
        }
    }
}