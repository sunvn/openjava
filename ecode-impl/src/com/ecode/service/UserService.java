package com.ecode.service;

public class UserService extends ServiceAbstract implements IntergationService {

  private static UserService instance = null;

  private UserService() {
   
  }

  public static UserService getInstance() {
    if (instance == null) {
      instance = new UserService();
    }
    return instance;
  }

  public Object execute() {

    System.out.println("User Service");
    return null;

  }

}
