# mc2
МС2 принимает сообщение от МС1,  
записывает в поле сообщения “МС2_timestamp” текущее время  
и отправляет сообщение в МС3 через топик брокера Kafka;

# project

packages
- kafka
  - KafkaConfig configuration class; allow to connect and send messages to kafka
- websocket
  - Message the object being sent
  - MessageService update timestamps for the message
  - ServiceController gets messages from websocket and sends it to kafka
  - WebSocketServerConfiguration configuration class; allow to receive messages thru websocket