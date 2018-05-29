package ebay;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {

	public static AndroidDriver<AndroidElement> setup() throws MalformedURLException {
	
		
		// Pick the app 
		
			File f=new File("src");
			File app=new File(f,"ebay_new.apk");
				
		// Provide Capabilities for Appium session
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Nexus_5");
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("app", app.getAbsolutePath());
		//capabilities.setCapability("platformVersion", "7.0");
		//capabilities.setCapability("appPackage", "au.com.suncorp.marketplace");
		//capabilities.setCapability("appWaitActivity", "*");
		//capabilities.setCapability("udid", "9885e63843544b4d49");
		//capabilities.setCapability("clearSystemFiles", true);
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		return driver;

	}

}