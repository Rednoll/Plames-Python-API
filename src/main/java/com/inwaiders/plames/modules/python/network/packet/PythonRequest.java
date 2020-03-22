package com.inwaiders.plames.modules.python.network.packet;

import com.inwaiders.plames.modules.python.network.PythonSession;

public interface PythonRequest<S extends PythonSession> extends PythonInputPacket<S>, PythonOutputPacket<S> {
	
	public void setRequestId(long requestId);
	public long getRequestId();
}
