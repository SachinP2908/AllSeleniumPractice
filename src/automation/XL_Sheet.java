package automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Sheet {
public static void main(String[] args) throws Exception {
	File src=new File("C://Users//sachin//Desktop//TestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh1=wb.getSheetAt(0);
	String value=sh1.getRow(2).getCell(0).getStringCellValue();
	System.out.println(value);
	DataFormatter df=new DataFormatter();
	String vl = df.formatCellValue(sh1.getRow(0).getCell(0));
	System.out.println(vl);
}
}
