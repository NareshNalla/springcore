public class ConnectionUtilizer007 {

	private static MyContainer container = new MyContainer();

	public static void main(String[] args) {
		Connection connection = (Connection) container.getBean("provider");
		String connectionString = connection.getConnection();
		System.out.println(connectionString);
	}
}
