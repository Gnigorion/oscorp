package io.robomq.mqttconnector.NewMqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;


public class Publisher 
{
	public static void main(String[] args) throws MqttException 
	{
		String messageString = "Hello World from Java!";
	
		MqttClient client=new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
		client.connect();
		MqttMessage message=new MqttMessage();
		
		message.setPayload(messageString.getBytes());
		
		client.publish("topic", message);
		
		client.disconnect();
	}
}
