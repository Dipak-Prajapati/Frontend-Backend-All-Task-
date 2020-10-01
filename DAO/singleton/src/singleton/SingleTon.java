package singleton;

public class SingleTon {
	
	/* lazy */
	private static SingleTon single;
	private SingleTon()
	{
		
	}
	
	public static SingleTon getInstance()
	{
		/*
		 * if(single == null) { single = new SingleTon(); }
		 */
		single = new SingleTon();
		return single;
	}
}
