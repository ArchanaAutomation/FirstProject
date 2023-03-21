package Framework1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class readexcelIFcondition {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\archa\\Downloads\\Book1.xlsx");
		FileInputStream inputstream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheet("Read Excel");
		int lastRowNum = sheet.getLastRowNum();  //used to read dynamically so we don't need to set row and cell numbers. 
		//read whole sheet until last cell we used
		//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		short lastCellNum = sheet.getRow(0).getLastCellNum(); //getrow should be zero, so that we can read header
		for (int i =1; i <=lastRowNum; i++) {  //we don't need to set i j values, we used dynamic method(lk:lastrownum, physicalnum)
			XSSFRow row = sheet.getRow(i); 
			for (int j = 0; j <lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				//String stringCellValue = cell.getStringCellValue();
//String value = cell.getStringCellValue();//it will return only string in excel byusing dataformatter we can access int value also
				DataFormatter datformatter = new DataFormatter();//return alltype of value in excel
				String value=datformatter.formatCellValue(cell);
				System.out.println(value); 
			} 
System.out.println();
		}
	}
//String data=Sheet.getRow(i).getCell(j).getstringvalue(); we can write it in one line also
} 

