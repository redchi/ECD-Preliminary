package Thread_Dev;

public class MainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainT m  = new MainT();
		m.run();
	}
	
	public MainT() {}
	static long t;
	static int counter;
	public static void count(long time_mili) {
		counter = counter + 1; 
		if (counter == 3) {
			
			t = System.currentTimeMillis() - t;
			System.out.println("It took -> "+ t+" for everything to be processed");
		}
	}
	
	
	public void run() {
		
		//System.out.println(System.currentTimeMillis());
		Thread t1 = new Thread(new person(100,"1"));
		Thread t2 = new Thread(new person(106,"2"));
		Thread t3 = new Thread(new person(100,"3"));
		
		
		
		long t_time = System.currentTimeMillis();
		t = t_time;
		t1.start();
		t2.start();
		t3.start();
		
		t_time = System.currentTimeMillis() - t_time;
		System.out.println("Total time taken = " + t_time);
		//System.out.println(System.currentTimeMillis());
		
		
	}
	

}
