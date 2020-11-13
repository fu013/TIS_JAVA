package expression;

public class StringCompare {

	public static void main(String[] args) {
		String a = "abc", b = "cba";
		
		if (a.compareTo(b) > 0) {
			System.out.println("a");
		} else {
			System.out.println("b");
		}
	}

}
