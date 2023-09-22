public class prolang {
    public static void main(String[] args){
        int A=2,B=1,i;
        int[] one = {9,4};
        int [] two = {8,5};
       for(i=1;i<=2;i++){

        if(one[i]==A || one[i]==B){
            System.out.println("1");
        }else if(two[i]==A||two[i]==B){
            System.out.println("2");
        }else{
            System.out.println("0");
        }
    
    }
    }

}