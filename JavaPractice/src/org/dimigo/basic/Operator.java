package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int saa = 9, sab = 10;
		double sah = 5.8;
		int punga = 9;
		double pungh = 5.4;
		double sa =  (saa + sab) * sah *0.5;
		double pung = (punga * pungh);
		
		System.out.println("<< 도형 너비 비교 >>");
		System.out.printf("사다리꼴 넓이 : %.1f\n", sa);
		System.out.printf("평행사변형 넓이 %.1f\n", pung);
		System.out.printf("\n\n");
		
		if (sa > pung) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (sa - pung) + " 더 큽니다!");
		} else if (sa == pung) {
			System.out.println("두 도형의 넓이가 같습니다!");
		} else {
			System.out.println("평행사변형이 사다리꼴 보다 " + (pung - sa) + " 더 큽니다!");			
		}
	}

}
