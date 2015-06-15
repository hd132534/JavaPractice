package org.dimigo.oop;

public class PiggyBank {
	private static int balance = 0;
	
	public static void putMoney(FamailyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName() + " " + amount + "을 넣음");
	}
	
	public static void printBalance() {
		System.out.println();
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
		System.out.println();
	}
	
}
