package singleton;

public class SingleTonEager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTonn s1 = SingleTonn.getInstance();
		
	}

}

class SingleTonn
{
	public static SingleTonn single = new SingleTonn();
	private SingleTonn()
	{
		
	}
	
	public static SingleTonn getInstance()
	{
		System.out.println("Hey");
		return single;
	}
}