import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter number:");
		int num=s.nextInt();
		for(int i=0; i<=10; i++ ) {
			System.out.println(num+"*"+i+"="+num*i);
		}
 
	}

}
