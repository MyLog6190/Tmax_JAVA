package ch15.verify.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryItor = entrySet.iterator();
		
		while(entryItor.hasNext()) {
			Entry<String, Integer> entry = entryItor.next();
			int score = entry.getValue();
			totalScore += score;
			if(score > maxScore) {
				maxScore = score;
				name = entry.getKey();
			}
			
		}
		
		System.out.println("name : " + name + "\nmaxScore : " + maxScore + "\ntotalScore : " + totalScore);
	}
}
