package baseClass.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
public static WebDriver driver;
	
	public static Actions a;
	
	public static void lanchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	public static void maxWindow() {
		
		driver.manage().window().maximize();
	}
	
	public static  void passUrl(String url) {
		
		driver.get(url);

	}
	public static void sendText(String txt,WebElement element) {
		
		element.sendKeys(txt);
		
	}
	public static void toclick(WebElement element) {
		element.click();
		
	}
	
	public static String toGetAttribute(WebElement element) {
		
		String attribute = element.getAttribute("value");
		
		return attribute;
	}
	public static void toGetCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
	}
	public static void moveElement(WebElement element) {
		
		a = new Actions(driver);
		
		a.moveToElement(element).perform();
	}
	public static void toPerformClick() {
		a.contextClick().perform();
	}
	
	public static void toPerformEnterKey() throws AWTException {
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static String excelRead(String sheetname, int row, int cell) throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-framework\\Testing_framwork\\file\\Data Driven class.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook w=new XSSFWorkbook(f);
		Sheet s = w.getSheet(sheetname);
		 Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value;
		
		if (cellType == 1) {
			value =c.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			SimpleDateFormat si = new SimpleDateFormat("dd-MM-yyyy");
			value = si.format(d);
		}else {
			double dd = c.getNumericCellValue();
			long l = (long) dd;
			value =String.valueOf(l);
			
		}
		return value;
		
	}
	


}
