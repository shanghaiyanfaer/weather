package com.yipan.weather.server;

import com.yipan.weather.client.Listener;

/**
 * 
 * @ClassName: EventSource
 * @Description: 事件管理器
 * @author Administrator
 * @date 2023年2月3日
 *
 * @param <T>
 */
public interface EventSource<T> {
	
	public void register(Listener<T> listener) throws Exception;
	
	public boolean unregister(Listener<T> listener);
	
	public void publish(Event<T> event);


}
