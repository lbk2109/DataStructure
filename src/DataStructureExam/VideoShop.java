package DataStructureExam;

import java.util.Collection;
import java.util.Iterator;

public class VideoShop {
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		manager.add(new PhoneBook("02-555-5555", "서울 길빌딩 11층", "홍길동"));
		manager.add(new PhoneBook("031-525-5555", "인천 성빌딩 12층", "성춘향"));
		manager.add(new PhoneBook("051-525-5555", "부산 부빌딩 5층", "홍길돈"));
		manager.add(new PhoneBook("053-743-3333", "대구 대구백화점", "왕판매"));
		manager.add(new PhoneBook("015-9244-9874", "서울 성신여대", "조현남"));

		System.out.println("조현남을 이름으로 찾습니다.");
		Collection c = manager.getPhoneBooksByName("조현남");
		if (c.size() > 0) {
			for (Iterator it = c.iterator(); it.hasNext();) {
				PhoneBook pb = (PhoneBook) it.next();
				System.out.println(pb);
			}
		} else {
			System.out.println("조현남은 없습니다.");
		}
		System.out.println("---------------------------");
		System.out.println();

		System.out.println("서울을 주소로 찾습니다.");
		c = manager.getPhoneBooksByAddress("서울");
		if (c.size() > 0) {
			for (Iterator it = c.iterator(); it.hasNext();) {
				PhoneBook pb = (PhoneBook) it.next();
				System.out.println(pb);
			}
		} else {
			System.out.println("서울은 없습니다.");
		}
		System.out.println("---------------------------");
		System.out.println();

		System.out.println("5555를 전화번호로 찾습니다.");
		c = manager.getPhoneBooksByNumber("5555");
		if (c.size() > 0) {
			for (Iterator it = c.iterator(); it.hasNext();) {
				PhoneBook pb = (PhoneBook) it.next();
				System.out.println(pb);
			}
		} else {
			System.out.println("5555는 없습니다.");
		}
		System.out.println("---------------------------");
		System.out.println();
	}
}
