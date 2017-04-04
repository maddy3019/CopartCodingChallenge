import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		int answer = 0, factor = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        answer += (str.charAt(i) - '0') * factor;
	        factor *= 10;
	    }
		System.out.println(answer);
	}

}
