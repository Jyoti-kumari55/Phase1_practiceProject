package employee.com.mph.basics;

class NumberValues extends Thread{
		public void run() {
			oddseq();
		}
		
		
	  void oddseq() {
			for(int i=1;i<9;i=i+2) {
				System.out.println(i);
			}
		}
		
		
	}
	class NumberValues1 extends Thread{
		public void run() {
			evenseq();
		}
		

		
		public void evenseq() {
			for(int i=2;i<9;i=i+2) {
				System.out.println(i);
			}
		}
	}
	public class Synchronization1{
		public static void main(String[] args) {
			
			           
			NumberValues num = new NumberValues();
			NumberValues1 num1= new NumberValues1();
			num.setPriority(6);
			num1.setPriority(1);
			num.start();
			num1.start();
		}

	}

