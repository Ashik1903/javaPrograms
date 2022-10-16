package utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelUtils(String excelPath, String sheetName) throws IOException {
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		
	}
	
	public void getCellData(int rowNum, int cellNum) throws IOException {
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> it = sheet.iterator();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
		//String value = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(value);
	}
	
	public void getRowCount() throws IOException {	
		int rowCount = sheet.getPhysicalNumberOfRows();	
		System.out.println("Number of rows: "+rowCount);
	}
	
	public static void main(String[] args) throws IOException {
		
		String excelPath = "./data/asas.xlsx";
		String sheetName = "Sheet1";
		
		excelUtils excel = new excelUtils(excelPath, sheetName);
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
	}
}
