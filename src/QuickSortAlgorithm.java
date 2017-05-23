
import edu.princeton.cs.algs4.StdOut;

public class QuickSortAlgorithm {

	public static int[] quicksort(int []arr,int low,int up){
		
		int i = low;//
		int j = up;
		int d = arr[i]; //轴元素设置为排序区间的第一个数值
		//����������㷨����
		while(i<j){
			
			while(d<arr[j]&&i<j){j--;}//���ұ߿�ʼ�����û��û�б���С�ģ�ָ��ǰ��
			arr[i] = arr[j];//ִ����һ��˵�������˱�������ֵ�����и�ֵ��

			while(d>=arr[i]&&i<j){i++;}//�ұ�ִ���꣬��ʼִ�����
			arr[j] = arr[i];
			
		}
		arr[j] = d;
		StdOut.println(i+"=="+j);
	    if(i>low)  quicksort(arr,low,i-1);//������н��еݹ飬��ߵ���ֵ�����ұ�С
	    if (j<up)  quicksort(arr,j+1,up);//�ұ����У��ұߵ����ж�����ߴ�
		
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
