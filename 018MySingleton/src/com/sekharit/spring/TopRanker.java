package com.sekharit.spring;

public class TopRanker {
	private static TopRanker topRanker = new TopRanker();

	private TopRanker() {
		System.out.println("TopRanker instance is created");
	}

	public static TopRanker getInstnace() {
		return topRanker;
	}

}
