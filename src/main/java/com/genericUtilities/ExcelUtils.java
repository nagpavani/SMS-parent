package com.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
/**
 * This method is used to read data from excel file
 * @param sheetName
 * @param rowNo
 * @param cellNo
 * @return
 * @throws Exception
 * @throws IOException
 */
 public String readDataFromExcel(String sheetName,int rowNo,int cellNo) throws Exception, IOException {
	  FileInputStream fi= new FileInputStream(IpathConstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(fi);
	Sheet sh= wb.getSheet(sheetName);
	       String value=sh.getRow(rowNo).getCell(cellNo).getStringCellValue();
	       return value;
 
}
 /**
  * This method is to get last row number  of excel sheet
  * @param sheetName
  * @return
  * @throws Exception
  * @throws IOException
  */
 public int getLastRowNo(String sheetName) throws Exception, IOException {
	  FileInputStream fi= new FileInputStream(IpathConstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(fi);
	Sheet sh= wb.getSheet(sheetName);
	int rowCount =sh.getLastRowNum();
	       
	       return rowCount;
	       
 }
 /**
  * This method is for storing multiple values in excel sheet 
  * @param sheetName
  * @param cell
  * @return
  * @throws Exception
  * @throws IOException
  */
 public HashMap<String,String> hashMapData(String sheetName,int cell) throws Exception, IOException {
	  FileInputStream fi= new FileInputStream(IpathConstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(fi);
	Sheet sh= wb.getSheet(sheetName);
	int lastRow  =sh.getLastRowNum();
	
	HashMap<String,String> map = new HashMap<String,String>();
	 
	for(int i=0; i<=lastRow; i++) {
		
		String key =sh.getRow(i).getCell(cell).getStringCellValue();
		String value =sh.getRow(i).getCell(cell+1).toString();
		map.put(key, value);
		
		}
	       
	       return map;
	       }
 /**
  * This method is to write data into excel sheet
  * @param sheetName
  * @param row
  * @param cell
  * @param data
  * @throws Exception
  * @throws IOException
  */
 public void writeDataIntoExcel(String sheetName,int row,int cell,String data) throws Exception, IOException {
	  FileInputStream fi= new FileInputStream(IpathConstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(fi);
	Sheet sh= wb.getSheet(sheetName);
	       sh.createRow(row).createCell(cell).setCellValue(data);
	       FileOutputStream fout = new FileOutputStream(IpathConstants.Excelpath);
	       wb.write(fout);
	       wb.close();
	       }
 /**
  * This method is getting data from excel by using @Dataprovider  
  * @param sheetName
  * @return
  * @throws Exception
  */
 public Object[][] readMultipleSetOfData(String sheetName) throws Exception{
	 FileInputStream fi= new FileInputStream(IpathConstants.Excelpath);
	 Workbook wb = WorkbookFactory.create(fi);
	Sheet sh= wb.getSheet(sheetName);
	int lastrow =sh.getLastRowNum()+1;
	int lastcell =sh.getRow(0).getLastCellNum();
	
	Object[][] obj = new Object[lastrow][lastcell];
	
	for (int i=0;i< lastrow;i++) {
		for(int j=0;j<lastcell;j++) {
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj;
	 
 }
}
