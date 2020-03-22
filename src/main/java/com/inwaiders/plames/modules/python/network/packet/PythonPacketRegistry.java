package com.inwaiders.plames.modules.python.network.packet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PythonPacketRegistry {

	private static Map<Short, Class<? extends PythonPacket>> packets = new HashMap<>();

	public static void register(int id, Class<? extends PythonPacket> clazz) {
		
		packets.put((short) id, clazz);
	}
	
	public static short getId(PythonPacket packet) {
		
		return getId(packet.getClass());
	}
	
	public static short getId(Class<? extends PythonPacket> clazz) {
		
		for(Entry<Short, Class<? extends PythonPacket>> entry : packets.entrySet()) {
			
			if(entry.getValue() == clazz) {
				
				return entry.getKey(); 
			}
		}
		
		return -1;
	}
	
	public static Class<? extends PythonPacket> get(int id) {
	
		return packets.get((short) id);
	}
}
