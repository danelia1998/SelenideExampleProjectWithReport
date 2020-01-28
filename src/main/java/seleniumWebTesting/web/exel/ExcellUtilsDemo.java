package seleniumWebTesting.web.exel;

public class ExcellUtilsDemo {
    public static void main(String[] args) {

        String fileName = "/src/main/java/seleniumWebTesting/web/exel/dataSaver.xls";
        ExcelUtils excel = new ExcelUtils(fileName,"Sheet1");

//        excel.getRowCount();
//
//        excel.getCellDataNumber(1,0) ;
        String inte = excel.getCellDataNumber(1, 0);
//        System.out.println(inte);

        String strr = excel.getCellDataString(1,1);
//        System.out.println(strr);
    }
}
