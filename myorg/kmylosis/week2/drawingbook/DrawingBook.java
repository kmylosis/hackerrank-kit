package myorg.kmylosis.week2.drawingbook;

public class DrawingBook {

  private DrawingBook() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * The number of pages that have to be turned in order to reach p. Book has even numbers in the first page and odd in the second.
   * <h4>eg</h4>
   * <ul>
   *   <li>1 ,2,3, 4,5, 6,7, 8,9</li>
   *   <li>1 ,2,3, 4,5, 6,7, 8,9, 10</li>
   * </ul>
   *
   * @param n number of pages
   * @param p page
   * @return the number of page turns
   */
  public static int pageCount(int n, int p) {
    if (isFirstOrLastPage(n, p)) {
      return 0;
    }
    if (isPenultimatePage(n, p)) {
      return 1;
    }
    if (p <= n / 2) {
      return p / 2;
    }
    int page = 0;
    for (int i = n; i > p; i--) {
      page++;
    }
    return page / 2;
  }

  private static boolean isFirstOrLastPage(int n, int p) {
    return p == 1 || p == n;
  }

  private static boolean isPenultimatePage(int n, int p) {
    return n % 2 == 0 && n - 1 == p;
  }

}
