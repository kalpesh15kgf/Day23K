import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Iteratordemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList(Arrays.asList( new String[] {"Apple1", "Cat", "Dog", "Rat"}));
	    Vector v = new Vector(list);
	    delete(v, "Dog");
	}
	private static void delete(Vector v, String name) {
	      Iterator i = v.iterator();
	      while (i.hasNext()) {
	         String s = (String) i.next();
	         if (s.equals(name)) {
	            i.remove();
	         }
	      }
	      // Display the names
	      System.out.println("The names are:");
	      i = v.iterator();
	      while (i.hasNext()) {
	         System.out.println(i.next());
	      }
	}

}
