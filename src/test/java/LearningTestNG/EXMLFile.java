package LearningTestNG;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class EXMLFile {


    public static void main(String[] args) throws IOException {
        File file;
        file = new File("C:/Users/shiva/Desktop/Book1.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheetAt(0);
        Iterator<Row> row = sh.rowIterator();
        while(row.hasNext()){
            Row rown = row.next();
            Iterator<Cell> cell = rown.cellIterator();
            while(cell.hasNext()){
                Cell c = cell.next();
                System.out.print(c.toString()+"\t");
            }
          System.out.println();

        }
    }
}
