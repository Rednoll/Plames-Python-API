package com.inwaiders.plames.modules.python.network.client;

import java.net.Socket;

public interface PythonSocketClientAgent extends PythonClientAgent {

	public void onConnect(Socket socket);
	public void onDisconnect();
	public void onReconnect(Socket socket);
	
	public Socket getSocket();
}
