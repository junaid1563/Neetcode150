package dsa.twopointers;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {

		int i = 0, j = s.length() - 1;
		while (i < j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);

			if (Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2)) {
				if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
					return false;
				} else {
					i++;
					j--;
				}
			}

			if (!Character.isLetterOrDigit(ch1)) {
				i++;
			}
			if (!Character.isLetterOrDigit(ch2)) {
				j--;
			}
		}
		return true;
	}
}
