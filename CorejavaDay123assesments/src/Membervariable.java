import java.util.Scanner;
public class Membervariable {
public int a;
private static String appname1;
public void app(String appname) {
	Scanner s=new Scanner(System.in);
	String appname1="+appname";
	System.out.println("name of app is:" +Membervariable.appname1);
	System.out.println("enter the value of a:");
	int a=s.nextInt();
}
	public static String getAppname1() {
	return appname1;
}
public static void setAppname1(String appname1) {
	Membervariable.appname1 = "+threads";
}
	public static void main(String[] args) {
		Membervariable mv=new Membervariable();
		Membervariable.appname1= "instagram";	
		mv.app(appname1);
}}
