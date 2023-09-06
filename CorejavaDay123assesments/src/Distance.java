import java.util.Scanner;

public class Distance {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the time taken:");
		double t=s.nextDouble();
		System.out.println("enter the initial veocity :");
		double u=s.nextDouble();
		System.out.println("enter the accelator  :");
		double a=s.nextDouble();
//    int u, a, t, distance;
//    u=15;
//    a=2;
//    t=5;
   double distance=u*t +(a*t*t)/2;
    System.out.println("");
    System.out.println("distance travelled =" +distance + "meter");
    System.out.println("");

	}

}
