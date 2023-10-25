import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		RemoteWebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/");

		File src = driver.getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshot/ssWay3");

		Files.copy(src, dest);
	}

}
