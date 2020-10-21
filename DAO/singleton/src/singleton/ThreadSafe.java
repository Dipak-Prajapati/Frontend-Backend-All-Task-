package singleton;

public class ThreadSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ThreadSync ts = ThreadSync.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ThreadSync ts1 = ThreadSync.getInstance();
			}
		});
		t1.start();

//		try { Thread.sleep(10);}catch(Exception e) {}//

		t2.start();
	}

}

class ThreadSync {
	public static ThreadSync ts;

	private ThreadSync() {
		System.out.println("Instance Created :");
	}

//	Without Syncronized

	/*
	 * public static ThreadSync getInstance() { if (ts == null) { ts = new
	 * ThreadSync(); } return ts; }
	 */

//With Syncronized	

	/*
	 * public static synchronized ThreadSync getInstance() { if (ts == null) { ts =
	 * new ThreadSync(); } return ts; }
	 */

// Double Checking 

	public static ThreadSync getInstance() {
		if (ts == null) {
			synchronized (ThreadSync.class) {
				if (ts == null) {
					ts = new ThreadSync();
				}

			}
		}
		return ts;
	}

}