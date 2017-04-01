import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class DGui {
    
	//使用递归方法求解阶乘
	public static long dgui(int N){
		if(N==1) return 1;
		else return N*dgui(N-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int N = StdIn.readInt();
        StdOut.print(Math.log(dgui(N)));
       
	}

}
