package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {

	// Inject primitive types
	@Value("sekhar")
	private String name;

	@Value("25")
	private int age;

	// Inject object types
	@Value("#{addressBean}")
	private Address address;

	// Inject object properties
	@Value("#{addressBean.country}")
	private String country;

	// calling methods in EL
	@Value("#{addressBean.getFullAddress('sekharAddress')}")
	private String fullAddress;

	@Value("#{'spring'.toUpperCase()}")
	private String course;

	// Relational operators

	@Value("#{1 == 1}")
	// true
	private boolean testEqual;

	@Value("#{1 != 1}")
	// false
	private boolean testNotEqual;

	@Value("#{1 < 1}")
	// false
	private boolean testLessThan;

	@Value("#{1 <= 1}")
	// true
	private boolean testLessThanOrEqual;

	@Value("#{1 > 1}")
	// false
	private boolean testGreaterThan;

	@Value("#{1 >= 1}")
	// true
	private boolean testGreaterThanOrEqual;

	// Logical operators , numberBean.no == 999

	@Value("#{numberBean.no == 999 and numberBean.no < 900}")
	// false
	private boolean testAnd;

	@Value("#{numberBean.no == 999 or numberBean.no < 900}")
	// true
	private boolean testOr;

	@Value("#{!(numberBean.no == 999)}")
	// false
	private boolean testNot;

	// Mathematical operators

	@Value("#{1 + 1}")
	// 2.0
	private double testAdd;

	@Value("#{'1' + '@' + '1'}")
	// 1@1
	private String testAddString;

	@Value("#{1 - 1}")
	// 0.0
	private double testSubtraction;

	@Value("#{1 * 1}")
	// 1.0
	private double testMultiplication;

	@Value("#{10 / 2}")
	// 5.0
	private double testDivision;

	@Value("#{10 % 10}")
	// 0.0
	private double testModulus;

	@Value("#{2 ^ 2}")
	// 4.0
	private double testExponentialPower;

	// Ternary Operator (If-Then-Else)
	@Value("#{numberBean.no < 100 ? true : false}")
	private boolean ternary;

	// EL Lists, Maps
	@Value("#{testBean.map['MapA']}")
	private String mapA;

	@Value("#{testBean.list[0]}")
	private String list;

	// Regular expressions

	// if this is a digit?
	@Value("#{'100' matches '\\d+' }")
	private boolean validDigit;

	// if this is a digit + ternary operator
	@Value("#{ ('100' matches '\\d+') == true ? "
			+ "'yes this is digit' : 'No this is not a digit'  }")
	private String msg;

	public void displayInjectedValues() {
		sop("name : " + name);
		sop("age : " + age);
		sop("address.street : " + address.getStreet());
		sop("address.postcode : " + address.getPostcode());
		sop("address.country : " + address.getCountry());
		sop("country : " + country);
		sop("fullAddress : " + fullAddress);
		sop("course : " + course);
		sop("testEqual : " + testEqual);
		sop("testNotEqual : " + testNotEqual);
		sop("testLessThan=" + testLessThan);
		sop("testLessThanOrEqual : " + testLessThanOrEqual);
		sop("testGreaterThan : " + testGreaterThan);
		sop("testGreaterThanOrEqual : " + testGreaterThanOrEqual);
		sop("testAnd : " + testAnd);
		sop("testOr=" + testOr);
		sop("testNot :  " + testNot);
		sop("testAdd=" + testAdd);
		sop("testAddString :  " + testAddString);
		sop("testSubtraction=" + testSubtraction);
		sop("testMultiplication : " + testMultiplication);
		sop("testDivision : " + testDivision);
		sop("testModulus :  " + testModulus);
		sop("testExponentialPower :  " + testExponentialPower);
		sop("ternary : " + ternary);
		sop("mapA : " + mapA);
		sop("list : " + list);
		sop("validDigit : " + validDigit);
		sop("msg : " + msg);
	}

	public void sop(Object object) {
		System.out.println(object);
	}
}
