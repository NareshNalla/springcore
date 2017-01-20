package com.sekharit.spring.provider;

import com.sekharit.spring.contract.Connection;

public class MysqlConnectionProvider implements Connection {

	public String getConnection() {
		return "this is mysql connection";
	}

	

}
