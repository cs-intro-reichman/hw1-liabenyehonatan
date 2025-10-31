// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int currentValue = Integer.parseInt(args[0]);
		double annualRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double futureValue = currentValue * (Math.pow((1 + annualRate / 100), years));

		System.out.println("After " + years + " years, $" + currentValue +
				" saved at " + annualRate + "% will yield $" + (int) futureValue);

	}
}