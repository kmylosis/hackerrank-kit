package myorg.kmylosis.week2.towerbreakers;

public class TowerBreakers {

  private TowerBreakers() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Reduce tower height in each turn. Initial height should be evenly divided by final height. When a player cannot reduce more, loses.
   *
   * @param n the number of towers
   * @param m the towers' height
   * @return the winner of the game, 1 or 2
   */
  public static int towerBreakers(int n, int m) {
    return m != 1 && n % 2 == 1 ? 1 : 2;
  }
}
