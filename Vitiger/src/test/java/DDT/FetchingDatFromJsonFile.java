package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchingDatFromJsonFile {

	public static void main(String[] args) throws Throwable {
	FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\A15\\jsonData.txt");
	
	ObjectMapper jsondata = new ObjectMapper();
	
	JsonNode data = jsondata.readTree(file);
	
	String URL = data.get("url").asText();
	String USN= data.get("username").asText();
	String PWD = data.get("password").asText();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get(URL);
	
	driver.findElement(By.name("user-name")).sendKeys(USN);
	driver.findElement(By.name("password")).sendKeys(PWD);

	driver.findElement(By.id("login-button")).click();
	
	
	
	}

}
