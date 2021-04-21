package appiumData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {
	public String deviceName,deviceNameValue,platformVersion,platformVersionValue,platformName,platformNameValue,appPackage,appPackageValue,appActivity,appActivityValue,noReset,noResetValue,URL;
	public void JsonReader() throws IOException, ParseException 
	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/appiumData/appiumData.json";

		File srcFile = new File(filePath); 

		JSONParser parser = new JSONParser(); 
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile)); 

		for(Object jsonObj : jarray) 
		{
			JSONObject person = (JSONObject) jsonObj ;

			deviceName  = (String) person.get("deviceName"); 
			System.out.println(deviceName);

			deviceNameValue = (String) person.get("deviceNameValue"); 
			System.out.println(deviceNameValue);

			platformVersion  = (String) person.get("platformVersion"); 
			System.out.println(platformVersion);

			platformVersionValue = (String) person.get("platformVersionValue"); 
			System.out.println(platformVersionValue);
			
			platformName  = (String) person.get("platformName"); 
			System.out.println(platformName);

			platformNameValue = (String) person.get("platformNameValue"); 
			System.out.println(platformNameValue);

			appPackage  = (String) person.get("appPackage"); 
			System.out.println(appPackage);

			appPackageValue = (String) person.get("appPackageValue"); 
			System.out.println(appPackageValue);
			
			appActivity  = (String) person.get("appActivity"); 
			System.out.println(appActivity);

			appActivityValue = (String) person.get("appActivityValue"); 
			System.out.println(appActivityValue);
			
			noReset = (String) person.get("noReset"); 
			System.out.println(noReset);
			
			noResetValue = (String) person.get("noResetValue"); 
			System.out.println(noResetValue);
			
			URL = (String) person.get("URL"); 
			System.out.println(URL);
		}
	}

}
