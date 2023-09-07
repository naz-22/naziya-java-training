import java.sql.SQLException;
import java.util.Scanner;
	import java.lang.*;
import java.sql.*;


public class EmployeeJDBC{
	public static void main(String[]args) throws Exception  {
	Scanner s=new Scanner(System.in);
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?user=naziya & password=asdf@22");
     Statement st=con.createStatement();
     for(int n=0;n<4;n++)
    {
	System.out.println("1.Create an employee\n2.Rtreive employee details\n 3.Update employee details\n 4.Delete employee");
   System.out.println();
   System.out.println("select the option:");
	int option=s.nextInt();
	System.out.println();
    try {   
	     switch(option) {
			case 1:
PreparedStatement s1=con.prepareStatement("insert into employeedetails(eno,firstname,lastname)values(?,?,?)");	
System.out.println("enter how many number of employee details to be added: ");
int num=s.nextInt();
for(int i=0;i<num;i++) {
	int j=i+1;
	System.out.println("enter the details for employee "+j+"");
	int eno=s.nextInt();
	s.nextLine();
	s1.setInt(1, eno);
	String fn=s.nextLine();
	s1.setString(2,fn);
	String ln=s.nextLine();
	s1.setString(3,ln);
	s1.executeUpdate();
}
	System.out.println("employee details added successfully:  ");
			System.out.println();
			break;
			case 2:
            ResultSet rs=st.executeQuery("select * from employeedetails");
            while(rs.next()) {
            	System.out.println("empno:"+rs.getInt(1)+"\n"+"firstname:"+rs.getString(2)+"\n"+"lastname:"+rs.getString(3));
            System.out.println();
            }
            break;
			case 3:
PreparedStatement s2=con.prepareStatement("update employeedetails set firstname=?,lastname=? where eno=?");
System.out.println("enter how many employee details to be updated: ");
int num1=s.nextInt();
for(int i=0;i<num1;i++) {
	int j=i+1;
	System.out.print("enter eno whose details you want to update:");
	int eno=s.nextInt();
	s.nextLine();
	s2.setInt(3, eno);
	System.out.print("enter the updated  firstname:");
	String fn=s.nextLine();
	s2.setString(1, fn);
	System.out.print("enter the updated  lastname:");
	String ln=s.nextLine();
	s2.setString(2, ln);
	s2.executeUpdate();
	}
System.out.println("Employee details updated successfully:");
    break;
	case 4:
		PreparedStatement s3=con.prepareStatement("delete  from employeedetails where eno=?");
		System.out.println("enter how many employee details to be deleted: ");
		int num2=s.nextInt();
		for(int i=0;i<num2;i++) {
			int j=i+1;
		
			System.out.print("enter eno whose details you want to delete:");
			int d=s.nextInt();
			s3.setInt(1, d);
			s3.executeUpdate();
		}
		
System.out.println("successfully deleted the record:");
System.out.println();
			break;
			default:
				break;
	     }}
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
    }
	}
	}
	
    

				
				
				
				
				
				
				
				
				
				
				
				
				
		
	
	
	
//import java .sql.Connection;
//import java.sql.DriverManager;
////import java.sql.SQLException;
//import java.sql.Statement;
//public class Employee{
//	public static void main(String[]args) throws Exception {
//		Connection con=DriverManager.getConnection("C:\\jdbc:\\Program Files\\MySQL");
//		Statement s=con.createStatement();
//		s.executeUpdate("insert into employee(eno, firstname,lastname)");
//		System.out.println("data inserted");
//		System.out.println("updating the data");
//		s.executeUpdate("update employee set firstname='Anam',lastname='khan',eno=100");
//		System.out.println("data updated");
//		s.executeUpdate("update employee set firstname='Amal',lastname='sheik',eno=101");
//		System.out.println("data updated");
//		System.out.println("deleting the data");
//		s.executeUpdate("Delete from emplyee where eno=100");
//        System.out.println("data deleted");		
//   con.close();
//
//		
//	}
//}

				
				
			
		





