package com.xyx.chaos.algorithm.sort;

public class BubbleSort extends BaseSort{

	/**
	 * 冒泡（int）
	 *
	 * @param nums
	 * @return
	 */
	@Override
	public int[] sort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		return nums;
	}
}
