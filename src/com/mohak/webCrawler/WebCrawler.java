package com.mohak.webCrawler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WebCrawler {
	
	private Queue<String> queue;
	private List<String> discoveredWebsiteList;
	
	public WebCrawler() {
		this.queue =  new LinkedList<>();
		this.discoveredWebsiteList = new ArrayList<>();
	}

}
