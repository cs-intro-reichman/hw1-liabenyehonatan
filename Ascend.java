// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 100) + 1;
		int num2 = (int) (Math.random() * 100) + 1;
		int num3 = (int) (Math.random() * 100) + 1;

		int smallestOutOf2 = Math.min(num1, num2);
		int smallestNum = Math.min(smallestOutOf2, num3);
		int bigger = Math.max(num1, num2);
		int biggestNum = Math.max(bigger, num3);

		int middleNum = num1 + num2 + num3 - smallestNum - biggestNum;

		System.out.println(smallestNum + " " + middleNum + " " + biggestNum);

	}
}
