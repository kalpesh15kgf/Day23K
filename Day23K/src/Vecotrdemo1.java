import java.util.Enumeration;
import java.util.Vector;

public class Vecotrdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<String> v=new Vector<String>();//creating vector  
		  v.add("Kalpesh");//method of Collection  
		  v.addElement("Valmik");//method of Vector  
		  v.addElement("Jadhav");  
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
	}

}
