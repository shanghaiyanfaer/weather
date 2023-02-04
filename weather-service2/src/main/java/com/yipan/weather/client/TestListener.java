package com.yipan.weather.client;

import com.yipan.weather.server.Event;
import com.yipan.weather.server.Test;

/**
 * 
 * @ClassName: TestListener
 * @Description: 测试事件监听实现
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public class TestListener implements Listener<Test>{
	
	@Override
	public void change(Event<Test> event) {
		System.out.println("Test感知事件有变化"+event.getSource());
	}

}