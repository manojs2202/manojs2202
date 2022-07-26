package LearningTestNG;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class MSExmlFile {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        File file = new File("C:/Users/shiva/Desktop/Excel/PetStore.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheetAt(0);
        Iterator<Row> row = sh.rowIterator();
        while (row.hasNext()) {
            Row rows = row.next();
            Iterator<Cell> cell = rows.cellIterator();
            while (cell.hasNext()) {
                Cell ca = cell.next();
                System.out.print(ca.toString() + "\t");
            }
            System.out.println();

        }
    }
}
