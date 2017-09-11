import java.util.*;
import java.io.*;

/*
*Author Mika Smith, Mathew Boyes
*
*/


public class Arithmetic{
	
	
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); //scan in a file 
		while(sc.hasNextLine()){
			String s = sc.nextLine(); 
			char op = 'c'; 
			if(!s.contains("#")){ //Ignore lines with # comments
				Scanner sc2 = new Scanner(s);
        		LargeInt x = new LargeInt(sc2.nextInt()); 
        		op = sc2.next().charAt(0); 
        		LargeInt y = new LargeInt(sc2.nextInt());
        		System.out.println(calculate(x, y, op));
        	}
		}
		sc.close(); 
			
		}
	
	public static String calculate(LargeInt x, LargeInt y, char op){
		String result="";
		
		result+=ConvertString(x); 
		result+= op;
		result+=ConvertString(y); 
		
		return result; 
	}
		
		//ignore #
		//each line new scenario. 
		//read in operation and two numbers, can be more than one operation and more than two numbers  
		
		//print at the end 
		
		
	
	
	//multiplication method 
	
	//division method 
	
	//GCD method 
	
	
	
	
	//Our new data structure 
	private static class LargeInt{
		private int value; 
		
		
		public LargeInt(){
		}
		
		public LargeInt(int value){
			this.value = value; 
		}
		
		
		public String ConvertString(LargeInt l){
			return Integer.toString(l.value);
		}
		
		/*
		
		public largeInt subtract(largeInt x, largeInt y){
			
		}
		
		public largeInt half(largeInt x, largeInt y){
			
		}
		
		public largeInt compare(largeInt x, largeInt y){
			
		}*/ 
	}
	
	
	
}