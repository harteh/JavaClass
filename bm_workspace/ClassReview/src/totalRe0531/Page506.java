package totalRe0531;

//p.506,507
class IDFormatException extends Exception {
	public IDFormatException(String message) {
		super(message);
	}
}

public class Page506 {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없다.");
		}
		else if(userID.length()<8 || userID.length() >20 ) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		Page506 test = new Page506();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "12345";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}
}
