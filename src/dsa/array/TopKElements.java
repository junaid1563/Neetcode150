package dsa.array;

import java.util.HashMap;
import java.util.Map;

// https://neetcode.io/problems/top-k-elements-in-list
public class TopKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] topKFrequent(int[] nums, int k) {
		int[] ans = new int[k];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.replace(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int x = 0;
		for (int i = 0; i < k; i++) {
			int maxF = Integer.MIN_VALUE, maxNum = Integer.MIN_VALUE;
			for (Map.Entry entry : map.entrySet()) {
				if ((int) entry.getValue() > maxF) {
					maxF = (int) entry.getValue();
					maxNum = (int) entry.getKey();

				}
			}
			System.out.println("maxF= " + maxF + ", maxNum = " + maxNum);
			ans[x++] = maxNum;
			map.remove(maxNum);

		}
		return ans;
	}
}
