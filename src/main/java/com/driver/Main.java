package com.driver;

import java.util.Scanner;

public class Main {
  public static void main(String args[])
  {
      RWOnly obj=new RWOnly();
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      obj.setName(name);
      System.out.println(obj.getName());
  }
}