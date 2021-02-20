package service;

import javax.xml.ws.Endpoint;

public class ServiceJaxWs {

	public static void main(String[] args) {
		String url = "http://localhost:8787/";
		Endpoint.publish(url, new BanqueService());
		System.out.println("Serice deployé sur : " + url);

	}

}
