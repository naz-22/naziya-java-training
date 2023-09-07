@FunctionalInterface
interface Dog{
	public void  eat() ;
}
 //1 method tradtional one
class Dogimp implements Dog{
	public void eat() {
		System.out.println("dog is eating");	
		System.out.println("dog is Barking");	

			}

}


public class Interfacedemo   {

	public static void main(String[] args) {
Dogimp d=new Dogimp();
d.eat();
//2.Anonymous classes
//Dog d= new Dog();
//3.Lambda expression
Dog d1=()->{};

}
	}
	


