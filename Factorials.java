
public class Factorials {

	public static void main(String[] args) {
		int[] inputArray = {3628800, 479001600, 6, 18, 120, 150};
		double[] answerArray = new double[inputArray.length];
		int[] aArray = new int[inputArray.length];
		for (int loop = 0; loop < inputArray.length; loop++) {
			int a = 0;
			double x = inputArray[loop];
			while (x > 1) {
				a++;
				x =x/a;	
			}
			answerArray[loop] = x;
			aArray[loop] = a;
		}
		for (int loop = 0; loop < answerArray.length; loop++) {
			if (answerArray[loop]==1) {
				System.out.println(inputArray[loop] + " = " + aArray[loop] + "!");
			}
			else {
				System.out.println(inputArray[loop] + " NONE");
			}	
		}
		

	}

}
