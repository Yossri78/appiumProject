package appiumPackage;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import appiumData.JsonDataReader;


public class AppiumTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws IOException, ParseException {

		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();

		// Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Set android deviceName desired capability. Set your device name.
		capabilities.setCapability(jsonReader.deviceName, jsonReader.deviceNameValue);

		// Set android VERSION desired capability. Set your mobile device's OS version.
		capabilities.setCapability(jsonReader.platformVersion, jsonReader.platformVersionValue);

		// Set android platformName desired capability. It's Android in our case here.
		capabilities.setCapability(jsonReader.platformName, jsonReader.platformNameValue);

		// Set android appPackage desired capability. It is
		// com.android.calculator2 for calculator application.
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability(jsonReader.appPackage, jsonReader.appPackageValue);

		// Set android appActivity desired capability. It is
		// com.android.calculator2.Calculator for calculator application.
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability(jsonReader.appActivity, jsonReader.appActivityValue);
		capabilities.setCapability(jsonReader.noReset, jsonReader.noResetValue);

		// Created object of RemoteWebDriver will all set capabilities.
		// Set appium server address and port number in URL string.
		// It will launch calculator app in android device.
		driver = new RemoteWebDriver(new URL(jsonReader.URL), capabilities);
		System.out.println("Application started");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void test() {

	}

	@AfterTest
	public void End() {

	}
}
