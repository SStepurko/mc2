package com.example.mc2.websocket;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageService {

	/**
	 * @param message the message to update mc2 time
	 * @return the message with updated mc2 time
	 */
	public static Message updateMessage(Message message) {
		message.setMc2Timestamp(new Date(System.currentTimeMillis()));
		return message;
	}
}
