import java.util.Arrays;
import java.util.Scanner;

public class TimesTable {
	
	public static int[][] generateTimesTable(int first, int second) {
		int[][] result = new int[second - first + 2][second - first + 2];
		result[0][0] = 0;
		for (int i = 1; i < second - first + 2; i ++) {
			result[0][i] = i + first - 1;
			result[i][0] = i + first - 1;
			for (int j = 1; j < second - first + 2; j++) {
				result[i][j] = (i + first - 1)*(j + first - 1);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        String input1 = lineScanner.nextLine();
        System.out.println("Enter the second number: ");
        String input2 = lineScanner.nextLine();
        int first = Integer.parseInt(input1);
        int second = Integer.parseInt(input2);
        System.out.println(Arrays.deepToString(generateTimesTable(first, second)));
        lineScanner.close();
	}

}
