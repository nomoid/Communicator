package com.github.assisstion.Communicator.relay;

import java.util.Set;

public interface LSocketListenerHandler<T extends ASocketHandler>{
	Set<LSocketListener<T>> getListenerSet();
	void addListener(LSocketListener<T> listener);
	void addListeners(Set<LSocketListener<T>> listeners);
	void removeListener(LSocketListener<T> listener);
	void removeListeners(Set<LSocketListener<T>> listeners);
}