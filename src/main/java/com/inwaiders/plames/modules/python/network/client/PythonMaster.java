package com.inwaiders.plames.modules.python.network.client;

public interface PythonMaster {

	public void onConnect();
	public void onReconnect();
	public void onDisconnect();
	
	public void onPythonBootLoaded();
	
	public void setClientAgent(PythonClientAgent agent);
	public PythonClientAgent getClientAgent();
	
	public String getName();
}
