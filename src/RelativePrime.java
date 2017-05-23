import edu.princeton.cs.algs4.StdOut;

public class RelativePrime {

	//使用欧几里算法求解最大公约数
	public static int Euclid(int x,int y){
		if(x<y){int tem= x;x=y;y=tem;}
		int t = x%y;
		while(t!=0){
			x = y;
			y = t;
			t = x % y;
		}
		return y;
		}	
	
	public static int Euclid2(int x,int y){
		//使用递归欧几里得算法求解最大公约数
		if(x<y){int tem=x;x=y;y=tem;}
		int t = x%y;
		if(t==0) return y;
		else return Euclid2(y, t);
	}
	
	//��дһ�����������Ƿ��ʵķ���,���������������Լ������1���Ͳ��ǻ��ʡ�
	//两个数没有公约数（除了1 之外）
	public static boolean rprime(int x,int y){
		if(Euclid(x, y)==1){return true;}
		else return false;
		
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //StdOut.println(Euclid(23, 72));
		int N = 5;
		boolean[][] a = new boolean[N][N];
		for(int i=1;i<N;i++){
			for(int j=1;j<N;j++){
				if(rprime(i,j)){
					a[i][j] = true;
				}//end if
			}//end inner for 
		}//end outer for
		
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				StdOut.print(a[i][j]+"  ");
				
			}
			StdOut.println();
		}
		StdOut.println(Euclid2(12, 7));
		
	}

}
