package com.inwaiders.plames.modules.python.network.client;

import com.inwaiders.plames.modules.python.network.PythonEnvironment;
import com.inwaiders.plames.modules.python.network.packet.PythonOutputPacket;
import com.inwaiders.plames.modules.python.network.packet.PythonRequest;

public interface PythonClientAgent {
	
	public <T extends PythonRequest> T requestFromPython(T packet);
	public void toPython(PythonOutputPacket packet);

	public void onPythonBootLoaded();
	
	public void setEnvironment(PythonEnvironment env);
	public PythonEnvironment getEnvironment();
	
	public PythonEnvironment initEnvironment();
	public void terminateEnvironment();
	
	public long getId();
}
