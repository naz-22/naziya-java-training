import java.util.Scanner;
public class Cylinder {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	System.out.println("enetr value of radius:");
	int h=s.nextInt();
	System.out.println("enetr value of height:");
	double pie=s.nextDouble();
	System.out.println("enetr value of pie:");
	double volume=  pie*(r*r)*h;
	System.out.println("volume of cylinder is:"+  volume);
	}
}
//int r=4;
//int h=6;
//double pie=3.14;
	


