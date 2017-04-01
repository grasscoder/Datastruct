import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;



public class BinarySearch {

    public static int BinarySch(int[] a,int key){//����һ����̬ �Ķ��ֲ��ҵľ�̬����,���ֲ��ҵ�ǰ����������������
		
		for(int low=0,up=a.length-1,mid=(up+low)/2;low<=up;mid=(up+low)/2){
			if(key>a[mid]) low = mid + 1;
			else if(key<a[mid]) up = mid - 1;
			else return mid;
		}
		return -1;
    }
	
    /*ʹ�õݹ鷽����д���ֲ����㷨    */
    public static int BS(int[] a,int key,int low,int up){
    	int mid = (up+low)/2;
    	if(key==a[mid]) return mid;
    	else if(key>a[mid]) BS(a,key,mid+1,up);
    	else if(key<a[mid]) BS(a,key,low,mid-1);
    	return -1;
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʾreadInt()������ʱ����Ҫȥ�������������֮��Ҳ������.class�ļ���
		//ֱ��java BinarySearch w.txt < in.txt�Ϳ��Գ����
		//��δ�����Eclipse���б���������Dos���������� ����������ǻ㱨������һ��������.class�ĵ���
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
