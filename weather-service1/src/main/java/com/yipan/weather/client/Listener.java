package com.yipan.weather.client;

import com.yipan.weather.server.Event;

/**
 * 
 * @ClassName: Listener
 * @Description: 事件监听器
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public interface Listener {
	
	public void change(Event event);

}
