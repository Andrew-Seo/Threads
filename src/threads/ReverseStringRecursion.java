package threads;

public class ReverseStringRecursion {
	public static void main(String[] args) {
		System.out.println(Reverse("hello"));
	}
	static String Reverse (String x){
	if (x.length() == 1) {
		return x;
	}	
	else {
		return Reverse(x.substring(1)) + x.charAt(0);
	}
	}
}
