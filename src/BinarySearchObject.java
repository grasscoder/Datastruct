import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class BinarySearchObject {
	//这段程序是将二分查找重写成为一个面向对象的程序
	private int[] a;
	private int b=2;
	public BinarySearchObject(int[] data){
		//构造函数，将a[]中所有值构造一个集合
		a = new int[data.length];
		for(int i=0,j=data.length-1;i<=j;i++,j--){
		     a[i] = data[i];
		     a[j] = data[j];
		    }
		Arrays.sort(a);
		}
	public boolean Isin(int key){
		//false表示不存在， true表示存在
		return binarySearch(key)!=-1;
	}
	
	private int binarySearch(int key){
		//二分法的算法实现
		int i=0,j=a.length-1;
		int mid = (i+j)/2;
		while(i<=j){
			if(key==a[mid]){ return mid; }
			else if(key>a[mid]){i = ++mid;}
			else { j = --mid; }
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] list = {10,12,6,4,7,3,1}; 
		BinarySearchObject BSO = new BinarySearchObject(list);
		StdOut.println(BSO.Isin(2));
		StdOut.println(BSO.binarySearch(2));
		StdOut.println(BSO.b);
	}
	
	
	

	
	
	
	
	
}
