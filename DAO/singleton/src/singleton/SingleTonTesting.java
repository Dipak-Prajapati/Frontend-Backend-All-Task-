package singleton;

public class SingleTonTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
	
		if(s1 == s2)
			System.out.println("Same");
		else
			System.out.println("Different");
	}

}
