import edu.princeton.cs.algs4.StdOut;

public class Date {
	
	private final int temp;
	
	public Date(int year,int month,int day){
		//if(year>=1 && year<=12 && month>=1 && month<=12 && day>=1 && day<=31){
		//private final int temp;//局部变量不能全局使用   
		temp = 512*year+32*month+day;
		//}
	}
	public int year(){
		return temp/512;
	}
	public int month(){
		return (temp/32)%16;
	}
	public int day(){
		return temp%32;
	
	}

	public String toString(){
		return year()+"/"+month()+"/"+day();
		
	}
	
	public static void main(String[] args){
		Date d = new Date(2011, 9, 1);
		StdOut.print(d.month()+" "+d.day()+" "+d.year()+"\n");
		StdOut.print(d);
		
	}
	
}
