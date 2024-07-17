package Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// getMeasureSet(int num) : Set<Integer> { 정수를 전달받아, 약수를 원소로 가지는 집합 반환 }

// getRange(int start, int end, int step) : Set<Integer> {
// 		시작값, 끝값 범위의 정수 집합 반환
//		(이 때, 값의 증가는 step만큼 증가한다.)
//		(해당 범위에 값이 없는 경우 null 값 대신 크기가 0인 Set을 반환한다)
// }

// getHashCodes(Collection<String> strs) : Collection<Integer> {
//		각 원소 문자열의 HashCode값을 동일한 size의 컬렉션으로 반환 
// }

// getDistictList(List<Integer> list, Comparator<Integer> comparator) : List<Integer> {
//		정수 목록에서 중복이 없고, Comparator 기준에 따라 정렬된 목록을 반환
// }
// 

//topKFrequent(List<String> list, int k) : List<String> {
//리스트에서 가장 빈번하게 등장하는 요소를 k개 만큼 반환
//}

// List<List<String>> 생성해보기
// List<Set<String>> 생성해보기
// Set<List<String>> 생성해보기
// Set<Set<String>> 생성해보기

// ---

// Set

public class Q1 {
	Scanner sc = new Scanner(System.in);

	public Set getMeasureSet(int num) {
		Set<Integer> set = new LinkedHashSet<>();
		try {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					set.add(i);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return set;

	}

//		시작값, 끝값 범위의 정수 집합 반환
//	(이 때, 값의 증가는 step만큼 증가한다.)
//	(해당 범위에 값이 없는 경우 null 값 대신 크기가 0인 Set을 반환한다)
	public Set getRange(int start, int end, int step) {
		Set<Integer> set = new LinkedHashSet<>();
		try {

			if (step > end - start || start == end || start > end)
				return set;
			else {
				for (int i = start; i <= end; i += step) {
					set.add(i);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return set;
	}

//	각 원소 문자열의 HashCode값을 동일한 size의 컬렉션으로 반환 

	public Collection getHashCodes(Collection<String> strs) {
//		int size = strs.size();
//		int col = strs.hashCode();

		Collection<String> collection = strs;

		System.out.println(strs.hashCode());
		System.out.println(collection.hashCode());

		return collection;
	}

	public Set getDistictList(List<Integer> list, Comparator<Integer> comparator) {
//		정수 목록에서 중복이 없고, Comparator 기준에 따라 정렬된 목록을 반환
		Set<Integer> set = new LinkedHashSet<>();
		list.sort(comparator);
		set.addAll(list);

		return set;

	}

	public void topKFrequent(List<String> list, int k) {

		List<String> arrList = new ArrayList<>();
		List<Integer> arrIntList = new ArrayList<>();
		List<Integer> arrListIntResult = new ArrayList<>();
		int i = 0;
		int countString = 0;

		while (list.size() > 0) {
			String check = list.get(0);
			arrList.add(check);
			countString = 0;
			while (list.contains(check)) {
				list.remove(check);
				countString++;
			}
			arrIntList.add(countString);
			i++;
		}

		for (int j = 0; j < arrIntList.size(); j++) {
			int max = arrIntList.get(j);
			int index = j;
			for (int t = 0; t < arrIntList.size(); t++) {
				if (max < arrIntList.get(t)) {
					max = arrIntList.get(t);
					index = t;
				}
			}
			arrListIntResult.add(index);
			arrIntList.set(index, 0);
		}

		// System.out.println(arrIntList);
//		System.out.println(arrList);
		if(k<=arrIntList.size()) {
			for (int s = 0; s < k; s++) {
				System.out.print(arrList.get(arrListIntResult.get(s)) + " ");
			}	
		}else {
			for (int s = 0; s < arrIntList.size(); s++) {
				System.out.print(arrList.get(arrListIntResult.get(s)) + " ");
			}	
		}
		
	}

	public static void main(String[] args) {
		Q1 q = new Q1();
		System.out.println(q.getMeasureSet(10));
		System.out.println(q.getRange(3, 13, 4));

		List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 1, 3, 7, 5, 1, 3));
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
		System.out.println(q.getDistictList(list, comparator));

		List<String> stringList = new ArrayList<>(
				Arrays.asList("D", "A", "B", "C", "C", "C", "A", "B", "A", "C", "B", "D", "A"));
		q.topKFrequent(stringList, 5);
	}

}
