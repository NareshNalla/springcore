package com.sekharit.spring.bean;

import java.beans.PropertyEditorSupport;

public class ContactNumberEditor extends PropertyEditorSupport {
	private String seperator;

	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (seperator == null) {
			seperator = "-";
		}
		String[] values = text.split(seperator);
		ContactNumber contactNumber = new ContactNumber();
		contactNumber.setCountryCode(values[0]);
		contactNumber.setStateCode(values[1]);
		contactNumber.setNumber(values[2]);

		setValue(contactNumber);
	}
}
