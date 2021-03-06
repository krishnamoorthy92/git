package selenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {

	 public static void main(String[] args) {

		String[][] data = null;

		try {
			FileInputStream fis = new FileInputStream(new File("./data/sample.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			System.out.println("last row num" +rowCount);

			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];
			System.out.println("last coloumn count" +columnCount);
			System.out.println("data  " +data);


			// loop through the rows
			for(int i=0; i <=rowCount; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
					String cellValue;
							try{
								cellValue = row.getCell(j).getStringCellValue();
								System.out.println(cellValue);
							}catch(NullPointerException e){

							}

								
					}

				} catch (Exception e) {
 					e.printStackTrace();
				}
			}
			fis.close();
			workbook.close();
		} catch (Exception e) {
 			e.printStackTrace();
		}

		//System.out.println(data);

		
		
		
		
		
		
		
		
		
		
		
		
	}


}
