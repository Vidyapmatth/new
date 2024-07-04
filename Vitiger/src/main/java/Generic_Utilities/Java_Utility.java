package Generic_Utilities;

import java.util.Random;

public class Java_Utility {
/**
 * it is used to generate random number within the range 1 to 1000
 * @return
 * @author Vidya
 */
	public int getRandomNumber() {
		Random ranNum = new Random();
		int ranNumber = ranNum.nextInt(1000);
		return ranNumber;
	}
}
