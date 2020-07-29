package com.xyx.chaos.algorithm.sort;

/**
 * @author XuYexin
 * @Description :
 * @date 2017/4/13
 */
public abstract class  BaseSort {

    public abstract  int[] sort(int[] nums);

    /**
     * 交换数组中两个数
     * @param nums
     * @param index1
     * @param index2
     */
    public static void exchange(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
