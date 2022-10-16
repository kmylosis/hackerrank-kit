package myorg.kmylosis.week2.zigzagsequence;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {

  /**
   * Zig Zag arrays are the ones that have the first half increasing and the second one decreasing. Eg {1,2,3,7,6,5,4}<br/>
   * Goal was to debug code and make some fixes to make the function findZigZagSequence work.
   *
   * @param args main args
   */
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int testCases = kb.nextInt();
    for (int cs = 1; cs <= testCases; cs++) {
      int n = kb.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = kb.nextInt();
      }
      findZigZagSequence(a, n);
    }
  }

  public static void findZigZagSequence(int[] a, int n) {
    Arrays.sort(a);
    //changed from int mid = (n + 1) / 2;
    int mid = ((n + 1) / 2) - 1;
    int temp = a[mid];
    a[mid] = a[n - 1];
    a[n - 1] = temp;

    int st = mid + 1;
    //changed from int ed = n - 1
    int ed = n - 2;
    while (st <= ed) {
      temp = a[st];
      a[st] = a[ed];
      a[ed] = temp;
      st = st + 1;
      //changed from ed = ed + 1;
      ed = ed - 1;
    }
    for (int i = 0; i < n; i++) {
      if (i > 0) {
        System.out.print(" ");
      }
      System.out.print(a[i]);
    }
    System.out.println();
  }

}
