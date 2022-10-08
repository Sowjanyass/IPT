package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSReader {
	
	public static void main (String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sowja\\Desktop\\IPT.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(1);
		
		CellType ce = c.getCellType();
		
		if (ce.equals(CellType.STRING)) {
			
			String st = c.getStringCellValue();
			System.out.println(st);
		}
		
	}
	
	}

	



