package tutorial.fullCodes.excellDriven.example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;

public class DataTest {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        Data d = new Data();

        // Note the data can be for example username and password to be used as key by using SendKeys
        ArrayList data = d.getData("Purchase");
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));

        WebDriver driver = new ChromeDriver();

       // driver.findElement(By.xPath("kkkkk")).sendKeys(data.get(1));

    }
}
