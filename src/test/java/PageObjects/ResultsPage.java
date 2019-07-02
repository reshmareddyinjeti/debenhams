package PageObjects;

import DebenamsTestSuites.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends Hooks {
    //SIZE TEST

    public void WomenSection(String customerSelectedSize) {
        driver.findElement(By.linkText("Women")).click();
        List<WebElement> sizeWebelements = driver.findElements(By.cssSelector(".pw-accordion__content-wrapper .pw-accordion__content"));
        for (WebElement sizeWebelement : sizeWebelements) {
            if (sizeWebelement.getText().equalsIgnoreCase(customerSelectedSize)) ;
            sizeWebelement.click();
            break;
        }
    }
    public void getAllProductsOnFilleterdSize(){
        List<Double> collectedSize=new ArrayList<>();
      List<WebElement> customerSeletedSizes= driver.findElements(By.cssSelector(".c-product-applied-filters__filter-block"));
      for (WebElement customerSelectedSize:customerSeletedSizes){
          customerSelectedSize.getAttribute("pw-button__inner");
     // collectedSize.add(customerSelectedSize);
      }
    }
    //CATEGIERIES TEST
    public void selectCustomerCategire(String customerSelectedCategire ){
        driver.findElement(By.linkText("Women")).click();
        List<WebElement> categireWebelements=driver.findElements(By.cssSelector(".pw-accordion__content"));
        for (WebElement categireWebelement:categireWebelements){
            if(categireWebelement.getText().equalsIgnoreCase(customerSelectedCategire)){
                categireWebelement.click();
                break;
            }
        }
    }
    public void getAllProductionOnFilltererCategire(){
       // List<WebElement> customerSelectedCatogires=driver.findElements(By.cssSelector("."));
        driver.findElement(By.tagName("h1")).getText();
    }

}
