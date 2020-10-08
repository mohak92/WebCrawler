package com.mohak.webCrawler;

public class App {

	public static void main(String[] args) {
		
		WebCrawler webCrawler = new WebCrawler();
		
		String rootUrl = "";
		
		webCrawler.discoverWeb(rootUrl);

	}

}
