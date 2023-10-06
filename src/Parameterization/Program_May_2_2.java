package Parameterization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program_May_2_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		FileInputStream inputExcel = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\TestData\\SoftwereTesting.xlsx");
	    
		Sheet readExcel = WorkbookFactory.create(inputExcel).getSheet("Sheet2");
		System.out.println("Excel Sheet Value Are -");
		
		for(int row=0; row<=readExcel.getLastRowNum(); row++)
		{
			for(int col=0; col<readExcel.getRow(row).getLastCellNum();col++)
			{
				String getExcelValue = readExcel.getRow(row).getCell(col).getStringCellValue();
				System.out.print(getExcelValue + " ");
			}
			System.out.println();
		}
	
	
	
	
	
	}

}
