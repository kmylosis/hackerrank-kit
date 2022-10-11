package myorg.kmylosis.week2;

import java.util.List;
import java.util.stream.IntStream;

public class SherlockAndArray {

  private SherlockAndArray() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.
   *
   * @param arr {@code List} list of integers
   * @return If there is an element that meets the criterion, return YES. Otherwise, return NO.
   */
  public static String balancedSums(List<Integer> arr) {
    if (arr == null) {
      return "NO";
    }
    var ref = new Sum(0, arr.stream().reduce(0, Integer::sum));
    return IntStream.range(0, arr.size()).anyMatch(idx -> hasBalancedSums(arr, ref, idx)) ? "YES" : "NO";
  }

  private static boolean hasBalancedSums(List<Integer> arr, Sum ref, int idx) {
    ref.setRightSum(ref.getRightSum() - arr.get(idx));
    if ( ref.getLeftSum() == ref.getRightSum()) {
      return true;
    }
    ref.setLeftSum(ref.getLeftSum() + arr.get(idx));
    return false;
  }

}
