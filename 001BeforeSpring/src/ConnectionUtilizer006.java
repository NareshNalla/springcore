public class ConnectionUtilizer006 {

	public static void main(String[] args) {
		Connection connection = new OracleConnectionProvider();
		String connectionString = connection.getConnection();
		System.out.println(connectionString);

	}
}
