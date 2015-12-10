package week1lesson3;

public class PairOfDice {

	public int die1; // Number showing on the first die.
	public int die2; // Number showing on the second die.

	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values. Call the roll() method to roll the dice.
	}

	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that
		// are initially showing the values val1 and val2.
		this.die1 = val1;
		this.die2 = val2;
	}

	public void roll() {
		// Roll the dice by setting each of the dice (die1, die2) to be
		// a random number between 1 and 6.
	}
}
