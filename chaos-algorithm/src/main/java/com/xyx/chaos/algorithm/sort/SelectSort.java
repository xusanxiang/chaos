package com.xyx.chaos.algorithm.sort;

/**
 * @author XuYexin
 * @Description :
 * @date 2017/4/13
 */
public class SelectSort extends BaseSort {
    @Override
    public int[] sort(int[] nums) {
        for (int i=0;i<nums.length-1;i++){
            int nowSmall = i;
            for (int n=i;n<nums.length;n++){
                if (nums[n]<nums[nowSmall]){
                    nowSmall = n;
                }
            }
            int temp = nums[i];
            nums[i] = nums[nowSmall];
            nums[nowSmall] = temp;
        }

        return nums;
    }
}
