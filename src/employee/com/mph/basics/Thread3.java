package employee.com.mph.basics;



class NumNumber implements Runnable{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
}

public class Thread3 {
	public static void main(String[] args) {
      NumNumber num=new NumNumber();
      Thread thread = new Thread(num);
      thread.start();
      Thread t = new Thread(num);
      t.start();

      
      

}

}



