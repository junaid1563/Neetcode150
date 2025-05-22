package dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> ans = new ArrayList<>();
		List<String> list = new ArrayList<>();
		for (String str : strs) {
			list.add(str);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null) {
				List<String> temp = new ArrayList<>();
				String str = list.get(i);
				temp.add(str);
				list.set(i, null);
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(j) != null && isAnagram(str, list.get(j))) {
						temp.add(list.get(j));
						list.set(j, null);
					}
				}
				System.out.println(list.toString());
				ans.add(temp);
			}

		}
		return ans;
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map1.containsKey(s.charAt(i))) {
				map1.put(s.charAt(i), 1);
			} else {
				map1.replace(s.charAt(i), map1.get(s.charAt(i)) + 1);
			}
			if (!map2.containsKey(t.charAt(i))) {
				map2.put(t.charAt(i), 1);
			} else {
				map2.replace(t.charAt(i), map2.get(t.charAt(i)) + 1);
			}
		}
		if (map1.equals(map2)) {
			return true;
		}
		return false;
	}

	public boolean isAnagram2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Integer> map1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map1.containsKey(s.charAt(i))) {
				map1.put(s.charAt(i), 1);
			} else {
				map1.replace(s.charAt(i), map1.get(s.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			if (map1.containsKey(t.charAt(i))) {

				map1.replace(t.charAt(i), map1.get(t.charAt(i)) - 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			if (entry.getValue() != 0) {
				return false;
			}
		}

		return true;
	}

}
