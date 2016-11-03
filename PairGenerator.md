# Pair Generator

It is common, as we've done in class, to frequently switch pair partners and see that everyone on a team has the opportunity to pair with everyone else.

Choose six students from your class, and pair every third student (1st and 4th, 2nd and 5th, 3rd and 6th). For example:

Input | Output
----- | ------
Adam, Bart, Candy, Darla, Eduardo, Frank | (Adam, Darla), (Bart, Eduardo), (Candy, Frank)

Specifically:

* create a class called Pair that implements the following methods:

```java
public String getDriver() {
	// implementation
}
public String getNavigator() {
	// implementation
}
```

* create a class that generates pair partners, which should implement the following method:

```java
public Collection<Pair> generate() {
	// implementation
}
```

## Extension

Randomly choose pairs without assigning any students to more than one pair. (Hint: To create a random number from *0* to *n-1*, use the `nextInt(int)` method of `java.util.Random`.)
