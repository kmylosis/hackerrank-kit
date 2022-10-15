package myorg.kmylosis;

import java.util.Arrays;
import java.util.List;
import myorg.kmylosis.week2.drawingbook.DrawingBook;
import myorg.kmylosis.week2.maxmin.MaxMin;
import myorg.kmylosis.week2.shelockandarray.SherlockAndArray;

public class Main {

  public static void main(String[] args) {
    String hasBalancedSums = SherlockAndArray.balancedSums(List.of(5, 6, 8, 11));
    System.out.println("SherlockAndArray has balanced sums: " + hasBalancedSums);
    int unfairDifference = MaxMin.maxMin(3, Arrays.asList(10, 100, 300, 200, 1000, 20, 30));
    System.out.println("MaxMin unfair difference: " + unfairDifference);
    int pagesTurned = DrawingBook.pageCount(9, 6);
    System.out.println("Page turned to reach p: " + pagesTurned);
  }

}
