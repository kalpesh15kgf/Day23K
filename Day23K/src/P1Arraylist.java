import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P1Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Hey");//adding object in arraylist    
		  al.add("bro");    
		  al.add("kalpesh");    
		  al.add("jadhav");    
		  //traversing elements using Iterator  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }    
	}

}
