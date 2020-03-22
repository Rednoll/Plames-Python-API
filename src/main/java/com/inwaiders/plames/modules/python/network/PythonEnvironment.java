package com.inwaiders.plames.modules.python.network;

public interface PythonEnvironment {
	
	public PythonSession getSession();

	public void terminate();
	
	public long getId();
}
