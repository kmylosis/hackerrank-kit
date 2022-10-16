package myorg.kmylosis.week2.sumvsxor;

public class SumXor {

  private SumXor() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Given a long number n, return the x numbers that meet the following criteria. Sum and XOR of i and n should be equal, where i is a number from 0 to n.
   * Nice to know that n^i = n+i if and only if n&i == 0 for n and i binary. Where ^ for XOR and & AND bitwise operation.
   *
   * <h4>Solution: we count all the binary 0's in a number and the answer is 2 power counter.</h4>
   * <p>eg. 5 is 101 in binary, 1 zero found, thus Math.pow(2,1) = 2<br/>
   * <b>5 + 0 = 5<br/>
   * 5 XOR 0 = 101 XOR 000 = 101 = 5</b><br/>
   * 5 + 1 = 6<br/>
   * 5 XOR 1 = 101 XOR 001 = 100 = 4<br/>
   * <b>5 + 2 = 7 <br/>
   * 5 XOR 2 = 101 XOR 010 = 111 = 7</b><br/>
   * 5 + 3 = 8<br/>
   * 5 XOR 3 = 101 XOR 011 = 110 = 6<br/>
   * 5 + 4 = 9<br/>
   * 5 XOR 4 = 101 XOR 100 = 001 = 1<br/>
   * 5 + 5 = 10<br/>
   * 5 XOR 5 = 101 XOR 101 = 000 = 0<br/>
   * </p>
   * </p>
   *
   * @param n     a long number
   * @return      how many values that meet the criteria
   *
   */
  public static long sumXor(long n) {
    long counter = 0;
    while (n > 0) {
      if (n % 2 == 0) {
        counter++;
      }
      n /= 2;
    }
    return (long) Math.pow(2, counter);
  }
}
