package dsa.twopointers;

import java.util.*;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		// sort array
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			// fix target
			int target = -nums[i];
			if (i > 0 && nums[i] == nums[i - 1]) {
				// skip if numbers are duplicates
				continue;
			}
			// find two sum of sorted array
			List<List<Integer>> temp = twoSum(nums, i, target);

			for (List<Integer> list : temp) {
				list.add(nums[i]);
				ans.add(list);
			}

		}
		return ans;
	}

	public List<List<Integer>> twoSum(int[] nums, int i, int target) {

		// two sum 2
		List<List<Integer>> ans = new ArrayList<>();
		int l = i + 1, r = nums.length - 1;
		while (l < r) {
			List<Integer> list = new ArrayList<>();
			int sum = nums[l] + nums[r];
			if (sum < target) {
				l++;
			} else if (sum > target) {
				r--;
			} else {
				list.add(nums[l]);
				list.add(nums[r]);
				if (!ans.contains(list)) {
					ans.add(list);
				}

				l++;
				r--;
			}

		}
		return ans;
	}
}
