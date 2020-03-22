package com.inwaiders.plames.modules.python.network.packet;

import com.inwaiders.plames.modules.python.network.PythonSession;

public interface PythonPacket<S extends PythonSession> {

	public void setSession(S session);
	public S getSession();
}
