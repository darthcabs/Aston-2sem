package br.com.fiap.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() throws Exception {
		String db = "oracle";
		String url = "localhost:1521";
		String instance = "XE";
		String user = "david";
		String passwd = "davifjc";
		
		if (db.equals("oracle")) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		
		Connection conn = DriverManager.getConnection("jdbc:" + db + ":thin:" + user + "/" + passwd  + "@" + url + "/" + instance);

		return conn;
	}
}
