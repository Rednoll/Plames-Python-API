package com.inwaiders.plames.modules.python.network;

import com.inwaiders.plames.modules.python.network.client.PythonClientAgent;
import com.inwaiders.plames.modules.python.network.packet.PythonOutputPacket;
import com.inwaiders.plames.modules.python.network.packet.PythonRequest;

public interface PythonServer<ClientType extends PythonClientAgent> {

	public void launch();
	
	public <T extends PythonRequest> T request(ClientType agent, T reqeust);
	public void sendPacket(ClientType agent, PythonOutputPacket packet);
}
