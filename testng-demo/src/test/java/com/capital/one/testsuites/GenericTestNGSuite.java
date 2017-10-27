package com.capital.one.testsuites;

import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class GenericTestNGSuite {
	
	@Test(priority=0)
	public void test2() {
		System.out.println("TEST 2 EXECUTED");
		Assert.assertTrue(false);
	}

	@Test(priority=1)
	public void test1() {
		System.out.println("TEST 1 EXECUTED");
		Assert.assertTrue(true);
	}
	
	@Test(enabled=false)
	public void test3() {
		System.out.println("TEST 3 EXECUTED");
		Assert.assertTrue(true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFORE METHOD");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTER METHOD");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BEFORE CLASSES");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AFTER CLASSES");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BEFORE TEST");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AFTER TEST");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BEFORE SUITE");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AFTER SUITE");
	}
	
	@DataProvider
	public Object[][] provideAccountDetailsExcel() throws Exception {
		Object[][] data;
		
		File file = new File("src/test/resources/mercuryData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		data = new Object[rowCount][2];
		
		for (int i = 1; i < rowCount + 1; i++) {
			Row row = sheet.getRow(i);
			data[i-1] = new Object[] 
					{row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue()};
		}
		
		System.out.println(data);
		return data;
	}
}
