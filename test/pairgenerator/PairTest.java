package pairgenerator;

import org.junit.Assert;

import org.junit.Test;

public class PairTest {

	@Test
	public void shouldHaveDriver() {
		//Arrange
		Pair underTest = new Pair();
		//Act
		String driver = underTest.getDriver();
		//Assert
		Assert.assertEquals("student1", driver);
	}
	
	@Test
	public void shouldHaveNavigator() {
		//Arrange
		Pair underTest = new Pair();
		//Act
		String navigator = underTest.getNavigator();
		//Assert
		Assert.assertEquals("student4", navigator);
	}
	

}
