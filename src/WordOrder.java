import edu.princeton.cs.algs4.StdOut;

public class WordOrder {

	//�ж��ַ��������еĵ����Ƿ��ǣ�ǰһ�����ʵ�β��ĸ�Ƿ��Ƕ�һ�����ʵ�����ĸ��
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
