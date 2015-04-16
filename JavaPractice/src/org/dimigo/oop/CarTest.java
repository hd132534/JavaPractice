package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {
		Car2 hyundai = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
//		hyundai.setCompany("현대자동차");
//		hyundai.setModel("제네시스");
//		hyundai.setColor("검정색");
//		hyundai.setMaxSpeed(225);
//		hyundai.setPrice(50000000);
		
		Car2 kia = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
//		kia.setCompany("기아자동차");
//		kia.setModel("K7");
//		kia.setColor("흰색");
//		kia.setMaxSpeed(246);
//		kia.setPrice(40000000);
		
		Car2 samsung = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
//		samsung.setCompany("삼성자동차");
//		samsung.setModel("SM7");
//		samsung.setColor("회색");
//		samsung.setMaxSpeed(200);
//		samsung.setPrice(38000000);
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + hyundai.getCompany());
		System.out.println("모델명 : " + hyundai.getModel());
		System.out.println("색상 : " + hyundai.getColor());
		System.out.println("최대속도 : " + hyundai.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n", hyundai.getPrice());
		System.out.println("");
		
		System.out.println("제조사명 : " + kia.getCompany());
		System.out.println("모델명 : " + kia.getModel());
		System.out.println("색상 : " + kia.getColor());
		System.out.println("최대속도 : " + kia.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n", kia.getPrice());
		System.out.println("");
		
		System.out.println("제조사명 : " + samsung.getCompany());
		System.out.println("모델명 : " + samsung.getModel());
		System.out.println("색상 : " + samsung.getColor());
		System.out.println("최대속도 : " + samsung.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n", samsung.getPrice());
		System.out.println("");

	}

}