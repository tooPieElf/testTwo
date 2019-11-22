package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
//    ArrayList<Courses> chemistry = new Courses(3,"organic chemistry","Chem 104");
    ArrayList<Courses> ifechiCourses = new ArrayList<>();
    ifechiCourses.add(new Courses(3,"organic chemistry","Chem 104"));

    Lecturer ifechi = new Lecturer("ifechi","Female","Nigerian","12/12/1994","Mrs","1102",ifechiCourses);

    System.out.println(ifechi);




  }
}
