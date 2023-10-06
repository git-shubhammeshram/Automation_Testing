package Parameterization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Program_May_2_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream inputExcel = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\TestData\\SoftwereTesting.xlsx");
		Sheet readExcel = WorkbookFactory.create(inputExcel).getSheet("Sheet2");
		
		for(int row=0; row<=3; row++)
		{
			for(int col=0; col<2; col++)
			{
				String getExcelValue = readExcel.getRow(row).getCell(col).getStringCellValue();
			    System.out.print(getExcelValue + " ");
			}
			System.out.println();
		}
	}

}
