//GENERIC CLASS EXAMPLE
import java.util.*;
	public class MyGen<T> {
		T obj;
		void add(T obj) {
			this.obj=obj;
		}
public static void main(String args[]) {
		MyGen<String> m=new MyGen<String>();
m.add("rahul");
System.out.println(m.obj);
}

	}
	

