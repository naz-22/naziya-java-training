import java.lang.*;
import java.util.Scanner;

public class Employeerecords {
	
	public void store() 
	{
		
	}
	
//	public void storedata() {
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getEmpname() {
//		return empname;
//	}
//	public void setEmpname(String empname) {
//		this.empname = empname;
//	}
//	String getDateofbirth() 
//		return dateofbirth;
//	}
//	public void setDateofbirth(String dateofbirth) {
//		this.dateofbirth = dateofbirth;
//	}
//	public int getDateofjoining() {
//		return dateofjoining;
//	}
//	public void setDateofjoining(int dateofjoining) {
//		this.dateofjoining = dateofjoining;
//	}
//	public String getDesignation() {
//		return designation;
//	}
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//	public String getMaritalstatus() {
//		return maritalstatus;
//	}
//	public void setMaritalstatus(String maritalstatus) {
//		this.maritalstatus = "maritalstatus";
//	}
	
public void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter emp id:");
		int id= s.nextInt();
		System.out.println("enter emp name:");
		String empname= s.next();
		System.out.println("enter  Designation:");
		String designation= s.next();
		System.out.println("enter  department:");
		String department= s.next();
		System.out.println("enter doj:");
		String dateofjoining= s.next();

System.out.println("enter dob:");
String dateofbirth= s.next();
		System.out.println("enter  maritalstatus:" );
		String maritalstatus= s.next();		
	}

public static void main (String args[]) {
	Employeerecords er=new Employeerecords();
	String [] empd=new String[7];
		empd[0]="emp id";
		empd[1]="empname";
		empd[2]="designation";
		empd[3]="department";
		empd[4]="doj";
		empd[5]="dob";
		empd[6]="maritalstatus";
		er.display();
		System.out.println();
		

	}
}

