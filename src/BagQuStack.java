import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BagQuStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> stack = new Stack<String>();//定义一个栈
        Queue<String> que = new Queue<String>();
        Bag<Integer> bag = new Bag<Integer>();
//        stack.push("hello");
//        stack.push("world");
//        StdOut.print(stack.size()+"\n");
//        StdOut.println(stack.peek()+"\n");
	
        
        
        while(!StdIn.isEmpty()){
        	bag.add(StdIn.readInt());
        }
        int N = bag.size();
        double sum = 0.0;
        for(int x:bag){
        	sum = sum + x;
        	
        }
        double Avg = sum/N;
//        StdOut.print(stack.size()+"\n");
        StdOut.println(Avg);
       
	}

}
