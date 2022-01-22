package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties configProperies;

	public void loadFile() throws IOException {
		configProperies = new Properties();
		FileInputStream configfile = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
		configProperies.load(configfile);
	}

	public String getBaseUri() throws IOException {
		String baseuri = configProperies.getProperty("baseuri");
		return baseuri;
	}

	public String getGetEndPoint() throws IOException {
		String getEndPoint = configProperies.getProperty("getendpoint");
		return getEndPoint;
	}

	public String getPostEndPoint() throws IOException {
		String postEndPoint = configProperies.getProperty("postendpoint");
		return postEndPoint;
	}

	public String getPutEndPoint() throws IOException {
		String putEndPoint = configProperies.getProperty("putendpoint");
		return putEndPoint;
	}

	public String getDeleteEndPoint() throws IOException {
		String deleteEndPoint = configProperies.getProperty("deleteendpoint");
		return deleteEndPoint;
	}

	public int getGetId() {
		String getId = configProperies.getProperty("getId");
		int id = Integer.parseInt(getId);
		return id;
	}

	public int getPutId() {
		String putId = configProperies.getProperty("putId");
		int id = Integer.parseInt(putId);
		return id;
	}

	public int getDeleteId() {
		String deleteId = configProperies.getProperty("deleteId");
		int id = Integer.parseInt(deleteId);
		return id;
	}

}
