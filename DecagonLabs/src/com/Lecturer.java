package com;
import java.util.ArrayList;

public class Lecturer extends Person implements Info,Level{

  String StaffNo;
  ArrayList <Courses> courses;

  public Lecturer(String name, String gender, String nationality, String dateOfBirth,
      String title, String staffNo, ArrayList<Courses> courses) {
    super(name, gender, nationality, dateOfBirth, title);
    StaffNo = staffNo;
    this.courses = courses;
  }

  public String getStaffNo() {
    return StaffNo;
  }

  public ArrayList<Courses> getCourses() {
    return courses;
  }

  public void setStaffNo(String staffNo) {
    StaffNo = staffNo;
  }

  public void setCourses(ArrayList<Courses> courses) {
    this.courses = courses;
  }

  @Override
  public void bio() {
    System.out.println("bio here");
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
