package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSWriter {
	
public static void main (String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sowja\\Desktop\\IPT.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	wb.createSheet("IPT").createRow(0).createCell(0).setCellValue("Username");
	wb.getSheet("IPT").createRow(1).createCell(0).setCellValue("Sowjanya");
	
	wb.getSheet("IPT").getRow(0).createCell(1).setCellValue("Password");
	wb.getSheet("IPT").getRow(1).createCell(1).setCellValue("sowj");
	
	
	
	
	FileOutputStream fos = new FileOutputStream(f);
	
	wb.write(fos);
	
	wb.close();
	
	System.out.println("Data Written Successfully");
	
	
}

}
