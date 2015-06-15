package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		
		FamailyMember father = new FamailyMember("아빠");
		FamailyMember mother = new FamailyMember("엄마");
		FamailyMember me = new FamailyMember("나");
		FamailyMember brother = new FamailyMember("남동생");
		
		FamailyMember.printMemberCnt();
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mother, 5000);
		PiggyBank.putMoney(me, 2000);
		PiggyBank.putMoney(brother, 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(me, 1000);
		PiggyBank.printBalance();
	}

}