import edu.princeton.cs.algs4.StdOut;

public class MatirxFind {
	public static boolean  find(int[][] a,int k){
		//a是一个数值排列有规则的二维数组:向右侧或者下侧的数值逐渐增大的,
		//在数组中查找一个数，如果不存在返回false，存在返回true
		int row = 0;
		int col = a[0].length-1;
		if (a.length==0){return false;}//如果二位数组的长度为0，返回false
		else{
			
			int i = row;
			int j = col;
			while(i<a.length && j>=0){//如果i的长度小于a的长度，并且j大于0，保证数组上下界不溢出
				if(a[i][j]==k) return true;//如果当前值等于k，返回true
				else if(a[i][j]>k) j--;//如果当前值大于k，说明当前值线下面的值都比k大，所以继续向之前的列中寻找
				else i++;			//如果当前值比k小，说明k可能出现在这一列，如果有的话一定在当前数值的下面
		    }
		return false;	//如果能走到这一步，上一循环完毕说明i==a.length or j<0下标越界，数值不存在，返回false
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		StdOut.println(find(a,12));
		
		

	}

}
