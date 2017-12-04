package com.ecode.service;

public class TransactionHistoryService extends ServiceAbstract implements TransactionService {
  private static TransactionHistoryService instance = null;

  private TransactionHistoryService() {
  }

  public static TransactionHistoryService getInstance() {
    if (instance == null) {
      instance = new TransactionHistoryService();
    }
    return instance;
  }

  @Override
  public Object execute() {
    System.out.println("Transaction Service");
    return null;
  }

}
