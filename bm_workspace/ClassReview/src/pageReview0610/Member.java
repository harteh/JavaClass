package pageReview0610;

//p.407
public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName+"  "+memberId;
	}
	
	//p.427
	@Override
	public int hashCode() {
		return memberId;	
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		if(this.memberId == member.memberId) {
			return true;
		}
		else {
			return false;
		}
	}
}
