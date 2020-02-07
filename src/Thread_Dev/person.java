package Thread_Dev;

public class person implements Runnable {
	int time; 
	String id;
	
	public person(int time_taken_to_run,String id) {
		time = time_taken_to_run;
		this.id = id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long t_time = System.currentTimeMillis();
	
		try {
			Thread.sleep(time);
			System.out.println(id +" has stoped running");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		t_time = System.currentTimeMillis() - t_time;
		System.out.println("Total time taken for "+ id + " -> " + t_time + " should be -> "+ time );
		MainT.count(t_time); 
	}

}
