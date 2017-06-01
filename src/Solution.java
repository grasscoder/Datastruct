
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
public class Solution {
	
	public  int minNumberInRotateArray(int [] array) {//旋转数组着最小值
        int len = array.length;
        if (len==0)return 0;
        int temp = 0;
        for(int j=len-1;j>0;){//从后往前找
            if(array[j]>=array[j-1])j--;
            else {
            	temp = array[j]; 
            	break;
            }
        }
        return temp;
   }

	public  int[] reOrderArray(int [] array) {
		if(array.length==0){System.out.println("the length of the array equals 0");}
		else if (array.length==1){return array;}
		if(array.length > 1){
			for(int n=0,j = array.length-1;n<j;n++){
				for(int i=0;i<j;i++){
					if((array[i]&1)==0&&(array[i+1]&1)==1){ 
						array[i] = array[i+1]^array[i];
						array[i+1] = array[i+1]^array[i];
						array[i] = array[i+1]^array[i];
					}
				}
			}
		}
		return array;
    }
	}
}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int []a = {3,4,5,6,7,8,9,1,2,3,3};
//		int []b = {1,2,3,4,5,6,7};
//		
////		int t = minNumberInRotateArray(a);
//		int[] t = reOrderArray(b);
//		for(int i=0;i<=t.length-1;i++){
//			
//			System.out.println( t[i]);	
//		}
//	}

//}
