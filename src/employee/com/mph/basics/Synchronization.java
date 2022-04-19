package employee.com.mph.basics;
class A{
	synchronized void sum(int n) {
		Thread t=Thread.currentThread();
		for(int i=1;i<6;i++) {
			System.out.println(t.getName()+"  "+(n+i));
		}
	}
}
class Synco extends Thread{

	A a=new A();
	public void run() {
	 a.sum(10);
 }
}
public class Synchronization {
    public static void main(String[] args) {
		
		Synco num=new Synco();
		Thread t1=new Thread(num);
		Thread t2=new Thread(num);
		t1.setName("thread a");
		t2.setName("thread b");
		t1.start();
		t2.start();
	}

}

