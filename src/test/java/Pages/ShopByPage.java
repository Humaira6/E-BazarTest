package Pages;

import org.openqa.selenium.By;

public class ShopByPage extends BasicPage {

    public By FreshVegetables = By.xpath("//a[@class='accordion-toggle collapsed'][normalize-space()='Fresh Vegetables']");
    public By Fruits = By.xpath("//a[contains(@class,'accordion-toggle collapsed')][normalize-space()='Fruits']");
    public By DryFruits = By.xpath("//a[contains(@class,'accordion-toggle collapsed')][normalize-space()='Dry Fruits']");
    public By Juice = By.xpath("//a[contains(@class,'accordion-toggle collapsed')][normalize-space()='Juice']");
}
