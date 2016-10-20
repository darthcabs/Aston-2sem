package br.com.fiap.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe singleton para conexão com o banco de dados
 * @author David
 * @version 1.0
 * @since 1.0
 */
public final class ConnectionFactory {
	
	private static ConnectionFactory connection = null;

	/**
	 * Controla as instâncias da ConnectionFactory.
	 * @return ConnectionFactory
	 */
	public static ConnectionFactory controlInstance() {
		if(connection == null) {
			connection = new ConnectionFactory();
		}
		return connection;
	}
	
	/**
	 * Realiza a conexão com o banco de dados
	 * @return Connection
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception {
		String db = "oracle";
		String url = "oracle.fiap.com.br";
		String port = "1521";
		String instance = "ORCL";
		String user = "OPS$RM76539";
		String passwd = "190991";

		if (db.equals("oracle")) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}

		Connection conn = DriverManager.getConnection("jdbc:" + db + ":thin:" + "@" + url + ":" + port + ":" + instance,
				user, passwd);

		return conn;
	}
}