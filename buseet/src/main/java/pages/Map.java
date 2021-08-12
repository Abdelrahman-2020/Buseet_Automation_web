package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Map extends PageBase {

	public Map(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "searchboxinput")
	WebElement SearchBox;
	
	@FindBy (xpath="//*[@id=\"pane\"]/div/div[1]/div/div/div[4]/div[1]/div")
	WebElement directions_Btn;
	public void seacrh () {
		
		SearchBox.sendKeys("المعادى كورنيش النيل، مصر حلوان الزراعي، معادي الخبيري الوسطي، حي المعادي");
		SearchBox.sendKeys(Keys.ENTER);
		directions_Btn.click();
		
		
	}


	
	
	

}
