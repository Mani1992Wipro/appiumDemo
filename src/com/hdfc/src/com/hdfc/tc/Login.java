package com.hdfc.tc;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

import java.util.concurrent.TimeUnit;





import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;





import com.hdfc.driverPackage.TestRunner;


public class Login extends TestRunner{
	
private static Login login;

MobileDriver driver;

@AndroidFindBy(xpath="//android.widget.Image[@content-desc='HDFCBANK']]")
private static MobileElement homeScreenHeader;




public Login(MobileDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);

}

/*public static synchronized Login get(){
	if(login==null){
		login=new Login(driver);
} 
return login;
}

private void Decorator() {
	PageFactory.initElements(
			new AppiumFieldDecorator( nativeDriver, new TimeOutDuration(2, TimeUnit.SECONDS)),
			this);

}*/





	
	

	/**This method is used to verify whether the home screen is present or not
	 * 
	 * @throws NoSuchElementException
	 * 
	 */

	public static void verifyHomeScreen(){
		//Decorator();
		try{
		if(homeScreenHeader.isDisplayed()){
			System.out.println("Home screen Validated");
		}
		}catch(NoSuchElementException  e){
			e.printStackTrace();
		}

	}

	


}
