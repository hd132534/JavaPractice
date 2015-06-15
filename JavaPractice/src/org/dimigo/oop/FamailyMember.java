package org.dimigo.oop;

public class FamailyMember {
	private static int memberCnt = 0;
	private String memberName;
	
	public FamailyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
		System.out.println();
	}
	
}
