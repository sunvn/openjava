package com.ecode.service;

public class ServiceFactory {
  
  public IntergationService getService( String className){
    if(className.equals("AccountService")) {
      return UserService.getInstance();
    }
    else if(className.equals("TransactionHistoryService")) {      
      return  TransactionHistoryService.getInstance();
    }
    return null;
  }
}
