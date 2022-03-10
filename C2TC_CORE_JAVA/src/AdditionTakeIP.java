import java.io.*;
public class AdditionTakeIP {
	public static void main(String args[]) throws  IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter number 2 number");
		int num = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println("Addition =  " +(num+num2));
	}

}
