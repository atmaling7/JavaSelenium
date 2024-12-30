package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadFromExcelDynamic {
	
	@Test
	public void excel() throws EncryptedDocumentException, IOException {
			
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Dynamic_login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				System.out.println(data);
			}
		}
	}
}
