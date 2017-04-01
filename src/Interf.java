import edu.princeton.cs.algs4.StdOut;

public class Interf {
	
	
	
	public interface Datable{
		
		int year();
		int month();
		int day();
			
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 = "hello";
        String str2 = str1;
        str1 = "world";
        StdOut.print(str1+" ");
        StdOut.print(str2);
        
	}

}
