package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String car = "고속버스";
		int km = 10;
		int fee = 0, add = 0, plus = 0;
		
		if(car == "고속버스") {
			fee = 850;
			if (km % 10 == 0) {
				add = (km/10-1) * 300;
			} else {
				add = (km/10) * 300;
			}
			} else if (car == "경차") {
			fee = 300;
			if (km % 10 == 0) {
				add = (km/10-1) * 200;
			} else {
				add = (km/10) * 200;
			}
		} else {
			fee = 600;
			if (km % 10 == 0) {
				add = (km/10-1) * 200;
			} else {
				add = (km/10) * 200;
			}
		}
		plus = fee + add;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + km + "km");
		System.out.println("차량 : " + car);
		System.out.println("통행료 : " + plus + "원");
	}

}
