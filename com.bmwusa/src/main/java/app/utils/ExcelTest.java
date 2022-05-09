package app.utils;

import base.BasePage;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelTest extends BasePage {

    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\ashar\\IdeaProjects\\SeleniumBootcampWinterWeekend2022\\com.bmwusa\\" +
                "src\\test\\resources\\test_data.xlsx");

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet1 = wb.getSheetAt(2);
        String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
        String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
        System.out.println(data0 + " " + data1);
    }
}
