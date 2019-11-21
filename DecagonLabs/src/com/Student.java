package com;

import java.util.ArrayList;

public class Student  extends Person implements Level,Info{
  ArrayList<Courses> courses;
  String MatricNo;





  public Student(String name, String gender, String nationality, String dateOfBirth,
      ArrayList<Courses> courses, String matricNo) {
    super(name, gender, nationality, dateOfBirth);
    this.courses = courses;
    MatricNo = matricNo;
  }

  public void setCourses(ArrayList<Courses> courses) {
    this.courses = courses;
  }

  public void setMatricNo(String matricNo) {
    MatricNo = matricNo;
  }

  public ArrayList<Courses> getCourses() {
    return courses;
  }

  public String getMatricNo() {
    return MatricNo;
  }


  @Override
  public void bio() {
    System.out.println("name");
  }

  @Override
  public String details() {
    return null;
  }

  @Override
  public Long salary() {
    return null;
  }

  @Override
  public Long schoolFees() {
    return null;
  }

  @Override
  public int level() {
    return 0;
  }
}
