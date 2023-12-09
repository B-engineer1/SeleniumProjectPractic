package mouceaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// DragAndDropDemo
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement itely = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome, itely).perform();
		
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		
		act.dragAndDrop(madrid, spain).perform();
		
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
		
		act.dragAndDrop(oslo, norway).perform();
		
		WebElement copenhegan = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		
		act.dragAndDrop(copenhegan, denmark).perform();
		
		
	}

}
