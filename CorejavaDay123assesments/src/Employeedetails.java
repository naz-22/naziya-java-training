import java.awt.*;
public class Employeedetails {
public void showmenu() {
	int option;
	System.out.println("_________________MENU________________");
	System.out.println("1.Enter data");
	System.out.println("2.Display data");
	System.out.println("3.Exit");
	System.out.println("\nchoose option:");
	option=2;
	switch(option) {
	case 1:
	enterData();
	break;
	case 2:
	Displaydata();
	break;
	case 3:
	exitmenu();
	break;
	default:
	System.out.println("incorrect menu opyion");
	showmenu();
	break;	
	}
}
private void enterData() {
	System.out.println("enterdata menu is invoked");	
}
private void Displaydata() {
System.out.println("displaydata menu is invoked");
}
	private void exitmenu() {
		System.out.println("exit menu is invoked");
//		System.exit(0);
}
	public static void main(String[] args) {

		Employeedetails ed= new Employeedetails();
		ed.showmenu();
	}

}
