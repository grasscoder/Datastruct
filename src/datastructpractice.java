import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
public class datastructpractice {
	/////调和级数实现的静态方法
	public static double H(int N)
	{//不可以在main()函数内部直接定义其他的函数，但是可以通过定义内部类的方式定义新函数，类名.方法名()调用数
		double sum = 0.0; 
		for(int i=1;i<=N;i++){
			sum = sum + 1.0/i;
		}
		return sum;
	}
	////二分查找的算法实现
	public static int BinarySearch(int[] a,int key){//定义一个静态 的二分查找的静态函数,二分查找的前提是数据有序排列
		
		for(int low=0,up=a.length-1,mid = (up+low)/2;low<=up;mid = (low+up)/2){
	    	//int mid = (low+up)/2;
	    	if(key<a[mid]) up = mid-1;
	    	if(key>a[mid]) low = mid+1;//如果这个if语句与下一个else一体，那么这句的意思就是不符合这个if的条件，都会执行到下面的else，这样的话话就会出错
	    	if(key==a[mid]) return mid;
	    	
	    }
		/////使用另一种方法编写二分查找的函数体
//		int low = 0;
//		int up=a.length-1;
//		while(low<=up){
//			
//			int mid = (low+up)/2;
//			if(key<a[mid]) up = mid-1;
//			else if(key>a[mid]) low = mid+1;
//			else return mid;
//		}
		
		return -1;//循环完毕，代码执行到这一步，说明数组中没有要查找的值，因为如果有的话就会返回mid的值的
	}
	
	 /*使用递归方法编写二分查找算法    */
    public static int BS(int[] a,int key,int low,int up){
    	int mid = (up+low)/2;
    	if(key==a[mid]) return mid;
    	else if(key>a[mid] & mid+1<=up) return BS(a,key,mid+1,up);
    	else if(key<a[mid] & low<=mid-1) return BS(a,key,low,mid-1);
    	else return -1;
    }
	
	
	/////main函数如下:
	public static void main(String[] args) {
      ////实验一：验证数据机构
//	    int i = 0;
//	    int d = i++;
//     ////System.out.println(Math.PI);//Math不需要导入，直接使用
//     ////System.out.println(i);
	    double[] a = {2.1,4.2,2,5.1,7,9.7,6.6};
//        double max = a[0],sum = a[0];
//        for(;i<a.length;i++){
//    	    sum =sum + a[i];
//    	    if(max<a[i]) max = a[i];
//        }
//        double Ave  = sum/a.length;
//        System.out.printf("max = %f\n",max);
//        System.out.printf("sum = %f\n",sum);
//        System.out.printf("Ave = %f\n",Ave);
//	////颠倒数组元素的顺序
//        for(int i=0;i<a.length/2;i++){//数组下表标是从0开始的，而长度的获取a.length是元素的个数，所以/2以后循环的终止点会定位到中间或者前一个0
//    	    double tem;
//    	    tem = a[i];
//    	    a[i] = a[a.length-1-i];
//    	    a[a.length-1-i]  =tem;
//    	      	   
//        }
//	   for(int i =0;i<=a.length-1;i++){
//		   System.out.println(a[i]);
	   //}
//	 ////矩阵相乘
//     double[][] a = new double[3][4];
//     double[][] b = new double[4][3];
//     double[][] c = new double[3][3];
//     //初始化二维矩阵
//     for(int i=0;i<a.length;i++){
//    	 for(int j=0;j<a[1].length;j++){
//    		 //System.out.println(a[1].length);
//    		 a[i][j] = i+j;
//    	 }
//     }
//     for(int i=0;i<b.length;i++){
//    	 for(int j=0;j<b[1].length;j++){
//    		 //System.out.println(c[i][j]);
//    		b[i][j] = i+j+2;
//    	 }
//     }
//    //输出初始化的矩阵
//     for(int i=0;i<a.length;i++){ 
//    	 for(int j=0;j<a[1].length;j++){
//    		 //System.out.println(c[i][j]);
//    		 //System.out.println(a[i][j]);
//    		 //System.out.println(b[i][j]);
//    		 
//    	 }
//     }
//     //矩阵相乘运算
//     for(int i=0;i<c.length;i++){//注意控制循环次数
//    	 for(int j=0;j<c.length;j++){
//    		 for(int k=0;k<a[1].length;k++){
//    			 c[i][j] = c[i][j]+a[i][k]*b[k][j];
//    		 }
//    	 }
//     }
//     for(int i=0;i<c.length;i++){
//    	 for(int j=0;j<c[1].length;j++){
//    		 System.out.println(c[i][j]);
//    		 if(j==c[1].length-1){System.out.println("");}
//    	 }
//     }
//		System.out.println(Double.NaN);//NaN是not a Number的意思，是一个不是数字的量值值
		
	//System.out.println(H(10000));	
		
        int[] A = {1,2,3,6,9,11,15};
        Arrays.sort(A);
        //StdOut.println(BS(A,1,0,A.length-1));
		
//	for(int i=0;i<A.length;i++){
//	StdOut.print(A[i]+" ");
//	}
////	double b=2.2;
////	System.out.printf(b);
//	StdOut.print("\n");
//	
//	int key = 5;
//	if(BinarySearch(A, key)==-1) StdOut.print("No data find");
//	else StdOut.print("key: "+key+" in position : "+ BinarySearch(A, key));
//	
//	StdOut.print(StdStats.max(A));
//	StdOut.print("\n");
//	StdOut.print(Integer.parseInt("12"));
///////////////////////////////////////////////////////////
	
	
//////////////////////////////////////////    
		////格式化的输出（随机数的的产生）
//	int N = Integer.parseInt(args[0]);
//	double low = Double.parseDouble(args[1]);
//	double up = Double.parseDouble(args[2]);
//	//double sum = 0.0;
//	for(int i=0;i<N;i++){
//		double rdm = StdRandom.uniform(low,up);
//		StdOut.println(rdm);
//		//sum+=rdm;
//		
//	}
//	StdOut.println("sum = "+sum);
//	StdOut.println("Avg = "+sum/N);
	
	for(int i=0;i<10;i++){
		int x =5;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
