import java.util.EmptyStackException;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Matrix {
	public static double dot(double[] x,double[] y){
		//���������������ڻ�
		double sum = 0;
		try{
		    if(x.length != y.length){
			    throw new Exception("Exception:The length of the two vectors must be the same length!");
		    }//end if
		    else {
			    for(int i=0;i<x.length;i++){
				    sum = sum + x[i]*y[i];
			    }//end for
		    
		    }//end else
		}//end try
		catch(Exception e){ 
			StdOut.println(e.getMessage());
		}
		return sum;
	}//end method dot
	
	public static double[][] transposition(double[][] x){
		//�����������ǽ�һ������ά����ת�ã�������һ��ת�þ���
		 int xrow = x.length,xcolumn = x[0].length;
		double[][] y = new double[xcolumn][xrow];
		for(int i=0;i<xrow;i++){
			for(int j=0;j<xcolumn;j++){
                y[j][i] = x[i][j]; 
			}//end inner for
		}//end outer for
		return y;
		
	}//end method transposition
	
	public static double[][] mult(double[][] x,double[][] y){
		//������������ĳ˻��������ض�ά����ļ�����
		int xrow = x.length,xcolumn = x[0].length;
		int yrow = y.length,ycolumn = y[0].length;
		double[][] xy = new double[xrow][ycolumn];
		try{
		    if(xcolumn!=yrow){
			    throw new Exception("Exception:xcolumn must be equal to yrow");
		    }//end if
		    else{
			    for(int i=0;i<xrow;i++){
			        for(int j=0;j<ycolumn;j++){
			        	//�������������ĳ˻����Ա�����
			    	    xy[i][j] = dot(x[i],transposition(y)[j]);
			        }//end inner for   
			    }//end outer for
		    }//end else
		    
	    }//end try
		catch(Exception e){StdOut.println(e.getMessage());}
		return xy;
	} 
	    
	    public static double[] mult(double[][] x,double[] y){
	    	/*//����������ĳ˻�*/	    	
	    	int xrow = x.length,xcolumn = x[0].length;
	    	int yrow = y.length;//����y��Java��������Ϊ�������ʽ��ʾ�ģ�������Ҫ����ת�á�
            double[] xy = new double[xrow];
            try{
            	if(xcolumn!=yrow){
            		throw new Exception("Exception:x's column must be equal to y's row");
            	}//end if
            	else{
                    for(int i=0;i<x.length;i++){
            	        xy[i] = dot(x[i],y);
                    }//end for
            	}//end else
             }//end try
            catch(Exception e){
            	StdOut.println(e.getMessage());
            } 
	    	return xy;
	    }
	    
	    public static double[] mult(double[]y,double[][]x){
	    	//�����;���ĳ˻�
//	    	int yrow = y.length;
//	    	int xrow = x.length;
	    	int xcolumn = x[0].length;
	    	double[] xy = new double[xcolumn];
	    	for(int i=0;i<xcolumn;i++){
	    		xy[i] = dot(y,transposition(x)[i]);
	    	}//end for
	    	return xy;
	   }//end method
	    
    	public static void main(String[] args){
////		
//		int a[][] = new int[5][6];
//		a[0][1] =1;
//		for(int i=0;i<a.length;i++){
//			for(int j=0;j<a[0].length;j++){
//		       StdOut.print(a[i][j]+" ");
//			}
//			StdOut.println();
    	////�����ʼ��
//    		int M=4,N =3;
//    		double[][] a,b;
//    		double[] c ={2.0,6.0,4.0,9.0};
//    		double[] d ={1.0,9.0,7.0};
//    		//Ϊ�˷�ֹ������������л������д��������һ������
//    		a = new double[M][N];
//    		b = new double[N][M];
    		//��ʼ����������
//    		for(int i=0;i<M;i++){
//    			for(int j=0;j<N;j++){
//    				a[i][j] = 1.0*StdRandom.uniform(1, 10);
//    				
//    				StdOut.printf("%-4.1f",a[i][j]);
//    			}//end inner for a
//    			StdOut.println();	
//    		}//end outer for a
//    		StdOut.println();
//    		for(int i=0;i<N;i++){
//    			for(int j=0;j<M;j++){
//    				b[i][j] =1.0*StdRandom.uniform(1, 10);
//    				StdOut.printf("%-4.1f",b[i][j]);
//    			}//end inner for b
//    			StdOut.println();	
//    		}//end outer for b
//    		StdOut.println();
////    		double[][] m = mult(a,b);
////    		for(int i=0;i<m.length;i++){
//    			for(int j=0;j<m[0].length;j++){
//    				StdOut.printf("%-7.1f",m[i][j]);
//    			}
//    			StdOut.println();
//    		}
    		//����*���� ��������
//    		for(int i=0;i<a.length;i++){
//    			StdOut.println(mult(a,d)[i]);
//    		}
//    		StdOut.println();
//    		//����*�����������
//    		for(int i=0;i<a[0].length;i++){
//    			StdOut.print(mult(c,a)[i]+" ");
//    		}
//    		
    		
		}//end main()
}//end class
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


