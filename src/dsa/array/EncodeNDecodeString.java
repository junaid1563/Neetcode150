package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://neetcode.io/problems/string-encode-and-decode
public class EncodeNDecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String encode(List<String> strs) {
		if (strs.size() == 0) {
			return null;
		}
		String ans = "";
		for (String str : strs) {
			ans += str + ",@!";
		}
		return ans.substring(0, ans.length() - 3);
	}

	public List<String> decode(String str) {
		if (str == null) {
			return new ArrayList<>();
		}
		String[] ans = str.split(",@!");
		return new ArrayList<>(Arrays.asList(ans));
	}

}
