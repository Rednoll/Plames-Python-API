package com.inwaiders.plames.modules.python.network.packet;

import java.io.DataInputStream;

import com.inwaiders.plames.modules.python.network.PythonSession;
import com.inwaiders.plames.modules.python.network.client.PythonClientAgent;

public interface PythonInputPacket<S extends PythonSession> extends PythonPacket<S> {

	public void read(DataInputStream is) throws Exception;

	public void setClientAgent(PythonClientAgent agent);
	public PythonClientAgent getClientAgent();

	public void onReceived();
	
	public void dispose();
}
