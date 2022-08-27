package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	public static String getTD(int rowindex,int colindex) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\Tiks zerodha.xlsx");
	Sheet sh =WorkbookFactory.create(fis).getSheet("tiku");
	String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;

}
}