import edu.princeton.cs.algs4.StdOut;
//
//public class Interf {
//	public interface Datable{
//		
//		int year();
//		int month();
//		int day();
//			
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        String str1 = "hello";
//        String str2 = str1;
//        str1 = "world";
//        StdOut.print(str1+" ");
//        StdOut.print(str2);
//        
//	}
//
//}

// Java接口学习
interface Person{  
    void eat();  
    void sleep();  
}  
 //一个Java文档可以有多个类，但是只能有一个java公共public类 
class Student implements Person{  
    public void eat(){  //继承Person接口，类中必须实现接口中的抽象方法eat().下同
       System.out.println("学生去食堂吃饭！");  
    }  
    public void sleep(){  
       System.out.println("学生回寝室睡觉！");  
    }  
}  
   
class Teacher implements Person{  
    public void eat(){  
       System.out.println("教师去教工餐厅吃饭！");  
    }  
    public void sleep(){  
       System.out.println("教师回学校公寓睡觉！");  
    }  
}  
 class Parents implements Person{  
	 private int i = 3;
    public void eat(){  
       System.out.println("家长去招待所饭馆吃饭！");  
    }  
    public void sleep(){  
       System.out.println("家长回招待所睡觉！");  
    }  
}  
class Foreign implements Person{  
    public void eat(){  
       System.out.println("外宾去酒店吃饭！");  
    }  
    public void sleep(){  
       System.out.println("外宾回酒店睡觉！");  
    }  
}  
   
class Leader implements Person{  
    public void eat(){  
       System.out.println("领导去宾馆吃饭！");  
    }  
    public void sleep(){  
       System.out.println("领导回宾馆睡觉！");  
    }  
}  
   
public class Interf{  //一个Java文档只能有一个public类
         public static void main(String[] args)  
         {  
                   Person p=new Student(); //创建一个Student 对象，定义一个Person类型的引用变量p
                   p.eat();  
                   p.sleep();  
                   p=new Teacher();  
                   p.eat();  
                   p.sleep();  
                   p=new Parents();
//                   StdOut.println(p.i);
                   p.eat();  
                   p.sleep();  
                   p=new Foreign();  
                   p.eat();  
                   p.sleep();  
                   p=new Leader();  
                   p.eat();  
                   p.sleep();  
                   Person p1 = new Foreign();
                   p1.eat();
                   p1.sleep();
         }  
}  