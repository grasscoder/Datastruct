
import edu.princeton.cs.algs4.StdOut;

public class QuickSortAlgorithm {

	public static int[] quicksort(int []arr,int low,int up){
		
		int i = low;//把数组第一个数值设置为轴
		int j = up;
		int d = arr[i]; //以数组中最后一个数作为轴
		//快速排序的算法过程
		while(i<j){
			
			while(d<arr[j]&&i<j){j--;}//从右边开始，如果没，没有比轴小的，指针前移
			arr[i] = arr[j];//执行这一步说明遇到了比轴大的数值，进行赋值人

			while(d>=arr[i]&&i<j){i++;}//右边执行完，开始执行左边
			arr[j] = arr[i];
			
		}
		arr[j] = d;
		StdOut.println(i+"=="+j);
	    if(i>low)  quicksort(arr,low,i-1);//左边序列进行递归，左边的数值都比右边小
	    if (j<up)  quicksort(arr,j+1,up);//右边序列，右边的序列都比左边大
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] a = {6,2,1,7,9,8,4,3,1,1,5,11,10,17};
   int b[] = quicksort(a,0,a.length-1);
   
   
   for(int i=0;i<b.length;i++){
   StdOut.println(b[i]);
   }
   
	}

}
