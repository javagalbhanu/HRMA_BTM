package com.hrm.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrm.base.AutomationConstants;

public class DemoJS{

	public static void test(String... str){
		System.out.println(str.length);
	}
	public static void main(String[] args) {
		test();
		test("a");
		test("a","b");
	}

}
