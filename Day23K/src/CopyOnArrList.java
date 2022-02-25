import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrList {
	  static CopyOnWriteArrayList<String> l
      = new CopyOnWriteArrayList<String>();

  public void run()
  {
      l.add("D");
  }
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
	        l.add("A");
	        l.add("B");
	        l.add("c");
	 
	        // We create a child thread
	        // that is going to modify
	        // ArrayList l.
	        CopyOnArrList t = new CopyOnArrList();
	        t.run();
	 
	        Thread.sleep(1000);
	 
	        // Now we iterate through
	        // the ArrayList and get
	        // exception.
	        Iterator itr = l.iterator();
	        while (itr.hasNext()) {
	            String s = (String)itr.next();
	            System.out.println(s);
	            Thread.sleep(1000);
	        }
	        System.out.println(l);
	    }
	}


