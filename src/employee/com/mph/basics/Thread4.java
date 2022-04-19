package employee.com.mph.basics;
// single threading
class Number implements Runnable{
	public void run() {
		oddnum();
		evenum();
	}
	
	
	public void oddnum() {
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
	
	public void evenum() {
		for(int i=2;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
}

public class Thread4 {
	public static void main(String[] args) {
		
		           
		Number num=new Number();
		Thread t=new Thread(num);
		System.out.println(t.getName());
		t.start();
	//	System.out.println(t.getName()+" "+t.getId()+"  "+t.getState()+" "+t.getThreadGroup());
		Thread t1=new Thread(num);
		System.out.println(t.getName());
		t1.start();
	}

}



