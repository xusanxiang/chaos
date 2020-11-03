package com.xyx.chaos.algorithm.window;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: NoRepeatCountTest
 * @Package com.xyx.chaos.algorithm.window
 * @Description:
 * @date 20/11/3 上午10:34
 */
public class NoRepeatCountTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(NoRepeatCount.class);

	@Test
	public void testNoRepeatCount(){
		String s = "abba";
		NoRepeatCount noRepeatCount = new NoRepeatCount();
		LOGGER.info("max no repeat:" + noRepeatCount.noRepeatCount(s));
	}
}