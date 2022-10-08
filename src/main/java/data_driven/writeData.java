package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeData {
	static String value;
	
public static String particularData(String Sheet, int row, int cell, String value) throws IOException {
		
		File f = new File("C:\\Users\\sowja\\Desktop\\IPT.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet(Sheet).createRow(row).createCell(cell).setCellValue(value);
		
		
		
		
		
		
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		return value;
		
		

}



} 
