
public class LicenseKeys {
	public static void main(String[] args) {
		String str = args[0];// input string
		int k = Integer.parseInt(args[1]);
		String res = "";
		int temp = k;
		for (int i = 0; i < str.toCharArray().length; i++) {
			if (k == 0) {
				res = res + "-";
				k = temp;
			}
			if (str.toCharArray()[i] != '-' && k != 0) {
				res = res + String.valueOf(Character.toUpperCase(str.toCharArray()[i]));
				k--;
			}			
		}
		System.out.println(res);
	}

}
