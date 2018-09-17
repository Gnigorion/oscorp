package io.robomq.mqttMain;

import org.eclipse.paho.client.mqttv3.MqttException;

import io.robomq.mqttconnector.NewMqtt.Pub2;
import io.robomq.mqttconnector.NewMqtt.Publisher;
import io.robomq.mqttconnector.NewMqtt.Subscriber;

public class MqttApp
{
	public static void main(String[] args) throws MqttException {
		
		Publisher.main(args);
		
		/*Pub2.main(args);*/
		Subscriber.main(args);
	}
}
