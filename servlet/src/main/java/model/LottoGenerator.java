package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoGenerator {
	private Random random = new Random();
	
	public Set<Integer> game() {
		Set<Integer> set = new TreeSet<>();
		
		while (set.size() < 6) {
			set.add(random.nextInt(45) + 1);
		}
		return set;
	}
	
	public List<Set<Integer>> lottoList(Integer num) {
		List<Set<Integer>> list = new ArrayList<>();
		
		while (list.size() < num) {
			list.add(game());
		}
		
		return list;
	}
}






