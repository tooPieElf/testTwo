package com;
import java.util.*;
public class projectOne {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a string");
    String letter = scanner.next().toLowerCase();
    System.out.println("enter an int");
    int key = scanner.nextInt();
    for(int i=0;i<letter.length(); i++){
      char c = letter.charAt(i);
      System.out.println(c);
      int k = (int)c+key-96;
      System.out.println("the value of k is "+ k);
      int ans = k%26;
      System.out.println(ans);





    }
  }
  }

