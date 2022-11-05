*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedHashMap<Integer,Integer> l = new LinkedHashMap<>();
	   // add elemnet in the map
	    l.put(1,120);
	    l.put(2,10);
	    l.put(3,30);
	    l.put(4,50);
	    l.put(5,340);
	     System.out.println(l);
	   //   get element from the map 
	    System.out.println(l.get(3));
	   // size of map
	   System.out.println(l.size());
	   // check if  element present in map 
	   System.out.println(l.containsValue(120));
	   System.out.println(l.containsKey(2));
	   //remove element from map
	   l.remove(3);
	   System.out.println(l);
	   System.out.println(l.isEmpty());
	}
}
