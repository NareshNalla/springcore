package com.sekharit.spring.bean;

public class WaterBean {
	private FishBean fishBean;

	public void setFishBean(FishBean fishBean) {
		this.fishBean = fishBean;
	}

	public void flow() {
		System.out.println("~~~~~~~~~Water is flowing ~~~~~~~~~");
		fishBean.swim();
		System.out.println("~~~~~~~~~Water is flowing ~~~~~~~~~");
	}
}
