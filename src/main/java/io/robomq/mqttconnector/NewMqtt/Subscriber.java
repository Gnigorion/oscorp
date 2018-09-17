package io.robomq.mqttconnector.NewMqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Subscriber 
{
	public static final String URL="tcp://localhost:1883";
	
public static void main(String[] args) throws MqttException {
	
	
	
	MqttClient client=new MqttClient(URL, MqttClient.generateClientId());
	
	client.setCallback(new SimpleMqttCallBack());
	client.connect();
	client.subscribe("topic");
}
}
