package learning;

public class AssignmentTwo {

	public int desceningOrder(int num) {
		if (num<0) return num;
	    int sortedNumber = 0;
	    for (int i = 9; i >= 0; i--) {
	        int tmpNumber = num;
	        while (tmpNumber > 0) {
	            int digit = tmpNumber % 10;
	            if (digit == i) {
	            	sortedNumber *= 10;
	                sortedNumber += digit;
	            }
	            tmpNumber /= 10;
	        }
	    }
	    return sortedNumber;
	}
}
