package com.cts.util;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.model.Product;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
public class ProductExcelFileTest {
	
	@InjectMocks
	ProductExcelFile productExcelFile;
	
	@Test
	public void addItemInExcelTest(){
		String fileName = "./src/main/resources/excel/product.xlsx";
		Product pro = new Product();
		pro.setPrice("89.56");
		pro.setProdId("12");
		pro.setProdName("CarBox");
		
		/*
		 * PowerMockito.mockStatic(Files.newInputStream.class);
		 * PowerMockito.mock(Files.newInputStream(Mockito.any())).thenThrow(IOException.
		 * class); boolean excOccured =false; String a; try { a =
		 * productExcelFile.addItemInExcel(fileName, pro); }catch (IOException ioe) {
		 * excOccured =true; } Assert.assertTrue(excOccured); assertNotNull(a);
		 * Assert.assertEquals("", a);
		 */
		
		
	}
	
	@Test
	public void removeItemFromExcelTest(){
		String fileName = "./src/main/resources/excel/product.xlsx";
		Product pro = new Product();
		pro.setPrice("89.56");
		pro.setProdId("12");
		pro.setProdName("CarBox");
		assertNull(productExcelFile.removeItemFromExcel(fileName, "12356"));
	}
	
	/*@Test
	public void removeRowTest(){
		Sheet sheet = null;
		sheet.setro
		int rowIndex = 12;
		productExcelFile.removeRow(sheet, rowIndex);
	}*/

}
