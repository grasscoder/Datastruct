import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BagQuStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> stack = new Stack<String>();//创建一个空栈
        Queue<String> que = new Queue<String>();
        Bag<Integer> bag = new Bag<Integer>();//<>中必须是引用类型
        stack.push("hello");
        stack.push("world");
        StdOut.print(stack.size()+"\n");
        StdOut.println(stack.peek());
        
        //背包的典型用例子
        while(!StdIn.isEmpty()){
        	bag.add(StdIn.readInt());
        }
        int N = bag.size();
        double sum = 0.0;
        for(int x:bag){
        	sum = sum + x;
        	
        }
        double Avg = sum/N;
        StdOut.println(Avg);
	
	}

}
