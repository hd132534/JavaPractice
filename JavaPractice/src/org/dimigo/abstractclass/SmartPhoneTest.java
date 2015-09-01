package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone[] smartphone = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone phone : smartphone) {
			System.out.println(phone.toString());
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
			
			System.out.println("");
		}

	}

}