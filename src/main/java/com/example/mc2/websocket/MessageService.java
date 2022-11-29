package com.example.mc2.websocket;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageService {

	public static Message updateMessage(Message message) {
		message.setMc2Timestamp(new Date(System.currentTimeMillis()));
		return message;
	}
}
