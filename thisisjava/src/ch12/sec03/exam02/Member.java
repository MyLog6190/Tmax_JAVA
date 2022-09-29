package ch12.sec03.exam02;

import java.util.Objects;

public class Member {
	int no;
	public String name;
	public Member(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}

	
}

