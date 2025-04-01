package genricUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	
	/**
	 * This is generic method to fetch the value from propertiesFiles using its corresponding key
	 * @param Key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties(String Key) throws Exception
	{
		FileInputStream fis=new FileInputStream(IPathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
		
		
	}
	}

