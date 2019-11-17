package com;

public class Bank {
   private String customerName;
   private String email;
   private long accountNumber;
   private long phoneNumber;
   private double balance;

  public Bank(String customerName, String email, long accountNumber, long phoneNumber,
      double balance) {
    this.customerName = customerName;
    this.email = email;
    this.accountNumber = accountNumber;
    this.phoneNumber = phoneNumber;
    this.balance = balance;
  }

  public Bank( long accountNumber, long phoneNumber, double balance) {
    this("chukwudi", "omegapasky@gmail.com", accountNumber,phoneNumber,balance);
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }


}
