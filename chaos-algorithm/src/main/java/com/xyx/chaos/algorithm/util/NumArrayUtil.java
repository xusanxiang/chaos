package com.xyx.chaos.algorithm.util;

import java.util.Arrays;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: NumArrayUtil
 * @Package com.xyx.chaos.algorithm
 * @Description:
 * @date 20/7/3 下午4:34
 */
public class NumArrayUtil {

	public static int[] getIntArrays(int n){
		int[] nums = new int[n];
		for (int i=0;i<nums.length;i++){
			nums[i] = (int) (Math.random()*100);
		}
		return nums;
	}

	public static String printArray(int[] nums){
		String numStr = "";
		for (int i=0;i<nums.length;i++){
			numStr += nums[i] + ",";
		}
		if (numStr != null){
			numStr = numStr.substring(0, numStr.length()-1);
		}
		return numStr;
	}

	public static String printArray(int[][] nums) {
		return Arrays.deepToString(nums);
	}

}