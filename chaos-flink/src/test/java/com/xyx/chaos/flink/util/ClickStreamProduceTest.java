package com.xyx.chaos.flink.util;

import com.xyx.chaos.flink.kafka.util.ClickStreamProduce;
import org.junit.Test;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: ClickStreamProduceTest
 * @Package com.xyx.chaos.flink.util
 * @Description:
 * @date 20/7/30 下午11:19
 */
public class ClickStreamProduceTest {

	@Test
	public void testProduceClick(){
		ClickStreamProduce clickStreamProduce = new ClickStreamProduce("127.0.0.1:9092","test");
		try {
			clickStreamProduce.produceClick(100,100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}