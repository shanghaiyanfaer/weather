package com.yipan.weather.server;

import java.util.ArrayList;
import java.util.List;
import com.yipan.weather.client.Listener;

/**
 * 
 * @ClassName: Event
 * @Description: 事件
 * @author Administrator
 * @date 2023年2月3日
 *
 */
public interface Event {
	final static List<Listener> listeners = new ArrayList<>();
	
	public default void register(Listener listener) throws Exception {
		if (listener == null) {
			throw new Exception("listener cannot be null ");
		}
		listeners.add(listener);
	};

	public default boolean unregister(Listener listener) throws Exception {
		return listeners.remove(listener);
	}
	
	public default void publish() {
		for (Listener listener : listeners) {
			listener.change(this);
		}
	}

}
