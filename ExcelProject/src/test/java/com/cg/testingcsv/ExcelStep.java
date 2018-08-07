package com.cg.testingcsv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;

public class ExcelStep {

	WebDriver driver;
	

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\Selenium\\chromedriver.exe");

	}

	@Test
	public void csvDataRead() throws IOException {

		File src = new File("D:\\excel1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sh1 = workbook.getSheetAt(0);
		DataFormatter data=new DataFormatter();
		for(Row row:sh1)
		{
			String id=data.formatCellValue(row.getCell(0));
			String name=data.formatCellValue(row.getCell(1));
			
			String salary=data.formatCellValue(row.getCell(2));
			String designation=data.formatCellValue(row.getCell(3));
			String email=data.formatCellValue(row.getCell(4));
			System.out.println(id + name + designation + salary + email);

			driver = new ChromeDriver();
			driver.get("D:\\IMPORTANT\\PROJECT_FILES\\SpringExam2\\ExcelProject\\src\\main\\webapp\\WEB-INF\\Form.html");
			driver.findElement(By.id("num")).sendKeys(id);

			driver.findElement(By.id("name")).sendKeys(name);
			driver.findElement(By.id("salary")).sendKeys(salary);

			driver.findElement(By.id("designation")).sendKeys(designation);
			driver.findElement(By.id("email")).sendKeys(email);


			//driver.findElement(By.id("submit")).click();
		}
		
	}
}