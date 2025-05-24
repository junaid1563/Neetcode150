package dsa.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int ans = Integer.MIN_VALUE;
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			set.add(i);
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (!set.contains(i - 1)) {
				map.put(i, 1);
			}
		}

		for (Map.Entry e : map.entrySet()) {
			int len = (int) e.getValue();
			int num = (int) e.getKey();
			while (set.contains(num + len)) {
				len = len + 1;
			}
			if (len > ans) {
				ans = len;
			}
		}
		return ans;
	}
}
