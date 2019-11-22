package com;

import java.util.ArrayList;

public class Courses {
  private int creditUnit;
  private String title;
  private String courseCode;
  private ArrayList <Lecturer> lecturers;

  public Courses(int creditUnit, String title, String courseCode,
      ArrayList<Lecturer> lecturers) {
    this.creditUnit = creditUnit;
    this.title = title;
    this.courseCode = courseCode;
    this.lecturers = lecturers;
  }
  public Courses(int creditUnit, String title, String courseCode) {
    this.creditUnit = creditUnit;
    this.title = title;
    this.courseCode = courseCode;

  }

  public int getCreditUnit() {
    return creditUnit;
  }

  public void setCreditUnit(int creditUnit) {
    this.creditUnit = creditUnit;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public ArrayList<Lecturer> getLecturers() {
    return lecturers;
  }

  public void setLecturers(ArrayList<Lecturer> lecturers) {
    this.lecturers = lecturers;
  }
}
