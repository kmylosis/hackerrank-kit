package myorg.kmylosis.week2;

public class Sum {

  private int leftSum;
  private int rightSum;
  public Sum(int leftSum, int rightSum) {
    this.leftSum = leftSum;
    this.rightSum = rightSum;
  }

  public int getLeftSum() {
    return leftSum;
  }

  public void setLeftSum(int leftSum) {
    this.leftSum = leftSum;
  }

  public int getRightSum() {
    return rightSum;
  }

  public void setRightSum(int rightSum) {
    this.rightSum = rightSum;
  }
}
