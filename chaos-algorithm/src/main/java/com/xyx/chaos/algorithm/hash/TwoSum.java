package com.xyx.chaos.algorithm.hash;

import java.util.HashMap;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: TwoSum
 * @Package com.xyx.chaos.algorithm.hash
 * @Description:
 * @date 20/11/2 下午9:48
 */
public class TwoSum {

	/**
	 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target){
		//构建HashMap，通过Hash解决查找对应值的问题
		HashMap<Integer, Integer> hashMap = new HashMap();
		for(int i=0;i<nums.length;i++){
			hashMap.put(nums[i], i);
		}

		for (int i=0; i<nums.length; i++){
			int otherValue = target-nums[i];
			if (null != hashMap.get(otherValue)){
				int otherValueIndex = hashMap.get(otherValue);
				if (i!=otherValueIndex){
					return new int[]{i, otherValueIndex};
				}
			}
		}
		return null;
	}

}