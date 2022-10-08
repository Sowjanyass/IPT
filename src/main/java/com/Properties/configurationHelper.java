package com.Properties;

import java.io.IOException;

public class configurationHelper {
	
	public static configurationReader getInstance() throws IOException{
		
		configurationReader cr = new configurationReader();
		
		return cr;
		
		
	}
	

}
