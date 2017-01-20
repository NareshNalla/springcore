public class ConnectionUtilizer003 {
	public static void main(String[] args) {
		OracleConnectionProvider connection = new OracleConnectionProvider();
		String connectionString = connection.getConnection();
		System.out.println(connectionString);
		
	}
}
