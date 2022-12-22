package automation.chllanges;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
final String excelData="./TestData/TestData.xlsx"; //For final keyword no body can change data, 
  @Test                                                 //excel folder location 
public void readExcelData() throws Throwable {
	//FileInputStream(Java class) to identify the location of the file & pass excelData as argument
	FileInputStream data=new FileInputStream(excelData);
	//I used XSSFWorkbook class from Apachi POI to create the object & pass the parameter which is
	// a object of FileInputStream
	XSSFWorkbook workbook=new XSSFWorkbook(data);
	//I used XSSFSheet sheet=workbook(object of XSSFWorkbook)to call the getSheet method & pass
	//the sheet name as a parameter, it takes control all the sheet data
	XSSFSheet sheet=workbook.getSheet("testData");
	//Iterator(Coming from Java util package)to go throw all the excel sheet,<Row> (coming from
	//Apachi poi),I go through the iterator creating object to go through all the sheet value
	//and ignor the header using next() method
	Iterator<Row> rowiterator=sheet.iterator();
	rowiterator.next();
	//I declare ArrayList for multiple data and list as a object to take control all the data
	ArrayList<String> list=new ArrayList<String>();
	//I can use any loop,but while loop is better for end number of data and passing the condition
	//itrator object to call the hasNext() & I can take control of all the sheet
	
	while(rowiterator.hasNext()){
		//Help of ArrayList object,call the add() & using getCell value I read the data from excel 
		list.add(rowiterator.next().getCell(0).getStringCellValue());
		System.out.println(list);
	}
	
	
	
	
}

}
