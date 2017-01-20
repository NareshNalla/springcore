package com.sekharit.spring;

public class SingletonTest {
	public static void main(String[] args) {
		
		System.out.println(TopRanker.getInstnace());
		System.out.println(TopRanker.getInstnace());
		System.out.println(TopRanker.getInstnace());
		System.out.println(TopRanker.getInstnace());
	}
}
