package seleniumWebTesting.web.exel;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;

public class ExcelUtils {

    static String fileName ;
    static HSSFWorkbook workbook;
    static HSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) {
        try {
            File file = new File(System.getProperty("user.dir"), excelPath);
            workbook = new HSSFWorkbook(new FileInputStream(file));
            sheet = workbook.getSheet(sheetName);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

//        getRowCount();
        getCellDataString(1,1);
        getCellDataNumber(1,0);
    }

    public static void getRowCount() {

        try {

            int rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("No of rows : " +rowCount);
        }catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
    }

    public static String getCellDataString(Integer row, Integer cell) {
        String cellData = "";
        try {
            cellData = sheet.getRow(row).getCell(cell).getStringCellValue();
//            System.out.println(cellData);
            return cellData;

        }catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return cellData;
    }

    public static String getCellDataNumber(Integer row, Integer cell) {
        String inte = "";
        try {
            double cellData = sheet.getRow(row).getCell(cell).getNumericCellValue();
//            System.out.println(cellData);
            Double price = cellData;
            DecimalFormat format = new DecimalFormat("0.#");
            inte = (format.format(price));
            return inte;

        }catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

        return inte;
    }

}
