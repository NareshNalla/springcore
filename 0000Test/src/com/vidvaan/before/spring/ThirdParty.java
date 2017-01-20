package com.vidvaan.before.spring;

import java.io.IOException;
import java.util.Properties;

public class ThirdParty {

	private static Properties properties = new Properties();
	static {
		try {
			properties.load(ThirdParty.class.getClassLoader()
					.getResourceAsStream(
							"com/vidvaan/before/spring/need.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static Object getBean(String name){
		String calssName = properties.getProperty(name);
		try {
			Class c = Class.forName(calssName);
			return c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
