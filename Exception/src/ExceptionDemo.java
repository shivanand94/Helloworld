
public class ExceptionDemo {

	public static void main(String[] args) {
		int x;
	try {
		x = 10/0;
		
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("inside catch");
		
	}
	}

}
