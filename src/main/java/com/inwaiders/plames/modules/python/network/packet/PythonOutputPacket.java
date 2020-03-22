package com.inwaiders.plames.modules.python.network.packet;

import java.io.DataOutputStream;
import java.io.IOException;

import com.inwaiders.plames.modules.python.network.PythonSession;
import com.inwaiders.plames.modules.python.network.client.PythonClientAgent;

public interface PythonOutputPacket<S extends PythonSession> extends PythonPacket<S> {
	
	public void write(DataOutputStream os) throws IOException;

	public void setClientAgent(PythonClientAgent agent);
	public PythonClientAgent getClientAgent();
	
	public void dispose();
}
