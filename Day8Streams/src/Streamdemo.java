import java.util.stream.Stream;
public class Streamdemo {
public static int calculatesum(int n) {
	return Stream.iterate(1, i->i+1).limit(n).reduce(0, Integer::sum);
}
	public static void main(String[] args) {
int sum =calculatesum(25);
System.out.println("sum:"+sum);
	}

}
