package com;




public  abstract class Person {
  private String name;
  private String gender;
  private String nationality;
  private String dateOfBirth;
  private String Title;

  public Person(String name, String gender, String nationality, String dateOfBirth,
      String title) {
    this.name = name;
    this.gender = gender;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.Title = title;
  }
  public Person(String name, String gender, String nationality, String dateOfBirth) {
    this.name = name;
    this.gender = gender;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getTitle() {
    return Title;
  }

  public void setTitle(String title) {
    Title = title;
  }
}
