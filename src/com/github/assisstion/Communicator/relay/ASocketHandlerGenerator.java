package com.github.assisstion.Communicator.relay;

import java.net.Socket;

public interface ASocketHandlerGenerator<T extends ASocketHandler>{
	T generate(Socket socket);
}
