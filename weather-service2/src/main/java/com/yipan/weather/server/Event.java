package com.yipan.weather.server;

/**
 * 
 * @ClassName: Event
 * @Description: 事件
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public class Event<T> {

	public T source;
	
	public Event() {
		this(null);
	}

	public Event(T source) {
		this.source = source;
	}
	
	public T getSource() {
		return source;
	}

}
