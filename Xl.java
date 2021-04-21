package sprdsheet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exceldata {

public static void main(String[] args) throws Exception {


FileInputStream file=new FileInputStream("filelocationpath");

XSSFWorkbook wb=new XSSFWorkbook(file);

XSSFSheet sh = wb.getSheet("Sheet1");

int rowcount=sh.getLastRowNum();
System.out.println("total rows"+rowcount);
Row row =sh.getRow(0);

int colcount=row.getLastCellNum();
System.out.println("total column"+colcount);
int i;
int j = 0;
for(i=0;i<colcount;i++) {

if(sh.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("password")) {
 String coldata = sh.getRow(0).getCell(i).getStringCellValue();
;
System.out.println("the check i"+i);
}
for(j=1;j<rowcount;j++) {

if(sh.getRow(j).getCell(0).getStringCellValue().equalsIgnoreCase("saran")) {
System.out.println("the value of i"+i);

 String rowdata = sh.getRow(j).getCell(0).getStringCellValue();
System.out.println("the j"+j);
break;

}
}}
String output = sh.getRow(j).getCell(i).getStringCellValue();
System.out.println(output);
}

}
