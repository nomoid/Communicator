package com.github.assisstion.Communicator.relay;

import java.net.Socket;

/**
 * A Socket wrapped in a MachineSocket. Use get() to retrieve the Socket.
 *
 * @author Markus Feng
 */
public interface ClientMachineSocket extends MachineSocket{
	@Override
	Socket get();
}
