package org.tcs;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.DecimalFormat;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class BaseClass {

		static WebDriver driver;

		public void browserConfigChrome() {
			driver = new ChromeDriver();
		}

		public void openUrl(String url) {
			driver.get(url);
		}

		public void maximizeWindow() {
			driver.manage().window().maximize();
		}

		public void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}

		public WebElement locateById(String id) {
			WebElement findElement = driver.findElement(By.id(id));
			return findElement;
		}

		public WebElement locateByName(String name) {
			WebElement findElement = driver.findElement(By.name(name));
			return findElement;
		}

		public WebElement locateByXpath(String xpathExpression) {
			WebElement findElement = driver.findElement(By.xpath(xpathExpression));
			return findElement;
		}

		public void inputText(WebElement element, String value) {
			element.sendKeys(value);
		}

		public void click(WebElement element) {
			element.click();
		}

		public void close() {
			driver.close();
		}

		public static void quit() {
			driver.quit();
		}

		public void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}

		public void getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}

		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("Value");
			return attribute;
		}

		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}

		public void actionsClass() {
			@SuppressWarnings("unused")
			Actions actions = new Actions(driver);
		}

		public void mouseOverAction(Actions actions, WebElement refName) {
			actions.moveToElement(refName).perform();
		}

		public void dragAndDrop(Actions actions, WebElement source, WebElement target) {
			actions.dragAndDrop(source, target).perform();
		}

		public void rightClick(Actions actions, WebElement target) {
			actions.moveToElement(target).doubleClick().perform();
		}

		public void keyDown(Actions actions, CharSequence key) {
			actions.keyDown(key).perform();
		}

		public void keyUp(Actions actions, CharSequence key) {
			actions.keyUp(key).perform();
		}

		public void navigateBack() {
			driver.navigate().back();
		}

		public void navigateFwd() {
			driver.navigate().forward();
		}

		public void navigateRefresh() {
			driver.navigate().refresh();
		}

		public void robotEnter() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

		public void robotShift() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}

		public void robotCtrl() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		public void robotUp() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
		}

		public void robotDown() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}

		public void robotTab() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}

		public WebElement findElementByXpath(String xpathAttribute) {

			WebElement element = driver.findElement(By.xpath(xpathAttribute));
			return element;

		}

		public static void maximize() {
			driver.manage().window().maximize();
		}

		public void sendText(WebElement element, String text) {
			element.sendKeys(text);
		}

		public void selectOptionbyText(WebElement element, String text) {

			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		public void selectOptionbyIndex(WebElement element, int index) {

			Select select = new Select(element);
			select.selectByIndex(index);
		}

		public void selectOptionbyValue(WebElement element, String attributeValue) {

			Select select = new Select(element);
			select.selectByValue(attributeValue);
		}

		public void deselectOptionbyText(WebElement element, String text) {

			Select select = new Select(element);
			select.deselectByVisibleText(text);
		}

		public void deselectOptionbyIndex(WebElement element, int index) {

			Select select = new Select(element);
			select.deselectByIndex(index);
		}

		public void deselectOptionbyValue(WebElement element, String attributeValue) {

			Select select = new Select(element);
			select.deselectByValue(attributeValue);

		}

		public void deselectAll(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();

		}

		public List<WebElement> getOptions(WebElement element) {

			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			return options;

		}

		public void printOptions(WebElement element) {

			Select select = new Select(element);
			List<WebElement> options = select.getOptions();

			for (int i = 0; i < options.size(); i++) {

				WebElement element2 = options.get(i);
				String text = element2.getText();
				System.out.println(text);
			}

		}

		public void selectAll(WebElement element) {

			Select select = new Select(element);
			List<WebElement> options = select.getOptions();

			for (int i = 0; i < options.size(); i++) {
				select.selectByIndex(i);
			}

		}

		public void selectAllBytext(WebElement element) {

			Select select = new Select(element);
			List<WebElement> options2 = select.getOptions();

			for (WebElement webElement : options2) {
				String text = webElement.getText();
				select.selectByVisibleText(text);

			}
		}

		public void takeScreenshot(String destination) throws IOException {

			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File s = screenshot.getScreenshotAs(OutputType.FILE);
			File d = new File(destination);
			FileUtils.copyFile(s, d);

		}

		public void takeScreenshotForElement(WebElement element, String destination) throws IOException {

			File s = element.getScreenshotAs(OutputType.FILE);
			File d = new File(destination);
			FileUtils.copyFile(s, d);

		}

		public void writeData(String sheetName, int rowNum, int cellNum, String data) throws IOException {

			File file = new File("");
			FileInputStream stream = new FileInputStream(file);

			@SuppressWarnings("resource")
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.createCell(cellNum);
			cell.setCellValue(data);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

		}

		public void excelWrite(String path, String sheetName, int rowNum, int cellNum, String value) throws IOException {

			File file = new File(path);
			FileInputStream stream = new FileInputStream(file);

			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			cell.setCellValue(value);

			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);

		}

		public String excelRead(String path, String sheetName, int rowNum, int cellNum) throws IOException {

			String value = null;
			File file = new File(path);
			FileInputStream stream = new FileInputStream(file);

			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			CellType cellType = cell.getCellType();

			switch (cellType) {

			case STRING:
				value = cell.getStringCellValue();
				break;

			case NUMERIC:

				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
					value = dateFormat.format(dateCellValue);

				}

				else {
					double cellValue = cell.getNumericCellValue();
					value = new DecimalFormat("").format(cellValue).toString().replaceAll(",", "");
					System.out.println(value);

				}
				break;

			case BLANK:
				break;
			case BOOLEAN:
				break;
			case ERROR:
				break;
			case FORMULA:
				break;
			case _NONE:
				break;
			default:
				break;
			}

			return value;

		}

		public void frameById(String frameId) {

			driver.switchTo().frame(frameId);

		}

		public void frameByName(String frameName) {

			driver.switchTo().frame(frameName);

		}

		public void frameByWebElement(WebElement element) {

			driver.switchTo().frame(element);

		}

		public void frameByIndex(String frameId) {

			driver.switchTo().frame(frameId);

		}

		public int frameCount(String frameName) {

			List<WebElement> findElements = driver.findElements(By.tagName(frameName));
			int frameCount = findElements.size();
			return frameCount;

		}

		public void returnFromFrame() {

			driver.switchTo().defaultContent();

		}

		public void simpleAlert() {

			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		public WebElement locateByClassName(String data) {
			WebElement findElement = driver.findElement(By.className(data));
			return findElement;
		}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
