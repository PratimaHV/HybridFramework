package practice;


import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class excel {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		FileInputStream fis = new FileInputStream("./Book2.xlsx.xlsx"); 
	
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sh=book.getSheet("Sheet1");
		
		Row row=sh.getRow(0);
		
		Cell cel=row.getCell(0);
		
		String data=cel.getStringCellValue();
		
		System.out.println(data);
		
		book.close();
		
		
	}

}
