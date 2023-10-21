package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public  String readData(int row,int column) throws IOException 
	{
		File src=new File("C://Users//sachin//Desktop//TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(0);
		DataFormatter df=new DataFormatter();
		 String value = df.formatCellValue(sh1.getRow(row).getCell(column));
		 System.out.println(value);
		 return value;
	}
}
