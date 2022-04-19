package employee.com.mph.basics;

class numbersV implements Runnable{
	public void run() {
		try {
			odd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		even();
	}
	
	
	public void odd() throws InterruptedException {
		
		for(int i=1;i<9;i=i+2) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public void even() {
		for(int i=2;i<9;i=i+2) {
		
					System.out.println(i);
				}
			}
		}

		public class MutliThreading {
			public static void main(String[] args) {
				
				           
				numbersV num=new numbersV();
				Thread t=new Thread(num);
				t.setName("thread a");
				System.out.println(t.getName());
				t.start();
			//	System.out.println(t.getName()+" "+t.getId()+"  "+t.getState()+" "+t.getThreadGroup());
				Thread t1=new Thread(num);
				t1.setName("thread b");
				System.out.println(t1.getName());
				t1.start();
			}

		}




