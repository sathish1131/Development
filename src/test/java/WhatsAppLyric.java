package myTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsAppLyric {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[text()='Link with phone number']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Type your phone number.']")).sendKeys("7639551131");
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//span[text()='Bae']")).click();
		String lyric="Nallai allai.. nallai allai Nannilavae nee.. nallai allai Nallai allai.. nallai allai Nalliravae nee.. nallai allai Oligalin thedal enbadhellam Mounathil mudigindradhae Mounathin thedal enbadhellam Gnyaanathil mudigindradhae…aeeee…. Naan unnai thedum Velaiyilae nee Megam soodi Odivittaaiii… Nallai allai.. nallai allai Nannilavae nee.. nallai allai Nallai allai.. nallai allai Nalliravae nee.. nallai allai Mugai mugil Mottendra nilaigalilae Muganthoda kaathirundhen Malar endra nilai vittu Pooththirundhaai Manam kolla kaathirunthenn… Magarandham thedi Nugarum munnae Veyil kaattil veezhndhuvittaai… Nallai allai.. nallai allai Naarumpoovae nee… nallai allai Nallai allai…nallai allai Mullai kollai nee… nallai allai";
		String[] splitLyric = lyric.split(" ");
		for (int i = 0; i < splitLyric.length; i++) {
			driver.findElement(By.xpath("//div[@aria-label='Type a message']"))
					.sendKeys(splitLyric[i]);
			driver.findElement(By.xpath("//span[@data-icon='send']")).click();
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
