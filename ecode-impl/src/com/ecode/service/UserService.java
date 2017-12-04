package com.ecode.service;

public class UserService extends ServiceAbstract implements TransactionService {

  private static UserService instance = null;

  private UserService() {
    // Exists only to defeat instantiation.
  }

  public static UserService getInstance() {
    if (instance == null) {
      instance = new UserService();
    }
    return instance;
  }

  public Object execute() {

    System.out.println("Account Service");
    return null;

  }

}
