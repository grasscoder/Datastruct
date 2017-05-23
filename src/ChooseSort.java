//import edu.princeton.cs.algs4.FenwickTree;

public class ChooseSort {

	public static int findMin(int[] a){//使用了Java的泛型，必须返回一个T类型数据
		int len =  a.length;
		int b =a[0]  ;
		for(int i=1;i<len-1;i++){
			if(a[i]<b){
				b = a[i];
			}
			
		}
		return b;
	}
	public static int[] selection(int[] a){
//		int [] b = new int[a.length];
		int init = a[0];
		for(int i=1,j=0;i<a.length-1;i++){
			if(a[i]<init){a[i]^=init^=a[i]^=init;}
			
		}
		
		
	}
	public static int function(int k){
		if(k<0) {
			System.out.println("k must be bigger than 0");
			return -1;
		}
		if(k==0) return 1;
         //非递归方法
		int fk = 0;
		for(int i=1;i<=k;i++){
			fk = fk +  4*i;
		}
		return fk+1;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(function(1));

	}

}
