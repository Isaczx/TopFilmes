package com.br.TopFilmes;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Ranking {
	public static void main(String[] args) {
		
	String apiKey = "k_5ao0c510";
	URI Uri =URI.create("https://imdb-api.com/" + apiKey);
	
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = HttpRequest.newBuilder().uri((Uri)).build();
	
	client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body)
	.thenAccept(System.out::println).join(); 
	
	
	
	
	
	
	
}
}