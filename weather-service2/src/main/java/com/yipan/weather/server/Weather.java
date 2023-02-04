package com.yipan.weather.server;

/**
 * 
 * @ClassName: Weather
 * @Description: 事件主体-天气信息
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public class Weather {
	
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

	public Weather setTemperature(int temperature) {
		this.temperature = temperature;
		return this;
	}

	public int getHumidity() {
		return humidity;
	}

	public Weather setHumidity(int humidity) {
		this.humidity = humidity;
		return this;
	}

	public float getPressure() {
		return pressure;
	}

	public Weather setPressure(float pressure) {
		this.pressure = pressure;
		return this;
	}

	@Override
	public String toString() {
		return "WeatherEvent [temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + "]";
	}

}
