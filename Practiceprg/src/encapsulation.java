import java.util.Scanner;

public class encapsulation {
  int rno;
 String name;
 String schl;
 
 	public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = "name";
}
public String getSchl() {
	return schl;
}
public void setSchl(String schl) {
	this.schl = "schl";
}


	public static void main(String[] args) {
		encapsulation e=new encapsulation();
e.name="arpita";
e.rno=1;
e.schl="st.anns";
System.out.println(e.name);
System.out.println(e.rno);
System.out.println(e.schl);
		}
	}
   
