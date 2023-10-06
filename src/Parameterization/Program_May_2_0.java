package Parameterization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program_May_2_0{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream inputExcel = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\TestData\\SoftwereTesting.xlsx");
		
		Sheet readExcel = WorkbookFactory.create(inputExcel).getSheet("Sheet1");
		
		String valueExcelSheet1 = readExcel.getRow(0).getCell(0).getStringCellValue();
		
		
		readExcel.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(valueExcelSheet1);
	}

}
