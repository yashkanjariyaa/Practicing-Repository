import java.util.*;
	public class exp3_1{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			String myString = sc.nextLine();
			int i, UCcount = 0, LCcount = 0, Scount = 0, Dcount = 0;
				for(i=0;i<myString.length();i++){
					if(Character.isUpperCase(myString.charAt(i))){
						UCcount++;
					}else if(Character.isLowerCase(myString.charAt(i))){
						LCcount++;
					}else if(Character.isWhitespace(myString.charAt(i))){
						Scount++;
					}else if(Character.isDigit(myString.charAt(i))){
						Dcount++;
					}
				}
				System.out.println("Number of lowercase is "+LCcount);
				System.out.println("Number of uppercase is "+UCcount);
				System.out.println("Number of space is "+Scount);
				System.out.println("Number of digits is "+Dcount);
			}
		}
					
				
					