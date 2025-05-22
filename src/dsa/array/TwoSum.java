package dsa.array;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		// for(int i=0;i<nums.length;i++){
		// for(int j=i+1;j<nums.length;j++){
		// if(nums[j]==target-nums[i]){
		// ans[0]=i;
		// ans[1]=j;
		// break;
		// }
		// }
		// }
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		System.out.println(map.toString());
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff) && map.get(diff) != i) {
				ans[0] = i;
				ans[1] = map.get(diff);
				break;
			}
		}

		return ans;
	}

}
