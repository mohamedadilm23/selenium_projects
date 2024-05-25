package excel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xdgf.usermodel.XDGFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Filelocation="C:\\Users\\admin\\eclipse-workspace\\digiclass\\excel\\registersheet.xlsx";
		XSSFWorkbook WBOOK=new XSSFWorkbook(Filelocation);
		XSSFSheet Sheet=WBOOK.getSheetAt(0);
		 int lastrownum=Sheet.getLastRowNum();
		 System.out.println("no of rows:"+lastrownum);
	    for (int i =2; i<=lastrownum; i++) {
			XSSFRow row = Sheet.getRow(i);
			for (int j =0; j<3; j++) {
				XSSFCell Cell = row.getCell(j);
				String value = Cell.getStringCellValue();
				System.out.println(value);
			} 
		}
	    WBOOK.close();
	}
}
