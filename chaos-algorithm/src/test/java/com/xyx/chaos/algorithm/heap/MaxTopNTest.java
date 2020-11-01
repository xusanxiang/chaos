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
 * @Description: com.xyx.chaos.algorithm.heap.MaxTopN 功能测试
 * @date 20/7/3 下午4:33
 */
public class MaxTopNTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MaxTopNTest.class);

	private int[] nums;

	public MaxTopNTest(){
		this.nums = NumArrayUtil.getIntArrays(20);
        LOGGER.info("Origin num:" + NumArrayUtil.printArray(nums));
	}

	@Test
	public void testMaxTopN(){
		int n = MaxTopN.getTopN(nums, 2);
		BaseSort sort = new BubbleSort();
        LOGGER.info("Sorted num:" + NumArrayUtil.printArray(sort.sort(nums)));
        LOGGER.info("Top 2 Max num:" +n);
	}

}