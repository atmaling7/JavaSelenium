package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadFromExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\dws_login.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet2");

		String url = sheet.getRow(0).getCell(0).toString();
		System.out.println(url);
		String un = sheet.getRow(0).getCell(1).toString();
		System.out.println(un);
		String pass = sheet.getRow(0).getCell(2).toString();
		System.out.println(pass);
	}
}