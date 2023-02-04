package com.yipan.weather.server;

import java.util.ArrayList;
import java.util.List;
import com.yipan.weather.client.Listener;

/**
 * 
 * @ClassName: DefaultEventSource
 * @Description: 事件管理器默认实现
 * @author Administrator
 * @date 2023年2月3日
 *
 * @param <T>
 */
public class DefaultEventSource<T> implements EventSource<T>{
	
    private List<Listener> listeners = new ArrayList<>();
		
	public void register(Listener<T> listener) throws Exception {
		if (listener == null) {
			throw new Exception("listener cannot be null ");
		}
		listeners.add(listener);
	};

	public boolean unregister(Listener<T> listener) {
		return listeners.remove(listener);
	}
		

	@Override
	public void publish(Event<T> event) {
		//可以扩展实现为只推送给订阅方感兴趣的事件，不用全局推送
		for (Listener listener : listeners) {
			listener.change(event);
		}
	}

}
