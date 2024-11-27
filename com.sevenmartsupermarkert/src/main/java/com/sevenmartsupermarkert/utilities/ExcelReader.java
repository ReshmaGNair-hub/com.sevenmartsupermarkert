package com.sevenmartsupermarkert.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sevenmartsupermarkert.constants.Constants;

public class ExcelReader {

	XSSFSheet sheet;
	XSSFWorkbook workbook;

	XSSFRow row;
	XSSFCell cell;

	public void setExcelFile(String workBookName, String sheetName) {

		String path = Constants.EXCEL_FILE_PATH + workBookName + ".xlsx";
		try {

			File src = new File(path);
			FileInputStream fi = new FileInputStream(src);

			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(sheetName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCellData(int rowNo, int columnNo) {
		row = sheet.getRow(rowNo);
		cell = row.getCell(columnNo);
		switch (cell.getCellType()) {
		case STRING: {
			String data;
			data = cell.getStringCellValue();
			return data;
		}
		case NUMERIC: {
			long d = (long) cell.getNumericCellValue();
			return String.valueOf(d);
		}

		default:
			return null;

		}
	}

}
