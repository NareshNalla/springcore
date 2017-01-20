public class ConnectionUtilizer005 {
	public static void main(String[] args) {
		Connection connection = new MysqlConnectionProvider();
		String connectionString = connection.getConnection();
		System.out.println(connectionString);

	}
}
