import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Set;
import java.util.TreeMap;
//int count;
////ArrayList<Integer> ar=new ArrayList<Integer>();
//Scanner s=new Scanner (System.in);
//
//ar.add(1S01);
//ar.add(1S02);
//ar.add(1H01);
//ar.add(1M02);

public class Clistofpartnumbers {
	static Map<String, Integer> m= new HashMap<String, Integer>();
public static void sortbydescription() {
	TreeMap<String,Integer> sorted=new TreeMap<>();
	sorted.putAll(m);
	//to display Treemap which is naturally sorted 
	for(Map.Entry<String,Integer> entry: sorted.entrySet()) {
		System.out.println("Name :" +entry.getKey()+ " count:"+  entry.getValue());

	}
}
	public static void main(String[] args) {
		
//Map<String, Integer> m= new HashMap<String, Integer>();
m.put("Blue polo shirt",  7);
m.put(  "Black polo shirt",6);
m.put(  "Red ball cap",5);
m.put(   "Duke  mug",3);
//Set<Map.Entry<String, Integer>> set=m.entrySet();
//Iterator<Map.Entry<String, Integer>> itr=set.iterator();
//
//while(itr.hasNext()) {
//	Map.Entry e = itr.next();
	System.out.println("========== product report=========");
sortbydescription();
}

	}
//
//public class Clistofpartnumbers {
//
//static Map<Integer, String> m= new HashMap<Integer, String>();
//public static void sortbyvalue() {
//	TreeMap<Integer,String> sorted=new TreeMap<>();
//	sorted.putAll(m);
//	//to display Treemap which is naturally sorted 
//	for(Map.Entry<Integer,String> entry: sorted.entrySet()) {
//		System.out.println(" count:"+  entry.getKey()    +    "Name :" +entry.getValue());
//
//	}
//}
//	public static void main(String[] args) {
//		
////Map<Integer, String> m= new HashMap<Integer, String>();
//m.put(7,"Blue polo shirt"  );
//m.put(6,  "Black polo shirt");
//m.put( 5, "Red ball cap");
//m.put( 3,  "Duke  mug");
////Set<Map.Entry<String, Integer>> set=m.entrySet();
////Iterator<Map.Entry<String, Integer>> itr=set.iterator();
////
////while(itr.hasNext()) {
////	Map.Entry e = itr.next();
//	System.out.println("========== product report=========");
//sortbyvalue();
//}

//	}


