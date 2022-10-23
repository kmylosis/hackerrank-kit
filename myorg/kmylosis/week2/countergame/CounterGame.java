package myorg.kmylosis.week2.countergame;

import java.math.BigInteger;

public class CounterGame {

  private CounterGame() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * We got two players Louise and Richard. They pick a number and check to see if it is a power of 2. If it is, they divide it by 2. If not, they reduce it by
   * the next lower number which is a power of 2. Whoever reduces the number to 1 wins the game. Louise always starts.
   *
   * <p>testBit(int n): check if a number is set (meaning has 1)</p>
   * <p>bitCount(int n): check how many 1 exist in a binary number</p>
   *
   * @param n a long number
   * @return "Louise" or "Richard"
   */
  public static String counterGame(long n) {
    BigInteger counter = new BigInteger(String.valueOf(n));
    int bits = counter.bitLength();
    int moves = -1;
    for (int i = 0; i < bits; ++i) {
      if (!counter.testBit(i)) {
        ++moves;
      } else {
        moves += counter.bitCount();
        break;
      }
    }

    return moves % 2 == 0 ? "Richard" : "Louise";
  }

}
