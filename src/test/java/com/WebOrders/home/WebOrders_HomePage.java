package com.WebOrders.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrders_HomePage {

	WebDriver driver;

	public WebOrders_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "View all orders")
	WebElement allOrdersTab;

	@FindBy(linkText = "View all products")
	WebElement allProductsTab;

	@FindBy(linkText = "Order")
	WebElement orderTab;

	public WebOrders_ViewAllOrders clickOnAllOrdersTab() {
		allOrdersTab.click();
		return new WebOrders_ViewAllOrders(driver);
	}

	public WebOrders_ViewAllOrders clickOnAllProductsTab() {
		allProductsTab.click();
		return new WebOrders_ViewAllOrders(driver);
	}

	public WebOrders_OrdersPage clickOnOrdersTab() {
		orderTab.click();
		return new WebOrders_OrdersPage(driver);
	}
}
