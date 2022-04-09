package selenium_basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class dataproviderusingexcel {
	public static void main(String[] args) throws IOException{
		FileInputStream file=new FileInputStream("G:\\Anju\\Dataprovider.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("data1");
		int count=sheet.getLastRowNum();
		System.out.println(count);

		


	}

}
