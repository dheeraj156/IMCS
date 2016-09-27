package trng.imcs.soap.app;

import javax.xml.ws.Endpoint;

import trng.imcs.soap.MobileServiceImpl;

public class MobileServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9034/MobileService", new MobileServiceImpl());
	}

}
