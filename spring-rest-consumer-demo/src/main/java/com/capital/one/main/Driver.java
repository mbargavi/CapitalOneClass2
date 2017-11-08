package com.capital.one.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capital.one.model.Artist;

public class Driver {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/spring-rest-service-demo/api/artist/all";
		Artist[] list = rt.getForObject(url, Artist[].class);
		for (Artist a : list) {
			System.out.println(a.toString());
		}
	}

}
