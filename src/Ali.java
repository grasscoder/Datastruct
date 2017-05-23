import java.util.Arrays;
public class Ali {
	
	public static int max(int[] n){
		int temp = n[0];
 		for(int i=1;i<n.length;i++){
		   	if(n[i]>temp) temp = n[i];
			
		}
 		
		return temp;
	}
	
	
	
//将一个数组拆成和相等的两部分
	public static boolean partition(int[] n){
		int sum = 0;
		for(int i=0;i<n.length;i++){
			sum +=n[i];
		}
		
		if(sum%2!=0) return false;
		else{
			Arrays.sort(n);
			int halfsum=0;
			for(int i=0;i<n.length-1;i++){
				halfsum += n[i];
				if(halfsum==sum/2) return true;
			}
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,3,5,7,9,11};
Arrays.sort(a);
for(int i=0;i<a.length;i++){
//	System.out.println(a[i]);
}
System.out.println(127>>1);
int x= 500;
while(x!=0){
    x= x&(x-1);
//	System.out.println(x);
		
}
	}

}
