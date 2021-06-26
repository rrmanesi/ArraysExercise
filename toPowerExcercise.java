import java.lang.Math;
import java.util.*;

public class toPowerExcercise {
	
	 public static int [] toPower(int a, int b){
		 int[] myarray;
		 myarray = new int [a];
		 
		 for(int i = 0; i < a;  i++){
			myarray[i] = (int)(Math.pow(Double.valueOf(i),Double.valueOf(b)));
			
		 }
		 
		 return myarray;
	 }
	
	 public static void main(String args[])
	    {
		 int a = 5;
		 int b = 2;
		 System.out.println(Arrays.toString(toPower(a,b)));
		 
		 
}
	 
	 
}
