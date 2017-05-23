
import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestAccumulator {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = Integer.parseInt(args[0]);
		Accumulator a = new Accumulator();
		
		for(int i=0;i<T;i++){
			
			a.addDataValue(StdRandom.uniform());
		}
		StdOut.println(a);
	}

}
