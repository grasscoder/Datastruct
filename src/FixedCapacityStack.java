
public class FixedCapacityStack<Item> {//泛型定容栈抽象数据类型的实现,
	private Item[] a;//栈名
	private int n;//当前定容栈的大小
	public FixedCapacityStack(int cap){//初始化栈用数组的容量
//		Item []b = new Item[cap]; //Java不允许创建泛型数组
		a = (Item[]) new Object[cap];//创建泛型数组是不允许的，但是可以通过强制类型转换实现
	}
	
	public boolean isEmpty(){
		return n==0;
	}
	
	public int size(){//栈中元素的个数
		return n;
	}
	
//	public <Item> Item[] resize(int max){//泛型方法就是一种对所有数据类型的的普适方法的实现
//		Item[] temp = (Item[]) new Object[max];
//		for(int i=0;i<this.n;i++){
//			temp[i] = (Item)this.a[i];//如果不进行强制Item类型转化的话，报错，不知道为什么
//			}
//		return temp;
//	}
	public void resize(int max){//泛型方法就是一种对所有数据类型的的普适方法的实现
		Item[] temp = (Item[]) new Object[max];
		for(int i=0;i<this.n;i++){
			temp[i] = this.a[i];
		}
		a = temp;
		temp = null;//我自己加的
	}
	
	public void push(Item item){
		a[n++] = item;//调用此函数之后n自动+1,此时n的位置没有元素是个空位置(具体是什么元素，取决于实例化对象的类型的默认值)
	}
	public Item pop(){
		Item temp = a[--n];
		a[n]=null;//避免出现游离现象
		if(n>0 && n==a.length/4) resize(a.length/2);
		return temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		int []a = new int[4];
//		int []a = {1,2,3,4,5};
//		int n =2,m=2;
//		System.out.println(a[n--]);
//		System.out.println(a[--m]);
		FixedCapacityStack<Integer> s = new FixedCapacityStack<Integer>(10);
		s.push(12);
		s.push(8);
		s.push(90);
		
		System.out.println(s.size());
		int t = s.pop();
		System.out.println(t);
		System.out.println(s.size());
		s.resize(20);
		
	}

}
