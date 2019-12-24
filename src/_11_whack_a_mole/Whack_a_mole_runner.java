package _11_whack_a_mole;

import java.util.Random;

public class Whack_a_mole_runner {
public static void main(String[] args) {
	Whack_a_mole runner = new Whack_a_mole();
	Random rand = new Random();
	int x = rand.nextInt(24);
	runner.drawButtons(x);
}
}
