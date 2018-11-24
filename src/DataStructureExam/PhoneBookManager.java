package DataStructureExam;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * 비디오가게 회원정보를 관리하는 역할을 합니다.
 * 
 */

public class PhoneBookManager {

	private Set set; // 회원정보를 보관하는 데이타소스

	/**
	 * 회원정보를 갖고 있는 데이타소스를 구성합니다.
	 */
	public PhoneBookManager(Set set) {
		this.set = set;
	}

	/**
	 * 초기화된 회원정보 데이타소스를 구성합니다.
	 */
	public PhoneBookManager() {
		set = new HashSet();
	}

	/**
	 * 대량의 회원정보를 한꺼번에 추가
	 */
	public void add(Collection c) {
		set.addAll(c);
	}

	/**
	 * 회원정보를 추가합니다.
	 */
	public void add(PhoneBook pb) {
		set.add(pb);
	}

	/**
	 * 회원정보 데이타소스를 구합니다.
	 */
	public Set getPhoneBooks() {
		return set;
	}

	/**
	 * 같은 이름의 회원정보만 구함
	 */
	public Set getPhoneBooksByName(String name) {

		Set s = new HashSet();
		for (Iterator it = set.iterator(); it.hasNext();) {
			PhoneBook pb = (PhoneBook) it.next();
			if (pb.getName().equals(name))
				s.add(pb);
		}
		return s;
	}

	/**
	 * 주소의 일부분이라도 같은 회원정보만 구함
	 */
	public Set getPhoneBooksByAddress(String address) {

		Set s = new HashSet();
		for (Iterator it = set.iterator(); it.hasNext();) {
			PhoneBook pb = (PhoneBook) it.next();
			if (pb.getAddress().indexOf(address) != -1)
				s.add(pb);
		}
		return s;
	}

	/**
	 * 전화번호의 일부가 같은 회원정보만 구함
	 */
	public Set getPhoneBooksByNumber(String number) {

		Set s = new HashSet();
		for (Iterator it = set.iterator(); it.hasNext();) {
			PhoneBook pb = (PhoneBook) it.next();
			if (pb.getNumber().indexOf(number) != -1)
				s.add(pb);
		}
		return s;
	}

	/**
	 * 회원이 몇명인가 알아봅니다.
	 */
	public int getPhoneBooksSize() {
		return set.size();
	}
}
