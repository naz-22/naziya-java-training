import java.lang.*;
import java.util.Scanner;

public class Demoexception {

	public static void main(String[] args) {
		  int i=6;
			   try{  
			     if(i<6){
			    	 throw new Exception("error");
			    	 }
			   }
			   catch(Exception e)
			   {
				   System.out.println(e);
			   }  
			  
			  } 
}
		class Myexception extends Exception{

			public Myexception(String string) {
				super()	;	
	}
		}		
		
//
//	}


