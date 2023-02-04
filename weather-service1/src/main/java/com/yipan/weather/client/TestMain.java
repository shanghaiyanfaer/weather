package com.yipan.weather.client;

import java.util.Timer;
import java.util.TimerTask;

import com.yipan.weather.server.Event;
import com.yipan.weather.server.WeatherEvent;

/**
 * 
 * @ClassName: TestMain
 * @Description: 测试类
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public class TestMain {
	
	public static void main(String[] args) throws Exception {
		WeatherEvent weatherEvent = new WeatherEvent()
		.setTemperature(30).setHumidity(20).setPressure(20.5f);
		new WeatherListener(weatherEvent);
		
		weatherEvent.register(		new Listener() {
			
			@Override
			public void change(Event event) {
				System.out.println("通用Listener感知到天气有变化"+event);
			}
		});

        // 定义一个任务       
        TimerTask timerTask = new TimerTask() {            
        @Override            
            public void run() {                
        	weatherEvent.publish();
            }       
         };        
        // 计时器       
        Timer timer = new Timer();       
        // 开始执行任务 (延迟1000毫秒执行，每一分钟执行一次)        
        timer.schedule(timerTask, 1000, 60 * 1000);  
	}

}
