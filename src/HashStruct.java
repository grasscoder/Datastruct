import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;

public class HashStruct {
	private int i;
//	StdOut.println(i);
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i ;
		int []a = new int[6];
		int t = a.length;
//		StdOut.println(i.hashCode());
		Counter m = new Counter("one");
		Integer b = new Integer(2);
		Date d = new Date(1945,6,20);
		String st = new String("hello world");
		
		
		StdOut.println(st.hashCode());
		StdOut.println(m.hashCode());

	}

}
