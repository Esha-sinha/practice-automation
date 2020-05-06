package com.ecom.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.model.Product;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[contains(@title,'Women')]")
	private WebElement women;

	@FindBy(xpath = "//a[@class='product-name'][contains(.,'Faded Short Sleeve T-shirts')]")
	private WebElement product1;

	@FindBy(xpath = "(//span[contains(@class,'price product-price')])[1]")
	private WebElement productPrice1;

	@FindBy(xpath = "//a[@class='product-name'][contains(.,'Blouse')]")
	private WebElement product2;

	@FindBy(xpath = "(//span[contains(.,'$27.00')])[1]")
	private WebElement productPrice2;

	@FindBy(xpath = "(//a[@class='product-name'][contains(.,'Printed Dress')])[1]")
	private WebElement product3;

	@FindBy(xpath = "(//span[contains(.,'$26.00')])[1]")
	private WebElement productPrice3;

	@FindBy(xpath = "(//a[@class='product-name'][contains(.,'Printed Dress')])[2]")
	private WebElement product4;

	@FindBy(xpath = "(//span[contains(.,'$50.99')])[1]")
	private WebElement productPrice4;

	@FindBy(xpath = "(//a[@class='product-name'][contains(.,'Printed Summer Dress')])[1]")
	private WebElement product5;

	@FindBy(xpath = "(//span[contains(.,'$28.98')])[1]")
	private WebElement productPrice5;

	@FindBy(xpath = "(//a[@class='product-name'][contains(.,'Printed Summer Dress')])[2]")
	private WebElement product6;

	@FindBy(xpath = "(//span[contains(.,'$30.50')])[1]")
	private WebElement productPrice6;

	@FindBy(xpath = "(//a[@class='product-name'][contains(.,'Printed Chiffon Dress')])[2]")
	private WebElement product7;

	@FindBy(xpath = "(//span[contains(.,'$16.40')])[2]")
	private WebElement productPrice7;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public List<Product> getProductsList() {
		List<Product> products = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setProductName(product1.getText());
		p1.setPrice(Double.parseDouble(productPrice1.getText().trim().substring(1)));
		products.add(p1);

		Product p2 = new Product();
		p2.setProductName(product2.getText());
		p2.setPrice(Double.parseDouble(productPrice2.getText()));
		products.add(p2);

		Product p3 = new Product();
		p3.setProductName(product3.getText());
		p3.setPrice(Double.parseDouble(productPrice3.getText()));
		products.add(p3);

		Product p4 = new Product();
		p4.setProductName(product4.getText());
		p4.setPrice(Double.parseDouble(productPrice4.getText()));
		products.add(p4);

		Product p5 = new Product();
		p5.setProductName(product5.getText());
		p5.setPrice(Double.parseDouble(productPrice5.getText()));
		products.add(p5);

		Product p6 = new Product();
		p6.setProductName(product6.getText());
		p6.setPrice(Double.parseDouble(productPrice6.getText()));
		products.add(p6);

		Product p7 = new Product();
		p7.setProductName(product7.getText());
		p7.setPrice(Double.parseDouble(productPrice7.getText()));
		products.add(p7);
		return products;

	}

	public void getProductInRange()  {
		women.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		List<Product> products = getProductsList();
		int size = products.size();

		for (int i = 0; i >= size; i++) {

			if (products.get(i).getPrice() < 28.00) {
				LOG.info(products.get(i).getProductName() + ":" + products.get(i).getPrice());
			}

		}

	}

}
