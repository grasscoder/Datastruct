import edu.princeton.cs.algs4.StdOut;

public class Sqrt {

	public static double sqrt(double n){
		
		if(n<0) return Double.NaN;
		double err = 1e-15;
		double x=1.0;
		while(Math.abs(n-x*x)>err){
			x = 0.5*(x+n/x);//不断令x等于x和n/x的平均数
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StdOut.println(sqrt(2.0));
	}

}
