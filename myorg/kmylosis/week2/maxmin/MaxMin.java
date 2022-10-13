package myorg.kmylosis.week2.maxmin;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MaxMin {

  private MaxMin() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * A list of positive integers arr is given and a single integer k. You must create an array of length k from elements of arr such that its unfairness is
   * minimized. Call that array arr'. Unfairness of an array is calculated as max(arr') - min(arr')
   *
   * @param k   single integer
   * @param arr array of integers
   * @return the minimum possible unfairness of the new array arr' max(arr') - min(arr')
   */
  public static int maxMin(int k, List<Integer> arr) {

    var ref = new Object() {
      int minReference = Integer.MAX_VALUE;
    };

    Collections.sort(arr);

    IntStream.range(0, arr.size() - k + 1).forEach(num -> ref.minReference = Math.min(ref.minReference, (arr.get(num + (k - 1)) - arr.get(num))));

    return ref.minReference;
  }

}
