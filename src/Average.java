import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
public class Average {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	////��׼����
//		double sum = 0.0;
//		int count=0;
//		while(!StdIn.isEmpty()){//������ϣ��س�������һ�У�crtl+z
//		    
//			sum += StdIn.readDouble();
//			count++;
//		}
//		double Avg = sum/count;
//		StdOut.printf("Average is %.5f",Avg);
//		
//		
//	}

	public static void main(String[] args) {
		String s = "Let's go for lunch!";
		In in = new In("in");
	       
       String[] whitelist = in.readAllStrings();//���ļ��е��ַ�����ȡ��������
       for(int i=0;i<whitelist.length;i=i+3)
    	   
       {
    	  
    	 StdOut.print(whitelist[i]+"  "+whitelist[i+1]+"  "+whitelist[i+2]+"  ");
    	 double m=Double.parseDouble(whitelist[i+1]);
    	 double n=Double.parseDouble(whitelist[i+2]);
    	   StdOut.printf("0.3%",m/n);
    	
    		 StdOut.println("  ");
       }
       }

	
	
}
