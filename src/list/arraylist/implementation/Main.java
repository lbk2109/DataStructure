package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		
		//배열의 마직막에 추가하기
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.addLast(50);
		System.out.println(numbers);
		
        //배열의 중간(index=1)에 추가하기
		numbers.add(0, 00);
		numbers.add(1, 11);
		numbers.add(2, 22);
		numbers.add(3, 33);
		System.out.println(numbers);
		
		//배열의 첫번째에 추가하기
		numbers.addLast(50);
		System.out.println(numbers);
		
		//배열의 size알아내기
		System.out.println("size:"+numbers.size());
		
		//인덱스를 이용하여 배역의 값가져오기
		System.out.println(numbers.get(0));
		
		//값을 가지고 있는 인덱스 가져오기
		System.out.println("index:"+numbers.indexOf(14));

	}

}
