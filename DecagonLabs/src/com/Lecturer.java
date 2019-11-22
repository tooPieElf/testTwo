package com;
import java.util.ArrayList;

public class Lecturer extends Person implements Info,Level{

  String staffNo;
  ArrayList <Courses> courses;

  public Lecturer(String name, String gender, String nationality, String dateOfBirth,
      String title, String staffNo, ArrayList<Courses> courses) {
    super(name, gender, nationality, dateOfBirth, title);
    this.staffNo = staffNo;
    this.courses = courses;
  }

  public String getStaffNo() {
    return staffNo;
  }

  public ArrayList<Courses> getCourses() {
    return courses;
  }

  public void setStaffNo(String staffNo) {
    staffNo = staffNo;
  }

  public void setCourses(ArrayList<Courses> courses) {
    this.courses = courses;
  }

  @Override
  public void bio() {
    System.out.println("Name: "+this.getName() +
                       "Gender "+this.getGender() +
                       "Nationality "+this.getNationality()+
                        "Title " + this.getTitle());
  }

  @Override
  public void details() {
    bio();
    System.out.println("courses :" +this.courses );
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

  public String toString() {
    String s = "";
    s += "name :"+this.getName()+'\n' + "staffno : " +this.staffNo+'\n' + "gender : " + this.getGender()+'\n' +"Nationality :"+this.getNationality();
    return s;

  }
}
