
public class LicenseKeys {
	public static void main(String[] args) {
		String str = args[0];// input string
		int k = Integer.parseInt(args[1]);// number of split chars
		String res = "";
		int temp = k;
		for (int i = 0; i < str.toCharArray().length; i++) {
			if (k == 0) {
				// when k chars are appended, reset k and append '-'
				res = res + "-";
				k = temp;
			}
			if (str.toCharArray()[i] != '-' && k != 0) {
				// while k chars are not appended, convert each char to upper
				// case and append to result string
				res = res + String.valueOf(Character.toUpperCase(str.toCharArray()[i]));//
				k--;
			}
		}
		System.out.println(res);
	}

}
