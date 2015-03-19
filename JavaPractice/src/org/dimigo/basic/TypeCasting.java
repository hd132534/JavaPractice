package org.dimigo.basic;

/* ***********************************
 *   << 두번째 수행평가 >>
 *  내용 : 디미베네
 *  작성일 : 2015.03.16
 *************************************/

public class TypeCasting {

	public static void main(String[] args) {
		long m = 1700000;
		int e = 3;
		int s = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n", m);
		System.out.printf("점포 내 직원 수 : %,d명\n", e);
		System.out.printf("점포 수 : %,d개\n" , s);
		System.out.printf("\n\n");
		System.out.printf("연간 인건비 : %,d", m * 12 * e * s);
	}

}
