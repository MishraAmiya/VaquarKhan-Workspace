import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		int[] input1 = { 12, 11, 5, 2, 7, 5, -99};

		int[] input2 = { 5, 12, 5, 7, 11, 2, 11 };

		System.out.println(partiescompare(input1, input2));
		
	}

	public static String partiescompare(int[] input1, int[] input2) {
		String output="";
		List<Integer> partyA = addList(input1);
		List<Integer> partyB = addList(input2);

		if (isOutputInvalid(partyA) || isOutputInvalid(partyB)) {
			System.out.println("Invalid");
			output="Invalid";
			System.exit(0);
		}

		if (isOutputEqual(partyA, partyB)) {
			output="Equal";
		
		} else {
			output="UnEqual";
		}
		return output;
	}

	private static List<Integer> addList(int[] input) {

		List<Integer> returnList = new ArrayList<Integer>();

		for (int index = 0; index < input.length; index++) {
			returnList.add(input[index]);
		}
		return returnList;
	}

	private static boolean isOutputInvalid(List<Integer> inputList) {
		boolean isOutputInvalid = false;

		for (int result : inputList) {
			if (result < 0) {
				isOutputInvalid = true;
			} else {
				isOutputInvalid = false;
			}
		}
		return isOutputInvalid;
	}

	private static boolean isOutputEqual(List<Integer> inputList1,
			List<Integer> inputList2) {
		boolean isOutputEqual = true;
		List<Boolean> inputList3 = new ArrayList<Boolean>();
		//
		sortList(inputList1);
		sortList(inputList2);

		for (int number : inputList1) {
			inputList3.add(inputList2.contains(number) ? true : false);
		}

		if (inputList3.contains(false)) {
			isOutputEqual = false;
		}
		return isOutputEqual;
	}

	private static void sortList(List<Integer> list) {
		Collections.sort(list);
	}
}
