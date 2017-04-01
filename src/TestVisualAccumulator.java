import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestVisualAccumulator {

	//@SuppressWarnings("deprecation")
	@Deprecated
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T,10);
        for(int t=0;t<T;t++){
        	a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
	}

}
