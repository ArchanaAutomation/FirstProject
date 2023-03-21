package Framework1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Create an object of File class to open xlsx file
		File file=new File("C:\\Users\\archa\\Downloads\\Book1.xlsx");
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputstream=new FileInputStream(file);
		//Creating workbook instance that refers to .xls file
		XSSFWorkbook wb=new XSSFWorkbook(inputstream);
		//Creating a Sheet object using the sheet Name
		XSSFSheet sheet=wb.getSheet("Read Excel");
		//Create a row object to retrieve row at index 1    horixonal called as row
		XSSFRow row=sheet.getRow(4);
		//Create a cell object to retreive cell at index 5
		XSSFCell cell=row.getCell(1);
		//Get the address in a variable
		String address=cell.getStringCellValue();
		//sheet.getRow(1).getCell(1).getStringCellValue(); we can simply write in single line instead of three lines
		System.out.println("From :"+ address);

	}
}




