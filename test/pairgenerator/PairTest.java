package pairgenerator;

import org.junit.Assert;

import org.junit.Test;

public class PairTest {
	
	@Test
	public void shouldBeEqualOrSomething() {
		Pair underTest = new Pair("driver", "navigator");
		Pair anotherPair = new Pair("driver", "navigator");
		Assert.assertEquals(underTest, anotherPair);
	}

	@Test
	public void shouldNotBeEqualIfDifferentDriver() {
		Pair underTest = new Pair("driver", "navigator");
		Pair anotherPair = new Pair("driver2", "navigator");
		Assert.assertNotEquals(underTest, anotherPair);
	}
	
	@Test
	public void shouldNotBeEqualIfDifferentNavigator() {
		Pair underTest = new Pair("driver", "navigator");
		Pair anotherPair = new Pair("driver", "navigator2");
		Assert.assertNotEquals(underTest, anotherPair);
	}
}
