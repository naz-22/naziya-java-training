import java.util.Scanner;
public class Traindetails {
	private String name;
	private String coach;
	private long mobno;
	private int amnt;
   private void accept() {
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
name=s.next();
System.out.println("enter coach:");
coach=s.next();
System.out.println("enter mbno:");
mobno=s.nextLong();
System.out.println("enter amnt:");
amnt=s.nextInt();
}
private  void display() {
System.out.println("name:" +name);
System.out.println("coach:" +coach);
System.out.println("mobno:" +mobno);
System.out.println("amnt" +amnt);
   }
	public static void main(String[] args) {
		Traindetails td= new Traindetails();
		td.accept();
		td.display();
}
}


	


