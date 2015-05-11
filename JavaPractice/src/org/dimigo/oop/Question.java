package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 색깔은?");
		String answer = scanner.nextLine();
		if("검정색".equals(answer)) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}
		System.out.println("");
		
		System.out.println("가장 좋아하는 아이스크림은?");
		String answer2 = scanner.nextLine();
		if("녹차마루".equals(answer2)) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}
		System.out.println("");
		
		System.out.println("가장 좋아하는 걸그룹은?");
		String answer3 = scanner.nextLine();
		if("레드벨벳".equals(answer3)) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}
		System.out.println("");
	}

}
