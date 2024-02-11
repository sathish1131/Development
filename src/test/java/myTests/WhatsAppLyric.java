package myTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WhatsAppLyric {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//span[text()='Link with phone number']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Type your phone number.']")).sendKeys("7639551131");
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("//span[text()='Bae']")).click();
		String lyric="Mudhal nee mudivum nee Moondru kaalam nee Kadal nee karaiyum nee Kaatru kooda nee Manadhoram oru kaayam Unnai ennadha naal illaiyae Naanaga naanum illaiyae Vazhiyengum pala bimbam Adhil naan saaya thozh illaiyae Un pola yaarum illaiyae Males : Theera nadhi neethaanadi Neendhaamal naan moozhgi ponen Neethaanadi vaanil madhi Neeyalla naan thaanae theindhen Paadhi kaanagam Adhil kaanamal ponavan Oru paavai kaal thadam Adhai thedamal theinthavan Kaanadha baaram en nenjilae Thunai illa naan andrilae Naal ellaam pogum aanalum naan Uyir illadha udalae Mudhal nee mudivum nee Moondru kaalam nee Kadal nee karaiyum nee Kaatru kooda nee Dhoora desathil thozhainthaayo Kanmani Unai thedi kandathum En kannellaam minnmini Pinnokki kaalam pogum enil Un mannippai kooruven Kannokki nerai paarkkum kanam Pizhai ellaamae kalaiven Mudhal nee mudivum nee Moondru kaalam nee Kadal nee karaiyum nee Kaatru kooda nee Nagaradha kadigaaram Adhu pol naanum nindrirundhen Nee engu sendraai kannamma Azhagaana aridhaaram Velipaarvaikku poosi konden Punnaigaikku podhum kannamma Nee ketkavae en padalai Un aasai raagathil seidhen Un punnagai pon minnalai Naan korthu aangaangu neidhen Mudhal nee…eee… Mudivum nee…ee…ee…";
		String[] splitLyric = lyric.split(" ");
		for (int i = 0; i < splitLyric.length; i++) {
			driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"))
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
