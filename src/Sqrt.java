import edu.princeton.cs.algs4.StdOut;

public class Sqrt {

	public static double sqrt(double n){
		//牛顿迭代法求平方根
		if(n<0) return Double.NaN;
		double err = 1e-15;
		double x=1.0;
		while(Math.abs(n-x*x)>err){//也可以使用(n/x - x)
			x = 0.5*(x+n/x);//
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StdOut.println(sqrt(2.0));
	}

}
