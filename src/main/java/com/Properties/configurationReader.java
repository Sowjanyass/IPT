package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {
	
	
	
	private Properties p;
	
	public configurationReader() throws IOException {
		
		
		File f = new File ("C:\\Users\\sowja\\eclipse-workspace\\IPT_Projects\\src\\main\\java\\com\\Properties\\Amazon.properties");
		
		FileInputStream fi = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fi);
	
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		return browser;
	}
		
		public String getUrl() {
			
			String url = p.getProperty("url");
			return getUrl();
		
		
		
		
	}
	
	

}
