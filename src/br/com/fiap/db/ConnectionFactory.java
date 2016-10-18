package br.com.fiap.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	/*
	jdbc:oracle:thin:@192.168.60.15:1521:ORCL
	jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
	OPS$RM76207
	040696
	*/		
	
	
	public Connection getConnection() throws Exception {
		String db = "oracle";
		String url = "@192.168.60.15";
		String instance = "ORCL";
		String user = "OPS$RM76860";
		String passwd = "";
		
		if (db.equals("oracle")) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		
		Connection conn = DriverManager.getConnection("jdbc:" + db + ":thin:" + user + "/" + passwd  + "@" + url + "/" + instance);

		return conn;
	}
}
