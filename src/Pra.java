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
//		Integer.toBinaryString(N);//������ֵתΪΪ�������ַ����ķ���(����)
		////////////////////////////////////////////////////////////////
		//ϰ��1.1.13��λ����ת��(ֻ�����ת�þ��󣬲�û�б��ת�þ���)��
//		int M = 4,N =3;
//		int[][] a;
//		//Ϊ�˷�ֹ������������л������д��������һ������
//		if(M>N){//int =M;M=N;N=t;}
//		     a = new int[M][M];}
//		else {
//			 a = new int[N][N];}
//		////�����ʼ��
//		for(int i=0;i<M;i++){
//			for(int j=0;j<N;j++){//ʹ��N���������������ʵ����һ��M*M����,����ֻ���N��
//				a[i][j] = StdRandom.uniform(1, 10);
//				StdOut.print(a[i][j]+" ");
//			}
//			StdOut.println();	
//		}
//		
//		////�������
//		StdOut.println(a[0][3]);
//		StdOut.println();	
//		////����ת��
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
