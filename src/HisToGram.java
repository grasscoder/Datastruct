import edu.princeton.cs.algs4.StdOut;

public class HisToGram {
    
	public static int count(int[] a,int key){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==key){count++;}
		}
		return count;
		
	}
	public static int[] histogram(int[] a,int M){
		//返回一个大小为M的数组，其中第i个元素为整数i在参数数组中出现的次数。
		int[] x = new int[M];
        for(int i=0;i<M;i++){
        	x[i] = count(a,i);
		}
	return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {11,19,24,10,7,1,3,4,6,2,5,7,9};
        int M = 10;
        for(int i=0;i<M;i++){
        	StdOut.println(histogram(a,M)[i]);
        	
        }
	}

}
