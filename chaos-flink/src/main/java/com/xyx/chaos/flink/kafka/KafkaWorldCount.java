package com.xyx.chaos.flink.kafka;

import com.xyx.chaos.flink.kafka.entity.ClickStreamEntity;
import com.xyx.chaos.flink.kafka.entity.ClickStreamEntitySchema;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: KafkaWorldCount
 * @Package com.xyx.chaos.flink.kafka
 * @Description:
 * @date 20/7/30 下午5:26
 */
public class KafkaWorldCount {

	public static void main(String[] args) throws Exception {
		//Kafka配置初始化
		Map<String, String> kafkaProps = new HashMap<>();
		kafkaProps.put("bootstap.servers", "127.0.0.2:9092");
		kafkaProps.put("topic", "test");
		kafkaProps.put("group.id", "test_group");
		kafkaProps.put("auto.offset.reset", "earliest");
		kafkaProps.put("serializer.class", "kafka.serializer.StringEncoder");
		kafkaProps.put("max.poll.records", "10");
		final ParameterTool parameter = ParameterTool.fromMap(kafkaProps);

		//初始化流组建
		StreamExecutionEnvironment environment = StreamExecutionEnvironment.getExecutionEnvironment();

		//建立Consumer
		FlinkKafkaConsumer09 kafkaConsumer09 = new FlinkKafkaConsumer09(parameter.get("topic")
			, new ClickStreamEntitySchema()
			, parameter.getProperties());

		//建立Kafka连接
		DataStream<ClickStreamEntity> input = environment.addSource(kafkaConsumer09).setParallelism(1);

	}


}