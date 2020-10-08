# Web Crawler - core of search engines
Web crawler – sometimes called a spider – is an Internet bot that systematically browses the World Wide Web, typically for the purpose of web indexing.

Search engines use web crawling to update their web content or indices of other sites’ web content. Web crawlers copy pages for processing by a search engine which indexes the downloaded pages so users can search more efficiently.
## Overview
The world wide web can be represented as a directed graph
* Vertices are the domains/URLs/websites.
* Edges are connections between websites via links.
* We parse a given website's HTML code and look for URLs

With BFS we can traverse the web this is called a web crawler like Google Spider.

## Screenshot

## Algorithm
* To traverse the www we will be using BFS algorithm.
* And an underlying queue abstract data type to achieve it.

## Local Setup
* Git clone / download project.
* Import project in eclipse.
* Open App.java navigate to line no. 9 and add a URL starting with "https://www.anywebsite.com" and save.
* Run App.java.

## Built with
* Java 8