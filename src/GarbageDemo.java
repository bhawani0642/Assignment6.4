//Here we have created a class named as GarbageDemo
public class GarbageDemo {
	
	// our main method
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		//Created the objects of GarbageDemo class
			 GarbageDemo s1=new GarbageDemo();  
			 GarbageDemo s2=new GarbageDemo();  
			  s1=null;  
			  s2=null;  
			  System.gc();  

		}
		// using the finalize method
		public void finalize(){
		System.out.println("object is garbage collected");
	}
	}

