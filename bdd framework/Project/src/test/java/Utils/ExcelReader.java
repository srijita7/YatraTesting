package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String readDataFromExcel(String location, String sheetName, int row, int col) throws IOException
    {
        FileInputStream fis=new FileInputStream(location);
        try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
			XSSFSheet sheet=workbook.getSheet(sheetName);
			DataFormatter format=new DataFormatter();

			return format.formatCellValue(sheet.getRow(row).getCell(col));
		}
    }
}

		