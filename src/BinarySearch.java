import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;



public class BinarySearch {

    public static int BinarySch(int[] a,int key){//定义一个静态 的二分查找的静态函数,二分查找的前提是数据有序排列
		
		for(int low=0,up=a.length-1,mid=(up+low)/2;low<=up;mid=(up+low)/2){
			if(key>a[mid]) low = mid + 1;
			else if(key<a[mid]) up = mid - 1;
			else return mid;
		}
		return -1;
    }
	
    /*使用递归方法编写二分查找算法    */
    public static int BS(int[] a,int key,int low,int up){
    	int mid = (up+low)/2;
    	if(key==a[mid]) return mid;
    	else if(key>a[mid]) BS(a,key,mid+1,up);
    	else if(key<a[mid]) BS(a,key,low,mid-1);
    	return -1;
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//提示readInt()方法过时。不要去管他，编译完成之后也会生成.class文件，
		//直接java BinarySearch w.txt < in.txt就可以出结果
		//这段代码在Eclipse运行报错，可以在Dos命令中运行 ，程序编译是汇报错，但是一样会生成.class文档事
		int[] wlist = In.readInts(args[0]); 
        Arrays.sort(wlist);
        while(!StdIn.isEmpty()){
        	int key = StdIn.readInt();
        	if(BinarySch(wlist, key)==-1){
        		StdOut.println(key);
        	}
        	
        }
		
	}

}
