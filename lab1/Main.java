//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println("Increment on 1: " + lab.increment(1));

    int[] labArray = {5, 9, 3, 12, 7, 3, 11, 5};
    
    int i = 0;
    while (i < labArray.length) {
      System.out.println(labArray[i]);
      i++;
    }

    for (i = labArray.length - 1; i >= 0; i--) {
      System.out.println(labArray[i]);
    }

    System.out.println("First: " + labArray[0]);
    System.out.println("Last: " + labArray[labArray.length - 1]);

    System.out.println("Max of 2 and 5: " + lab.max(2, 5));
    System.out.println("Min of 2 and 5: " + lab.min(2, 5));
    System.out.println("Sum of lab array: " + lab.sum(labArray));
    System.out.println("Average of lab array: " + lab.average(labArray));
    System.out.println("Max of lab array: " + lab.max(labArray));
    System.out.println("Min of lab array: " + lab.min(labArray));


    
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a > b) {
      return b;
    } else {
      return a;
    }
  }

  public int sum(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total = total + num;
    }
    return total;
  }

  public double average(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total = total + num;
    }
    double length = nums.length;
    return total / length;
  }

  public int max(int[] nums) {
    int maxNumber = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > maxNumber) {
        maxNumber = nums[i];
      }
    }
    return maxNumber;
  }

  public int min(int[] nums) {
    int minNumber = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < minNumber) {
        minNumber = nums[i];
      }
    }
    return minNumber;
  }
}