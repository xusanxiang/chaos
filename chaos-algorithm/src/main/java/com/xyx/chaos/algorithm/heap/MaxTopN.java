package com.xyx.chaos.algorithm.heap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: MaxTopN
 * @Package com.xyx.chaos.algorithm.heap
 * @Description:
 * @date 20/6/30 上午11:19
 */
public class MaxTopN {

	private static final Logger logger = LoggerFactory.getLogger(MaxTopN.class);

	public static int getTopN(int[] nums, int k){

		//通过优先队列实现不完全大根堆，保障根结点为最大值
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

		for (int i=0;i<nums.length;i++){
			maxHeap.add(nums[i]);
		}

		for (int i=0;i<k-1;i++){
			maxHeap.remove();
		}
		return maxHeap.peek();
	}
}