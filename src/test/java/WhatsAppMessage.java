package myTests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsAppMessage {
	public static String words() {
		HashSet<String> words = new HashSet<>();
		words.add("Lusu");
		words.add("Paithiyam");
		words.add("kiruki");
		words.add("Pappa");
		ArrayList<String> li=new ArrayList<>(words);
		int ran=new Random().nextInt(li.size());
		return li.get(ran);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[text()='Link with phone number']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Type your phone number.']")).sendKeys("7639551131");
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//span[text()='Bae']")).click();
		for (int i = 0; i < 5000 ; i++) {
//			for (int j = 0; j < message.length; j++) {
				driver.findElement(By.xpath("//div[@aria-label='Type a message']"))
						.sendKeys(WhatsAppMessage.words());
				driver.findElement(By.xpath("//span[@data-icon='send']")).click();
//			}
		}

	}
	/**
	 * https://web.whatsapp.com/
	 * 
	 * //span[text()='Link with phone number']
	 * 
	 * //input[@aria-label='Type your phone number.']
	 * 
	 * //div[text()='Next']
	 * 
	 * //span[text()='Bae']
	 * 
	 * (//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]
	 * 
	 * //span[@data-icon='send']
	 */

}
