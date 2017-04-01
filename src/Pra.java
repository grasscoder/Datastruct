import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class Pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(Integer.parseInt(args[0])==Integer.parseInt(args[1])&&Integer.parseInt(args[1])==Integer.parseInt(args[2])) StdOut.print("equals");
//		else StdOut.print("not equals");
		//System.out.println((char)('a'+4));
//		int N = 10;
//		Integer.toBinaryString(N);//整形数值转为为二进制字符串的方法(函数)
		////////////////////////////////////////////////////////////////
		//习题1.1.13二位数组转置(只是输出转置矩阵，并没有变成转置矩阵)）
//		int M = 4,N =3;
//		int[][] a;
//		//为了防止溢出，必须以行或者列中大的数定义一个方阵
//		if(M>N){//int =M;M=N;N=t;}
//		     a = new int[M][M];}
//		else {
//			 a = new int[N][N];}
//		////数组初始化
//		for(int i=0;i<M;i++){
//			for(int j=0;j<N;j++){//使用N控制列输出个数，实际是一个M*M矩阵,但是只输出N列
//				a[i][j] = StdRandom.uniform(1, 10);
//				StdOut.print(a[i][j]+" ");
//			}
//			StdOut.println();	
//		}
//		
//		////矩阵输出
//		StdOut.println(a[0][3]);
//		StdOut.println();	
//		////数组转置
//		for(int j=0;j<N;j++){
//			for(int i=0;i<M;i++){
//				StdOut.print(a[i][j]+" ");
//			}
//			StdOut.println();
//		}
		double[] x = {1.0,3.0,5.0};
		double[] y= {2.0,4.0,6.0};
		StdOut.println(Matrix.dot(x,y));

	}

}
