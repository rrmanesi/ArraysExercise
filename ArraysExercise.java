
public class ArraysExercise {
	
	
	public static int total(int[] arrayValues){
	  
	     int sum = 0;
		 for(int i:arrayValues){
			  sum += i;
		 }
	  
	   return sum;
	}
	public static void main(String[] args){
		
		
		     int[] myArray  = {5,15,14,20,56,20,30,200,175};
			 
			 System.out.println(total(myArray));
			
		 } 
		
}



