package com.xyx.chaos.algorithm.sort;

/**
 * 快速排序
 *
 * @author Xu Yexin
 * @Description :
 * @date 2017/6/6 15:08
 */
public class QuickSort extends BaseSort {
    @Override
    public int[] sort(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    /**
     * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
     *
     * @param numbers 带查找数组
     * @param low     开始位置
     * @param high    结束位置
     * @return 中轴所在位置
     */
    public int getMiddle(int[] numbers, int low, int high) {
        int temp = numbers[low];
        while (low < high){
            while (low<high && numbers[high] > temp){
                high--;
            }
            numbers[low] = numbers[high];
            while (low<high && numbers[low] < temp){
                low++;
            }
            numbers[high] = numbers[low];
        }
        numbers[low] = temp;
        return low;
    }

    /**
     * @param numbers 带排序数组
     * @param low     开始位置
     * @param high    结束位置
     */
    //TODO
    public void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int middle = getMiddle(numbers, low, high);
            quickSort(numbers, low, middle - 1);
            quickSort(numbers, middle + 1, high);
        }
    }
}
