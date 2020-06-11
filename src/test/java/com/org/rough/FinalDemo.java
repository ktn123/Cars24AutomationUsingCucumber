package com.org.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

class PP{
	public final void runn(int b) {
		int a = 10;
		a = b;
		System.out.println("Running"+a);
		
	}
}

public class FinalDemo extends PP {
	public final void run(int b) {
		int a = 10;
		a = b;
		System.out.println("Running"+a);
	}
	
	public static void main(String[] args) {
		FinalDemo d = new FinalDemo();
		d.run(100);
		
	}
	
}
