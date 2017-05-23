import edu.princeton.cs.algs4.StdOut;

public class WordOrder {

	//实现对字符串排血的静态函数
	//静态函数与实力函数的区别是：静态方法的功能是实现函数功能，实例函数的作用是：对数据类型的操作
	public static int wordListOrder(String[] arr){
		int arrlength = arr.length-1;
		for(int i=0;i<arrlength;i++){
			if(arr[i].charAt(arr[i].length()-1)!=arr[i+1].charAt(0)){
				return -1;
			}
			
		}
		return 1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"abcd","defg","ghi","idss"};
		StdOut.println(wordListOrder(arr));
        
		
		
	}

}
