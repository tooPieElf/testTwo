package com;

import java.util.ArrayList;

public class Student  extends Person implements Level,Info{
  private ArrayList<Courses> courses;
  private String matricNo;





  public Student(String name, String gender, String nationality, String dateOfBirth,
      ArrayList<Courses> courses, String matricNo) {
    super(name, gender, nationality, dateOfBirth);
    this.courses = courses;
    this.matricNo = matricNo;
  }

  public void setCourses(ArrayList<Courses> courses) {
    this.courses = courses;
  }

  public void setMatricNo(String matricNo) {
    this.matricNo = matricNo;
  }

  public ArrayList<Courses> getCourses() {
    return courses;
  }

  public String getMatricNo() {
    return this.matricNo;
  }


  @Override
  public void bio() {
    System.out.println("name");
  }

  @Override
  public void details() {

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
