package com.xyx.chaos.algorithm;

import com.xyx.chaos.algorithm.util.NumArrayUtil;
import org.junit.Test;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: RadomIdea
 * @Package com.xyx.chaos.algorithm.sort
 * @Description:
 * @date 20/7/15 下午2:23
 */
public class RandomIdea {


	/**
	 * 从给定的所有帖子中，随机选出N页，每页M个帖子，保证不重复，
	 * 如果帖子不足以填充，ID拿-1补齐
	 * @param postIDs 已经排除推荐贴，垃圾贴之后的所有帖子ID数组
	 * @param pageCount 页面总数
	 * @param positionCount 每页随机位置个数
	 * @return 二维数组，每一行为一页帖子的ID，不够的位置-1补齐
	 */
	public int[][] getRandomPostIDs(int[] postIDs, int pageCount, int positionCount){
		int[][] selectedPostIds = new int[pageCount][positionCount];
		//PHP代码为count(postIDs)
		int postIdLength = postIDs.length;
		int selectedCount = 0;
		for (int k=0;k<pageCount;k++){
			for (int i=0;i<positionCount;i++){
				//待随机选取的数量已经超过帖子数量，补-1表示选完了
				if (selectedCount >= postIdLength){
					selectedPostIds[k][i] = -1;
				}else {
					//采用直接插入排序思想，将当前选出的帖子挪到已选序列末位，
					// 保障已选位置有序，随机位从无序中选下一位
					int randomPosition = (int) (Math.random() * (postIdLength - selectedCount)) + selectedCount;
					exchange(postIDs,randomPosition,selectedCount);
					selectedPostIds[k][i] = postIDs[selectedCount];
				}
				selectedCount++;
			}
		}
		return selectedPostIds;
	}

	/**
	 * 交换数组中两个位置
	 * @param nums
	 * @param index1
	 * @param index2
	 */
	public static void exchange(int[] nums, int index1, int index2){
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

	@Test
	public void test(){
		int[] origin = NumArrayUtil.getIntArrays(5);
		System.out.println(NumArrayUtil.printArray(getRandomPostIDs(origin,5,10)));

	}

}