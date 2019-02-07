package edu.cnm.deepdive;

public class McNugget {

  private static final int[] PACK_SIZES = {20, 9 , 6};

  public static boolean test(int value) {
    if (value < 0)  {
      return false;
    }
    if (value == 0)  {
      return true;
    }
    for (int size : PACK_SIZES) {
      if (test(value - size)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(test(43));
  }

}