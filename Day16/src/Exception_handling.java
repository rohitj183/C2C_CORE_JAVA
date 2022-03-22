
public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50/2;
		System.out.println(num);
		
		int num1 = 50/10;
		System.out.println(num1);
		
		try {			
		int num2 = 50/0;
		}
		catch(Exception e) {
			System.out.println("can't Execute - " +e );			
		}
		
		int num3 = 50/25;
		System.out.println(num3);



	}

}
