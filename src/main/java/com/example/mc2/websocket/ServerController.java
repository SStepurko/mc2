package com.example.mc2.websocket;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ServerController {

	private static final String TOPIC = "MyTopic";
	final
	KafkaTemplate<String, Message> kafkaTemplate;

	public ServerController(KafkaTemplate<String, Message> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	/**
	 * Gets the message from websocket and sends it to kafka
	 * @param message1 the message from websocket
	 */
	@MessageMapping("/message")
	public void processMessage(Message message1) {
		Message mc2Message2 = MessageService.updateMessage(message1);
		kafkaTemplate.send(TOPIC, mc2Message2);
	}
}
