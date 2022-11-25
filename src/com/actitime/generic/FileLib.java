package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this is generic class for data driven testing
 * @author jyothi
 *
 */
public class FileLib {
/**
 * this is generic for reading the data from property file
 * @param key
 * @return String
 * @throws IOException
 */
	public String getPropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
    Properties p=new Properties();
    p.load(fis);
    String data=p.getProperty(key);
    return data;
	}
/**
 * 
 * @param SheetName
 * @param rownum
 * @param cellnum
 * @return String
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String getExceldata(String SheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
	/**
	 * 
	 * @param SheetName
	 * @param rownum
	 * @param cellnum
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExceldata(String SheetName,int rownum,int cellnum,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/createcustomer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/createcustomer.xlsx");
		wb.write(fos);
		wb.close();
	}


}
