package com.xyx.chaos.algorithm.sort;

/**
 * @author XuYexin
 * @Description :
 * @date 2017/4/14
 */
public class InsertSort extends BaseSort {
	@Override
	public int[] sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int n = i; n > 0; n--) {
				if (nums[n] < nums[n-1]) {
					exchange(nums, n - 1, n);
				}
			}
		}

		return nums;
	}
}
