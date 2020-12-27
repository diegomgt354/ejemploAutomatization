package com.diego.frescoplay.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	XSSFWorkbook libroExcel;
	XSSFSheet numeroPagina;
	
	public ReadExcelFile(String ubication) throws IOException {
		super();
		File src = new File(ubication);
		FileInputStream fis = new FileInputStream(src);
		libroExcel = new XSSFWorkbook(fis);
	}

	public int getRowsCount(int i) {
		int row = libroExcel.getSheetAt(i).getLastRowNum();
		row++;
		return row;
	}

	public String getData(int pagina, int row, int column) {
		numeroPagina = libroExcel.getSheetAt(pagina);
		String data = numeroPagina.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
}
