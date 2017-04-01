import edu.princeton.cs.algs4.StdOut;

public class WordOrder {

	//判断字符串数组中的单词是否是：前一个单词的尾字母是否是都一个单词的首字母，
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
