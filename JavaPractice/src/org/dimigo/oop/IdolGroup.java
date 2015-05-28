package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		String[] idolGroup = {"빅뱅", "빅스", "씨스타"};
		String[][] member = {
				{"지디", "탑", "승리", "대성", "태양"},
				{"엔", "라비", "켄", "혁", "레오", "홍빈"},
				{"보라", "효린", "다솜", "소유"}
		};
		
		for(int i=0; i<idolGroup.length; i++) {
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			for(int j=0; j<member[i].length; j++) {
				System.out.println(member[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
