package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class Excelutility {
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

public static String getStringData(int a,int b,String sheet) throws IOException 
{
	f=new FileInputStream(Constant.testdata);//URL placed in constant class
	wb= new XSSFWorkbook(f);
	sh=wb.getSheet(sheet);
	XSSFRow r =sh.getRow(a);
	XSSFCell c = r.getCell(b);
	return c.getStringCellValue();

}
public static String getintegerData(int a,int b,String sheet) throws IOException
{
	f=new FileInputStream(Constant.testdata);//URL placed in Constant class
	wb= new XSSFWorkbook(f);
	sh=wb.getSheet(sheet);
	XSSFRow r =sh.getRow(a);
	XSSFCell c = r.getCell(b);
	int z=(int)c.getNumericCellValue();
	return String.valueOf(z);
}
}



