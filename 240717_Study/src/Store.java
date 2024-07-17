import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

class Can {
	private String name;
	private int lotNumber;
	public Can(String name, int lotNumber) {
		super();
		this.name = name;
		this.lotNumber = lotNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLotNumber() {
		return lotNumber;
	}
	public void setLotNumber(int lotNumber) {
		this.lotNumber = lotNumber;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(lotNumber, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Can))
			return false;
		Can other = (Can) obj;
		return lotNumber == other.lotNumber && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Can [name=" + name + ", lotNumber=" + lotNumber + "]";
	}
}

public class Store {
	public static void main(String[] args) {
		Can c1 = new Can("콜라", 5);
		
		Can c2 = new Can("콜라", 2);
		Can c4 = new Can("콜라", 2);
		
		Can c3 = new Can("사이다", 6);
		Can c5 = new Can("환타", 4);
		//이 객체가 생성될때 이 객체를 나타낼 수 있는 고유코드 -> int값으로 변환해서 정수로 들고 있어
		
		List<Can> list = new LinkedList<>(Arrays.asList(c1, c2, c3, c4, c5));
		
		list.sort(new Comparator<Can>() {
			@Override
			public int compare(Can o1, Can o2) {
				return o1.getLotNumber() - o2.getLotNumber();
			}
		});
		
//		while(list.size()>0) {
//			System.out.println(list.remove(0));
//		}
		Queue<Can> queue = (Queue<Can>)list;
		while(queue.size()>0) {
			System.out.println(queue.poll());
		}
		
		System.out.println(list);
	}
}



