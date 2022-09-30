package ch12.verify.exam06;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue", "이파리");
		System.out.println(member);
	}
}

class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name ;
	}
	
	
}