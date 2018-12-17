package com.boot.netty.heartbeat;

import java.util.TimerTask;

import com.boot.netty.util.GlobalUserUtil;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;



public class SocketHeartBeatTask extends TimerTask{
	
	
    @Override	
    public void run(){
    	
    		String msg = "server heartbeat bibibi ......";
	        for (Channel channel : GlobalUserUtil.channels) {
	        	channel.writeAndFlush(new TextWebSocketFrame(msg));
	        	
	        }
			
    }
}