import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new LinkedList<>();
        names.add("hello");
        names.add("Kalpesh");
        names.add("Jadhav");
  
        // Getting ListIterator
        ListIterator<String> listIterator
            = names.listIterator();
  
        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
  
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
	}

}
