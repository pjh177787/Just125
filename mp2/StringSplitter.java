import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * A class that splits a string on character change boundaries.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>StringSplitterTest.java</code>.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/2/">MP2 Documentation</a>
 */
public class StringSplitter {
	
	public static String[] stringSplitter(String input) {
		List<String> result = new ArrayList<String>();
		if (input == null) return (String[])result.toArray();
		
		int beginIdx = 0;
		int endIdx = 1;
		
		for (int i = 1; i < input.length(); i ++) {
			endIdx = i;
			char ch1 = input.charAt(beginIdx);
			char ch2 = input.charAt(endIdx);
			if (ch1 != ch2) {
				result.add(input.substring(beginIdx, endIdx));

				beginIdx = endIdx;
			}
		}
		result.add(input.substring(beginIdx, input.length()));
		String[] again = new String[result.size()];
		return result.toArray(again);
		
	}

    /* ********************************************************************************************
     * You do not need to modify code below this comment.
     * ********************************************************************************************/

    /**
     * Solicit a string and split it whenever the character changes.
     * <p>
     * You are free to review this function, but should not modify it. Note that this function is
     * not tested by the test suite, as it is purely to aid your own interactive testing.
     *
     * @param unused unused input arguments
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("Enter a string to split: ");
        String input = lineScanner.nextLine();
        System.out.println("This splits into: ");
        System.out.println(Arrays.toString(stringSplitter(input)));
        lineScanner.close();
    }
}
