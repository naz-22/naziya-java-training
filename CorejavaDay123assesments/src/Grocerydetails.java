import java.util.Scanner;
public class Grocerydetails {
	private String item;
	private int price;
	private  int addweight;
private int displayweight;
private int deleteweight;
//	private int amnt;
   private void store() {
Scanner s=new Scanner(System.in);
System.out.println("enter item:");
item=s.next();
System.out.println("enter price:");
price=s.nextInt();
//System.out.println("enter amnt:");
//amnt=s.nextInt();
}
	
private  void display() {
System.out.println("item:" +item);
System.out.println("price:" +price);
////System.out.println("amnt" +amnt);
}
void addweight() {
	
}
	public int getAddweight() {
	return addweight;
}

public void setAddweight(int addweight) {
	this.addweight = addweight;
}
void displayweight() {
	
}
	public int getDisplayweight() {
	return displayweight;
}
	
public void setDisplayweight(int displayweight) {
	this.displayweight = displayweight;
}
void deleteweight() {	
}
	public int getDeleteweight() {
	return deleteweight;
}

public void setDeleteweight(int deleteweight) {
	this.deleteweight = deleteweight;
}

	public static void main(String[] args) {
		Grocerydetails gd=new Grocerydetails();
		gd.store();
		gd.addweight=200;
		gd.displayweight= gd.addweight +  100;
		gd.deleteweight=gd.displayweight-gd.addweight;
		
		   System.out.println("addweight:" +gd.addweight);
		System.out.println("delete weight:" +gd.deleteweight);
		System.out.println("displayweight:"+gd.displayweight);
	}
	
	}