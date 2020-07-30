package com.xyx.chaos.flink.kafka.entity;

import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import java.io.IOException;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: ClickStreamEntitySchema
 * @Package com.xyx.chaos.flink.util.entity
 * @Description:
 * @date 20/7/30 下午7:22
 */
public class ClickStreamEntitySchema implements DeserializationSchema<ClickStreamEntity> {
	@Override
	public ClickStreamEntity deserialize(byte[] message) throws IOException {
		return null;
	}

	@Override
	public boolean isEndOfStream(ClickStreamEntity nextElement) {
		return false;
	}

	@Override
	public TypeInformation<ClickStreamEntity> getProducedType() {
		return null;
	}
}