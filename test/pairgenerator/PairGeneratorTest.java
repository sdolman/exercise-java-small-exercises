package pairgenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class PairGeneratorTest {

	@Test
	public void shouldGenerateEmptyPairsFromZeroStudents() {
		String[] zeroStudents = new String[] {};
		PairGenerator underTest = new PairGenerator(zeroStudents);

		Collection<Pair> result = underTest.generate();

		Assert.assertTrue(result.isEmpty());
	}

	@Test
	public void shouldGenerateSinglePairFromTwoStudents() {
		String[] twoStudents = new String[] { "Kierra", "Seth" };
		PairGenerator underTest = new PairGenerator(twoStudents);

		Collection<Pair> result = underTest.generate();
		Pair first = result.iterator().next();
		Pair expected = new Pair("Kierra", "Seth");

		Assert.assertEquals(expected, first);
	}

	@Test
	public void shouldGenerateTwoPairsFromFourStudents() {
		String[] fourStudents = new String[] { "Kierra", "Seth", "Matthew", "Jed"};
		PairGenerator underTest = new PairGenerator(fourStudents);

		Collection<Pair> result = underTest.generate();
		
		Collection<Pair> expected = new ArrayList<Pair>();
		expected.add(new Pair("Kierra", "Matthew"));
		expected.add(new Pair("Seth", "Jed"));

		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void shouldNEEDTESTHERE() {
		String[] fourStudents = new String[] { "Kierra", "Seth", "Matthew", "Jed"};
		PairGenerator underTest = new PairGenerator(fourStudents);

		Collection<Pair> result = underTest.generateShuffle();
		
		Collection<Pair> expected = new ArrayList<Pair>();
		expected.add(new Pair("Kierra", "Matthew"));
		expected.add(new Pair("Seth", "Jed"));

		Assert.assertEquals(expected, result);
	}
}
