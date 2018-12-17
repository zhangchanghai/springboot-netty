package com.boot.netty.heartbeat;

import java.util.Timer;

import org.springframework.stereotype.Component;

@Component
public class SocketHeartBeat {
	
	private static final Timer timer = new Timer();
	
	public void createHeartBeat(){
		
		SocketHeartBeatTask task = new SocketHeartBeatTask();
		
		//timer.schedule(task, 0, 5*60*1000);
	}
	
	
}