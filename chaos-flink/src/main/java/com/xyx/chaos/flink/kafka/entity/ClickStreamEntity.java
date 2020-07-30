package com.xyx.chaos.flink.kafka.entity;

import java.util.Date;

/**
 * @author xuyexin
 * @version V1.0
 * @Title: ClickStreamEntity
 * @Package com.xyx.chaos.flink.util.entity
 * @Description:
 * @date 20/7/30 下午7:20
 */
public class ClickStreamEntity {
	private String name;

	private Integer duration;

	private Date time;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}