package com.example.mc2.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ServerController {

	@MessageMapping("/message")
//	public void processMessage(String message) {
	public void processMessage(Message message) {
		message = MessageService.updateMessage(message);
		System.out.println(message);
	}
}
