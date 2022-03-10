import java.io.*;
public class IpStream {
	public static void main(String args[]) throws  IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter number");
		long num = Integer.parseInt(br.readLine());
		System.out.println("Enter entered " +num);
	}

}
