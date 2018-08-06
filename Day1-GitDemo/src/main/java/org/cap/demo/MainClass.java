package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		
		SalesClass class1=new SalesClass();
		DetailsClass details=new DetailsClass();
		System.out.println("Hello World!");
          greet();
          class1.show();
          details.display();
	}
public static void greet() {
	System.out.println("Hello");
}
}
