package Framework1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	//public static void main(String args[]) {

	public void WriteExcel(String SheetName, String cellValue, int row, int col) throws IOException {
		File file=new File("C:\\Users\\archa\\Downloads\\Book1.xlsx");
		FileInputStream inputstream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=wb.getSheet("Read Excel");                    //parameter sheetname
		
		sheet.getRow(1).createCell(col).setCellValue(cellValue);   //used to set the cellvalue
		FileOutputStream outputstream=new FileOutputStream(file);
		
		wb.write(outputstream); //write method
		wb.close();
		outputstream.close();
//this is for partticulardata ...SetDatainparticularRow()	
		
}
	}
//we can code for new data using syntax of SetDatanewRow()

