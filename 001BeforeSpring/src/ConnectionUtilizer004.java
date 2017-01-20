public class ConnectionUtilizer004 {
	public static void main(String[] args) {
		MysqlConnectionProvider connection = new MysqlConnectionProvider();
		String connectionString = connection.getConnection();
		System.out.println(connectionString);

	}
}
