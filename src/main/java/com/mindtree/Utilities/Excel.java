package com.mindtree.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Excel(String path) {
		
		try {
			File src = new File(path);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e);
		} 
		
	}
	public String getData(int sheetnum, int row , int col) {
		
		sheet1 = wb.getSheetAt(0);
		
		return sheet1.getRow(row).getCell(col).getStringCellValue();
		
	}

}
