import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Rank implements Comparable<Rank> {
	String name;
	int score;

	public Rank(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getScore() {
		return score;
	}

	void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Rank o) {
		// TODO Auto-generated method stub
		return o.score - this.score;
	}

	@Override
	public String toString() {
		return "Rank [name=" + name + ", score=" + score + "]";
	}

}

public class TestRank {
	public static void main(String[] args) {

		List<Rank> rank = new ArrayList<>();
		rank.add(new Rank("길동", 100));
		rank.add(new Rank("둘리", 90));
		rank.add(new Rank("도우너", 95));
		rank.add(new Rank("희동", 80));
		rank.add(new Rank("톰", 90));
		rank.add(new Rank("브래드", 90));

		Collections.sort(rank);
		//System.out.println(rank);
		
	
		int count = 0;
		for (int i = 0; i < rank.size(); i++) {
			
			if (i > 0 && rank.get(i).getScore() == rank.get(i - 1).getScore()) {
				System.out.println((i - count) + "등" + rank.get(i));
				count++;
			} else {
				System.out.println((i + 1) + "등" + rank.get(i));
				count = 0;
			}
		}

	}
}
