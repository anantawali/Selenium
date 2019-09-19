package Fidelity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
public ArrayList<String> getData(String testcasename) throws IOException
	{
        ArrayList<String> a = new ArrayList<String>();
	    FileInputStream fis = new FileInputStream("//Users//anantawali//Desktop//Dataframework.xlsx");
		XSSFWorkbook worksheet = new XSSFWorkbook(fis);
		int count = worksheet.getNumberOfSheets();
		for (int i =0;i<count;i++)
		{
			
			if(worksheet.getSheetName(i).equalsIgnoreCase("testdata2"))
			{
				XSSFSheet sheet = worksheet.getSheetAt(i);
				
				Iterator <Row> row = sheet.iterator();
				Row firstrow = row.next();
				Iterator <Cell> c = firstrow.cellIterator();
				int column=0;
				int k=0;
				while(c.hasNext())
				{
					Cell value = c.next();
					if(value.getStringCellValue().equals("TestCases"))
					{
						column=k;
						
					}
					k++;
					
				}
				System.out.println(column);
				while(row.hasNext())
				{
				Row r =	row.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
				{
					
					Iterator <Cell> ce = r.cellIterator();
					while(ce.hasNext())
					{
						Cell cv = ce.next();
						if(cv.getCellTypeEnum()==CellType.STRING)
						{
							a.add(cv.getStringCellValue());
						}
						else
						{
							a.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
							
						}
					}
				    }
				}
					
			}
				
			
		}
		return a;
		}
		
		
public static void main(String[] args) {
		
		
}
}
