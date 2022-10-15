package myorg.kmylosis.week2.caesarcipher;

public class CaesarCipher {

  private CaesarCipher() {
    throw new IllegalStateException("Utility class");
  }

  private static final int UPPER_CASE_START = 65;
  private static final int UPPER_CASE_END = 90;
  private static final int LOWER_CASE_START = 97;
  private static final int LOWER_CASE_END = 122;
  private static final int NUMBER_OF_LETTERS = 26;


  /**
   * <p>Get a string s and shift numberOfRightShifting times into right the letters. If the shifting over-exceeds the alphabet start from the start</p>
   * <h4>It is known that:</h4>
   * <ul>
   *   <li>[A-Z] are the numbers from 65-90 in ASCII</li>
   *   <li>[a-z] are the numbers from 97-122 in ASCII</li>
   * <ul/>
   *
   * @param s                     a sentence with random chars
   * @param numberOfRightShifting the numberOfRightShifting of right shifting
   * @return the altered sentence after shifting
   */
  public static String caesarCipher(String s, int numberOfRightShifting) {
    StringBuilder sb = new StringBuilder();
    int finalNumberOfRightShifting = removeUnnecessaryShifting(numberOfRightShifting);
    s.chars().forEach(ch -> {
      if (Character.isUpperCase(ch)) {
        shiftRightProperly(sb, ch, finalNumberOfRightShifting, UPPER_CASE_START, UPPER_CASE_END);
      } else if (Character.isLowerCase(ch)) {
        shiftRightProperly(sb, ch, finalNumberOfRightShifting, LOWER_CASE_START, LOWER_CASE_END);
      } else {
        sb.append(Character.toString(ch));
      }
    });
    return sb.toString();
  }

  private static int removeUnnecessaryShifting(int numberOfRightShifting) {
    if (numberOfRightShifting > NUMBER_OF_LETTERS) {
      return numberOfRightShifting % NUMBER_OF_LETTERS != 0 ? numberOfRightShifting % NUMBER_OF_LETTERS : NUMBER_OF_LETTERS;
    }
    return numberOfRightShifting;
  }

  private static void shiftRightProperly(StringBuilder sb, int ch, int numberOfRightShifting, int startCharInt, int endCharInt) {
    int diff = endCharInt - (ch + numberOfRightShifting);
    if (diff < 0) {
      sb.append(Character.toString(startCharInt + Math.abs(diff) - 1));
    } else {
      sb.append(Character.toString(ch + numberOfRightShifting));
    }
  }

}
