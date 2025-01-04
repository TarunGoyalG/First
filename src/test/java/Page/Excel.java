package Page;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	 public static void main(String[] args) {
		 String path="C:\\Users\\HP\\Desktop\\ExcelPractice.xlsx";
	        String filePath = path;
	        String outputFilePath = path;

	        try (FileInputStream fis = new FileInputStream(path);
	             Workbook workbook = new XSSFWorkbook(fis)) {

	            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");
	            int ageColumn = 1; // Assuming Age is the 2nd column (index 1)
	            int statusColumn = 2; // Assuming Status is the 3rd column (index 2)

	            // Iterate through each row starting from row 1 (assuming row 0 is headers)
	            for (Row row : sheet) {
	                if (row.getRowNum() == 0) continue; // Skip header row

	                Cell ageCell = row.getCell(ageColumn);
	                Cell statusCell = row.createCell(statusColumn);

	                if (ageCell != null && ageCell.getCellType() == CellType.NUMERIC) {
	                    int age = (int) ageCell.getNumericCellValue();
	                    statusCell.setCellValue(age > 18 ? "Major" : "Minor");
	                }
	            }

	            // Save the updated file
	            try (FileOutputStream fos = new FileOutputStream(path)) {
	                workbook.write(fos);
	            }
	            System.out.println("File updated successfully at " + outputFilePath);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
