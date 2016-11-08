package pairgenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PairGenerator {

	private String[] students;

	public PairGenerator(String[] students) {
		this.students = students;
	}

	public Collection<Pair> generate() {
		return generateFrom(students);
	}

	private Collection<Pair> generateFrom(String[] source) {
		Collection<Pair> pairs = new ArrayList<Pair>();

		int numberOfPairs = source.length / 2;
		for (int i = 0; i < numberOfPairs; i++) {
			Pair pair = new Pair(source[i], source[i + numberOfPairs]);
			pairs.add(pair);
		}

		return pairs;
	}

	public Collection<Pair> generateShuffle() {

		String[] shuffledArray = shuffleStudents();

		return generateFrom(shuffledArray);
	}

	private String[] shuffleStudents() {
		List<String> shuffledList = Arrays.asList(students);
		Collections.shuffle(shuffledList);
		String[] shuffledArray = new String[students.length];
		shuffledList.toArray(shuffledArray);
		return shuffledArray;
	}

}
