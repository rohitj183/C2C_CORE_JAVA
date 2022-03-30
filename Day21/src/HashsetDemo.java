import java.util.*;
public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(11);
		hs.add(45);
		hs.add(42);
		System.out.println(hs);
		hs.add(12);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
	}

}
