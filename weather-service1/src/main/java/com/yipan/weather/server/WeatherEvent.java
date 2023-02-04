package com.yipan.weather.server;

/**
 * 
 * @ClassName: WeatherEvent
 * @Description: 天气事件
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public class WeatherEvent implements Event{
	
	/**
	 * 温度
	 */
	public int temperature;
	
	/**
	 * 湿度
	 */
	public int humidity;
	
	/**
	 * 压强
	 */
	public float pressure;

	
	public int getTemperature() {
		return temperature;
	}

	public WeatherEvent setTemperature(int temperature) {
		this.temperature = temperature;
		return this;
	}

	public int getHumidity() {
		return humidity;
	}

	public WeatherEvent setHumidity(int humidity) {
		this.humidity = humidity;
		return this;
	}

	public float getPressure() {
		return pressure;
	}

	public WeatherEvent setPressure(float pressure) {
		this.pressure = pressure;
		return this;
	}

	@Override
	public String toString() {
		return "WeatherEvent [temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + "]";
	}

}
