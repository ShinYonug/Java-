package ArrayList;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {

		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		System.out.println(list1);

		ArrayList list2 = new ArrayList(list1.subList(1, 4));
//		System.out.println(list2);
		print(list1, list2);
	
		Collections.sort(list1);  //list1, list2 를 정렬한다
		Collections.sort(list2);  // Collections.sort(List 1)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2): "+ list1.containsAll(list2));
		
		
		list2.add("B");          //순차적 입력??! 마지막 번째에 B가 추가
		list2.add("C");            // 마지막 번째 C 추가
		list2.add(3, "A");         // 3번째 A추가 뒤에껀 뒤로 밀림
		print(list1, list2);
		
		list2.set(3, "AA");         // 3번째 있는 값을 AA로 덮어 씌운다 뒤에껀 그대로 있음
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) :  "+ list1.retainAll(list2));
		print(list1, list2);
		
		// list2 에서 list1 에 포함된 걕체들을 삭제한다.
		for( int i = list2.size()-1; i>=0 ; i--) {  // i=5부터 시작해서 i-=1
			if(list1.contains(list2.get(i)))        // list1에 list2의 i번째 값이 포함되어 있다면
					list2.remove(i);				// list2 에서 i번째 있는 값을 지워라 ( 즉 중복된다면 삭제)
		}
		print(list1, list2);
		
	}



static void print(ArrayList list1, ArrayList list2) {
	System.out.println("list1:"+list1);
	System.out.println("list2:"+list2);
	System.out.println();
}

}