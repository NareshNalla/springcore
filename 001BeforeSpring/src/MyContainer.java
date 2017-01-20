import java.io.IOException;
import java.util.Properties;

public class MyContainer {
	private static Properties properties;
	static {

		try {
			properties = new Properties();
			properties.load(MyContainer.class.getClassLoader()
					.getResourceAsStream("myproperties.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object getBean(String providerKey) {
		Object object = null;
		String providerClassName = properties.getProperty(providerKey);
		try {
			Class c = Class.forName(providerClassName);
			object = c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return object;
	}

}
