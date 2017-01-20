package com.sekharit.spring.provider;

import com.sekharit.spring.contract.Connection;

public class OracleConnectionProvider implements Connection {

	public String getConnection() {
		return "this is oracle connection";
	}

}
