package com.yipan.weather.client;

import java.util.Timer;
import java.util.TimerTask;
import com.yipan.weather.server.DefaultEventSource;
import com.yipan.weather.server.Event;
import com.yipan.weather.server.EventSource;
import com.yipan.weather.server.Test;
import com.yipan.weather.server.Weather;

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
		
		EventSource<Weather> eventSource = new DefaultEventSource<>();
		eventSource.register(new WeatherListener());
		Weather weather = new Weather()
				.setTemperature(30).setHumidity(20).setPressure(20.5f);
		
		EventSource<Test> testEventSource = new DefaultEventSource<>();
		testEventSource.register(new TestListener());
		Test test = new Test();
		test.setFlag("111");
        // 定义一个任务       
        TimerTask timerTask = new TimerTask() {            
        @Override            
            public void run() {
        	eventSource.publish(new Event<Weather>(weather));
        	testEventSource.publish(new Event<Test>(test));
            }       
         };        
        // 计时器       
        Timer timer = new Timer();       
        // 开始执行任务 (延迟1000毫秒执行，每一分钟执行一次)        
        timer.schedule(timerTask, 1000, 60 * 1000);  
	}

}
