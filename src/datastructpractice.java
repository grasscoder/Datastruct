import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
public class datastructpractice {
	/////���ͼ���ʵ�ֵľ�̬����
	public static double H(int N)
	{//��������main()�����ڲ�ֱ�Ӷ��������ĺ��������ǿ���ͨ�������ڲ���ķ�ʽ�����º���������.������()������
		double sum = 0.0; 
		for(int i=1;i<=N;i++){
			sum = sum + 1.0/i;
		}
		return sum;
	}
	////���ֲ��ҵ��㷨ʵ��
	public static int BinarySearch(int[] a,int key){//����һ����̬ �Ķ��ֲ��ҵľ�̬����,���ֲ��ҵ�ǰ����������������
		
		for(int low=0,up=a.length-1,mid = (up+low)/2;low<=up;mid = (low+up)/2){
	    	//int mid = (low+up)/2;
	    	if(key<a[mid]) up = mid-1;
	    	if(key>a[mid]) low = mid+1;//������if�������һ��elseһ�壬��ô������˼���ǲ��������if������������ִ�е������else�������Ļ����ͻ����
	    	if(key==a[mid]) return mid;
	    	
	    }
		/////ʹ����һ�ַ�����д���ֲ��ҵĺ�����
//		int low = 0;
//		int up=a.length-1;
//		while(low<=up){
//			
//			int mid = (low+up)/2;
//			if(key<a[mid]) up = mid-1;
//			else if(key>a[mid]) low = mid+1;
//			else return mid;
//		}
		
		return -1;//ѭ����ϣ�����ִ�е���һ����˵��������û��Ҫ���ҵ�ֵ����Ϊ����еĻ��ͻ᷵��mid��ֵ��
	}
	
	 /*ʹ�õݹ鷽����д���ֲ����㷨    */
    public static int BS(int[] a,int key,int low,int up){
    	int mid = (up+low)/2;
    	if(key==a[mid]) return mid;
    	else if(key>a[mid] & mid+1<=up) return BS(a,key,mid+1,up);
    	else if(key<a[mid] & low<=mid-1) return BS(a,key,low,mid-1);
    	else return -1;
    }
	
	
	/////main��������:
	public static void main(String[] args) {
      ////ʵ��һ����֤���ݻ���
//	    int i = 0;
//	    int d = i++;
//     ////System.out.println(Math.PI);//Math����Ҫ���룬ֱ��ʹ��
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
//	////�ߵ�����Ԫ�ص�˳��
//        for(int i=0;i<a.length/2;i++){//�����±���Ǵ�0��ʼ�ģ������ȵĻ�ȡa.length��Ԫ�صĸ���������/2�Ժ�ѭ������ֹ��ᶨλ���м����ǰһ��0
//    	    double tem;
//    	    tem = a[i];
//    	    a[i] = a[a.length-1-i];
//    	    a[a.length-1-i]  =tem;
//    	      	   
//        }
//	   for(int i =0;i<=a.length-1;i++){
//		   System.out.println(a[i]);
	   //}
//	 ////�������
//     double[][] a = new double[3][4];
//     double[][] b = new double[4][3];
//     double[][] c = new double[3][3];
//     //��ʼ����ά����
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
//    //�����ʼ���ľ���
//     for(int i=0;i<a.length;i++){ 
//    	 for(int j=0;j<a[1].length;j++){
//    		 //System.out.println(c[i][j]);
//    		 //System.out.println(a[i][j]);
//    		 //System.out.println(b[i][j]);
//    		 
//    	 }
//     }
//     //�����������
//     for(int i=0;i<c.length;i++){//ע�����ѭ������
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
//		System.out.println(Double.NaN);//NaN��not a Number����˼����һ���������ֵ���ֵֵ
		
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
		////��ʽ���������������ĵĲ�����
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
