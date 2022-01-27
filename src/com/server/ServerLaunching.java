package com.server;

import javax.xml.ws.Endpoint;

import com.service.BanqueService;

public class ServerLaunching {

	public static void main(String[] args) {
		String url = "http://localhost:8585/";
		Endpoint.publish(url,new BanqueService());
		System.out.println(url);
	}

}
