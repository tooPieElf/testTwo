package com;

import java.util.ArrayList;

public class Department {
  String title;
  ArrayList <Student> students;
  ArrayList <Lecturer> lecturers;
  ArrayList <Courses> courses;


  public Department(String title) {
    this.title = title;
    this.students = new ArrayList<Student>();
    this.lecturers = new ArrayList<Lecturer>();
    this.courses = new ArrayList<Courses>();
  }
}
