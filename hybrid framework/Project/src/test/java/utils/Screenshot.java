package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
    public static String getScreenShot(WebDriver driver, String fileName) throws IOException {
        
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
            String date=format.format(new Date());
            File yatra=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String destination=System.getProperty("user.dir")+"/screenshot/"+"Yatra Test_"+fileName+"_"+date+".png";
            FileUtils.copyFile(yatra, new File(destination));
            return destination;
    }
}
