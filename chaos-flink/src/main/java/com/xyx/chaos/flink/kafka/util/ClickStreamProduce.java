package com.xyx.chaos.flink.kafka.util;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.Random;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: ClickStreamProduce
 * @Package com.xyx.chaos.flink.kafka.util
 * @Description: 伪造生产点击流数据
 * @date 20/7/30 下午10:53
 */
public class ClickStreamProduce {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClickStreamProduce.class);

	private String topic;

	private Properties properties;

	private ProducerConfig producerConfig;

	private Producer<String, String> producer;

	public ClickStreamProduce(String brokerList, String topic) {
		this.topic = topic;
		this.properties = new Properties();
		this.properties.put("serializer.class", "kafka.serializer.StringEncoder");
		this.properties.setProperty("metadata.broker.list", brokerList);
		this.producerConfig = new ProducerConfig(properties);
		this.producer = new Producer<String, String>(producerConfig);
	}

	/**
	 * 产生指定数量的模拟点击流数据
	 * @param num1
	 * @param delay
	 * @throws InterruptedException
	 */
	public void produceClick(int num1, int delay) throws InterruptedException {
		int count = 0;
		Random random = new Random();
		String[] charts = new String[]{"a", "b", "c", "d"};
		while (count < num1) {
			Thread.sleep(delay);
			String content = charts[random.nextInt(4)] + "," + random.nextInt(9) + "," + System.currentTimeMillis();
			KeyedMessage<String, String> message = new KeyedMessage<String, String>(topic, content);
			producer.send(message);
			count++;
			LOGGER.info(count + ":" + content);
		}
		producer.close();
		LOGGER.info("Produce Done");
	}

}