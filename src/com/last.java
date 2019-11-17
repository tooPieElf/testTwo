package com;
import java.lang.reflect.Array;
import java.util.*;
public class last {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int one = scanner.nextInt();
    

    System.out.println(one%2);
  }

  static int find(int[] integers) {
    int k = 0;
    int normal = integers[0] + integers[1];
    if (normal % 2 == 0) {
      for (int i = 2; i < integers.length; i++) {
        if ((normal + i) % 2 != 0) {
          k = i;
        }
      }
    } else {
      if (normal + integers[3] % 2 == 0) {
        return integers[0] % 2 == 0 ? integers[0] : integers[1];

      } else {
        return integers[0] % 2 == 1 ? integers[0] : integers[1];
      }

    }
     return k;
  }
}




