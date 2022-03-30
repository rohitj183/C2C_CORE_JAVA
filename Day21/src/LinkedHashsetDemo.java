import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashsetDemo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Set<Integer> hs = new LinkedHashSet<Integer>();
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

