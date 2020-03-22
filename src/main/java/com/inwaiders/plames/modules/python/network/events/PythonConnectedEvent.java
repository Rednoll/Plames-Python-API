package com.inwaiders.plames.modules.python.network.events;

import com.inwaiders.plames.api.event.PlamesEvent;
import com.inwaiders.plames.modules.python.network.client.PythonClientAgent;

public class PythonConnectedEvent implements PlamesEvent {

	private PythonClientAgent agent = null;
	
	public PythonConnectedEvent(PythonClientAgent agent) {
		
		this.agent = agent;
	}
	
	@Override
	public void dispose() {
		
		this.agent = null;
	}

	@Override
	public boolean getAutoDispose() {
	
		return true;
	}
	
	public PythonClientAgent getAgent() {
		
		return this.agent;
	}
}
