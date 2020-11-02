package com.xyx.chaos.algorithm.hash;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: TwoSumTest
 * @Package com.xyx.chaos.algorithm.hash
 * @Description:
 * @date 20/11/2 下午10:08
 */
public class TwoSumTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwoSumTest.class);

	@Test
	public void testTwoSum(){
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		TwoSum twoSum = new TwoSum();
		int[] result = twoSum.twoSum(nums, 4);
		if (null != result) {
			LOGGER.info("first position:" + result[0] + " , second position:" + result[1]);
		}else {
			LOGGER.info("no match");
		}
	}
}