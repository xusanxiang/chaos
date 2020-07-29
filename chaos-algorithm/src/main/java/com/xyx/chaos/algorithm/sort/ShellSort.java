package com.xyx.chaos.algorithm.sort;

/**
 * 希尔排序
 * Created by xuyexin on 17/5/23.
 */
public class ShellSort extends BaseSort {
	@Override
	public int[] sort(int[] nums) {

		for (int step = nums.length / 2 - 1; step > 0; step = step / 2) {
			for (int i = 0; i < step; i++) {
				insertSort(nums, step, i);
			}

		}
		return nums;
	}

	/**
	 * 内部插入排序
	 *
	 * @param nums
	 * @param step
	 * @param start
	 */
	private void insertSort(int[] nums, int step, int start) {
		for (int i = start; i < nums.length; i += step) {
			for (int n = start; n < nums.length - step - i; n += step) {
				if (nums[n] > nums[n + step]) {
					exchange(nums, n, n + step);
				}
			}
		}

	}
}
