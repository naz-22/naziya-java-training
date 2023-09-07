import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Employeeprod {
int id; 
String name; 
int age;
float salary;
public Employeeprod(int id, String name, int age, float salary) {
	this.id=id;
	this.name=name;
	this.age=age;
	this.salary=salary;
}

		public static void main(String[] args) {
List<Employeeprod>empList=new ArrayList<Employeeprod>();
empList.add(new Employeeprod(1,"raj",25,25000));
empList.add(new Employeeprod(2,"rahul",35,65000));
empList.add(new Employeeprod(3,"ramesh",45,50000));
empList.add(new Employeeprod(4,"rajesh",26,85000));
empList.add(new Employeeprod(5,"rakesh",65,95000));
empList.add(new Employeeprod(6,"ritesh",75,35000));
List<Integer> tempList= empList.stream().filter(e->e.age>35 ).map(e->e.age).collect(Collectors.toList());
System.out.println(tempList);
List<Float> tempList1= empList.stream().filter(e->e.salary>50000 ).map(e->e.salary).collect(Collectors.toList());
System.out.println(tempList1);
List<Integer> tempList3= empList.stream().filter(e->e.id>3 ).map(e->e.id).collect(Collectors.toList());
System.out.println(tempList3);


//List<Employeeprod> tempList1=  empList.stream().filter(e.salary>50000 .equals(e.getSalary())).collect(Collectors.toList());

//tempList.forEach(e->System.out.println(tempList);
//tempList1.forEach(e->System.out.println(e.getSalary()));
System.out.println(empList);
	}

//		private float getSalary() {
//			// TODO Auto-generated method stub
//			return salary;
//		}
//
//		private int getAge() {
//			// TODO Auto-generated method stub
//			return age;
//		}

		@Override
		public String toString() {
			return "Employeeprod [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}

		
}
