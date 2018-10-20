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
package org.maven.maven_sel;

/**
 * 
 * @version $Id$
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/edureka/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
		driver.get("http://localhost:8090/addressbook");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
		driver.findElement(By.className("v-button-primary")).click();
		// Thread.sleep(5000);
		driver.quit();
	}
}