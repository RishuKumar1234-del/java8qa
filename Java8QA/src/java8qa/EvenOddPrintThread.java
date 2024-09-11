package java8qa;

public class EvenOddPrintThread implements Runnable {
	
	Object object;
	static int i=1;
	public EvenOddPrintThread(Object object) {
		this.object=object;
	}
	@Override
	public void run() {
		while(i<10) {
			if(i%2==0 && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println(Thread.currentThread().getName()+" : " +i);
					i++;
					
					try {
						object.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
			if(i%2!=0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (object) {
					System.out.println(Thread.currentThread().getName() + " " +i);
					i++;
					object.notify();
				}
				
			}
		}
		
	}

}
