package com;




public class Person {
  String name;
  String gender;
  String nationality;
  String dateOfBirth;
  String Title;

  public Person(String name, String gender, String nationality, String dateOfBirth,
      String title) {
    this.name = name;
    this.gender = gender;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    Title = title;
  }
  public Person(String name, String gender, String nationality, String dateOfBirth) {
    this.name = name;
    this.gender = gender;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
  }

}
