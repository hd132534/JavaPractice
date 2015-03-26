package org.dimigo.basic;

//<<네번째 실습과제 >>
//
//고속도로 통행료를 계산하여 출력해보기
//
//1. 기본요금 - 고속버스 : 850원, 경차 : 300원, 그 외 : 600원
//2. 10km 초과 시마다 고속버스는 300원씩 추가, 경차와 그 외는 200원씩 추가
//	 예) 고속버스로 10km 주행 : 850원, ~20km 주행 : 1150원, ~30km 주행 : 1450원
//	 	  경차로 10km 주행 : 300원, ~20km 주행 : 550원, ~30km 주행 : 700원

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
