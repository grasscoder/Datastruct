
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double sum = 0.0;
		int count=0;
		while(!StdIn.isEmpty()){//直接按Ctrl + Z 键，会直接出结果，不需要在命令行或者Run Configuration->arguments输入数据,需要在input选择input文件即可
		    
			double temp =  StdIn.readDouble();
			System.out.println(temp);
			sum += temp;
			count++;
		}
		double Avg = sum/count;
		StdOut.printf("sum is %.5f\n",sum);
		StdOut.printf("Average is %.5f",Avg);
		//directly press ctrl + Z ,and no data need to input,and it will calculate the number in out.txt
		
		
	}

//	public static void main(String[] args) {
//		String s = "Let's go for lunch!";
//		In in = new In("in");
//	       
//       String[] whitelist = in.readAllStrings();
//       for(int i=0;i<whitelist.length;i=i+3)
//    	   
//       {
//    	  
//    	 StdOut.print(whitelist[i]+"  "+whitelist[i+1]+"  "+whitelist[i+2]+"  ");
//    	 double m=Double.parseDouble(whitelist[i+1]);
//    	 double n=Double.parseDouble(whitelist[i+2]);
//    	   StdOut.printf("0.3%",m/n);
//    	
//    		 StdOut.println("  ");
//       }
//       }

	
	
}
