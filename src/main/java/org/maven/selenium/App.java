/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.maven.selenium;

/**
 * 
 * @version $Id$
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class App {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
		chromeOptions.addArguments("disable-infobars"); // disabling infobars
		chromeOptions.addArguments("--disable-extensions"); // disabling extensions
		chromeOptions.addArguments("--disable-gpu"); // applicable to windows os only
		chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model
		chromeOptions.addArguments("-headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
		driver.get("http://localhost:3001/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		driver.findElement(By.name("login")).sendKeys("devops");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("click")).click();		
		Thread.sleep(5000);
		driver.quit();
	}
}
