package DataStructureExam;

/**
 * 
 * 비디오가게 회원 정보입니다.
 * 
 * 전화번호,회원주소,회원이름의 정보를 갖고 있습니다.
 * 
 */

public class PhoneBook {
	private String number;
	private String address;
	private String name;

	public PhoneBook(String number, String address, String name) {
		this.number = number;
		this.address = address;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	/**
	 * 
	 * 이름과 전화번호가 같으면 같은 회원입니다.
	 * 
	 */
	public boolean equals(Object o) {
		if (o instanceof PhoneBook) {
			PhoneBook pb = (PhoneBook) o;
			if (number.equals(pb.getNumber()) && name.equals(pb.getName()))
				return true;
			else
				return false;
		} else
			return false;
	}

	/**
	 * 
	 * 디버깅을 편하게 할 수 있도록 toString()메소드를 오버라이딩합니다.
	 * 
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("전화번호:").append(number).append(" , ");
		sb.append("주소:").append(address).append(" , ");
		sb.append("이름:").append(name);
		return sb.toString();
	}
}
