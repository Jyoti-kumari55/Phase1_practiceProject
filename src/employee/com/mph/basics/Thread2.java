package employee.com.mph.basics;


class NumIteratorable implements Runnable{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {
		
		           //thread object
		NumIteratorable num=new NumIteratorable();
		//
		Thread thread = new Thread(num);
		thread.start();
	}

}





