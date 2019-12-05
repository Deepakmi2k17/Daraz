package org.deep.testng;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Execution extends Base{
	WebDriver dr;
	@BeforeClass
	public void launch()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\eclipse-workspace\\Projectshop\\driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifictions");
		dr=new ChromeDriver(op);
		dr.get("https://www.daraz.pk/");
		dr.manage().window().maximize();
	}
	@BeforeMethod
	public void startTime()
	{
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() throws Exception
	{
		WebElement ser = dr.findElement(By.xpath("//input[@id='q']"));
		ser.click();
		ser.sendKeys(getData(0,0));
		WebElement sh = dr.findElement(By.xpath("//button[@class='search-box__button--1oH7']"));
		sh.click();
		WebElement im = dr.findElement(By.xpath("(//img[@class='c1ZEkM '])[1]"));
		im.click();
		WebElement buy = dr.findElement(By.xpath("//button[@wfd-id='665']"));
		buy.click();
		WebElement x = dr.findElement(By.xpath("//i[contains(@class,'next-icon next-icon-close next-icon-small')]"));
		x.click();
		WebElement buy2 = dr.findElement(By.xpath("//button[@wfd-id='665']"));
		buy2.click();
		}
	@AfterMethod
	public void endTime()
	{
		Date d = new Date();
	System.out.println(d);
		
	}
}
