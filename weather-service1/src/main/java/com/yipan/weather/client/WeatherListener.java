package com.yipan.weather.client;

import com.yipan.weather.server.Event;
import com.yipan.weather.server.WeatherEvent;

/**
 * 
 * @ClassName: WeatherListener
 * @Description: 天气变化监听器
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public class WeatherListener implements Listener{
	
	public WeatherListener(WeatherEvent weatherEvent) throws Exception {
		weatherEvent.register(this);
	}

	@Override
	public void change(Event event) {
		System.out.println("WeatherListener感知到天气有变化"+event);
	}

}
