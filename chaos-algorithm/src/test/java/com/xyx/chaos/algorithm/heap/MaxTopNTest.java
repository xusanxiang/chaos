package com.xyx.chaos.algorithm.heap;

import com.xyx.chaos.algorithm.util.NumArrayUtil;
import com.xyx.chaos.algorithm.sort.BaseSort;
import com.xyx.chaos.algorithm.sort.BubbleSort;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: MaxTopNTest
 * @Package com.xyx.chaos.algorithm.heap
 * @Description:
 * @date 20/7/3 下午4:33
 */
public class MaxTopNTest {

	private static final Logger logger = LoggerFactory.getLogger(MaxTopNTest.class);

	private int[] nums;

	public MaxTopNTest(){
		this.nums = NumArrayUtil.getIntArrays(20);
		logger.info("Origin num:" + NumArrayUtil.printArray(nums));
	}

	@Test
	public void testMaxTopN(){
		int n = MaxTopN.getTopN(nums, 5);
		BaseSort sort = new BubbleSort();
		logger.info("Sorted num:" + NumArrayUtil.printArray(sort.sort(nums)));
		logger.info("Top 2 Max num:" +n);
	}

}