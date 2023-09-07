import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;


public class Employeemanagement {
	static int empid;
	static String empname;
	static int empage;
	public Employeemanagement(int empid, String name, int empage) {
		this.empid=empid;
		this.empname=name;
this.empage=empage;
	}

	private static void CreateEmpdetails() 
	{
		
	}

	private static void viewEmpdetails()
	{
		System.out.println("Employeempd [id=" + empid + ", name=" + empname + ", age=" + empage + "]");
//		System.out.println("Employeempd [id=" + empid + ", name=" + empname + ", age=" + empage + "]");

     }
	private static void deleteEmpdetails() {
		System.out.println("delete operation is invoked");

	}
	private static void Exit() {
	System.out.println("exit application");	
	}
public static void main(String[]args) throws InvalidOperationException  {
		ArrayList<Employeemanagement> empd=new ArrayList 
		 <Employeemanagement>();
		
		while(true) {
	System.out.println("_________________Employeemanagement________________");
	System.out.println("1.Create empdetails");
	System.out.println("2.view empdetails");
	System.out.println("3.delete empdetails");
	System.out.println("4.Exit");
	System.out.println("\nchoose operation:");
	
	Scanner s1=new Scanner(System.in);
		int operation=s1.nextInt();
		s1.nextLine();
		switch(operation) {
		case 1:
		CreateEmpdetails();
		Scanner s=new Scanner(System.in);
		s.nextLine();
		System.out.println("enter totalemployees :");
		int num=s.nextInt();
		s.nextLine();
		String emp[]=new String[num] ;
		 System.out.println("Enter"+num+" employeee details: ");
		for(int i=0;i<num;i++) {
			
			emp[i]=s.nextLine();
		}
		System.out.println("enter 1st empdetails:");
		System.out.println( Employeemanagement.empid=123);
		System.out.println( Employeemanagement.empname="raj");
		System.out.println( Employeemanagement.empage=25);
		s.nextLine();
		System.out.println("enter 2nd empdetails:");
		System.out.println( Employeemanagement.empid=1234);
		System.out.println( Employeemanagement.empname="rajesh");
		System.out.println( Employeemanagement.empage=27);
        break;
		case 2:
         viewEmpdetails();
		break;
		case 3:
		deleteEmpdetails();
		break;
		case 4:
			System.out.println("exit the application");
						System.exit(operation);
						s1.close();
		default:
			throw new InvalidOperationException("invalid option is selected:");	
		
		}
		}
		
	}

	
}


			
			
		
	


