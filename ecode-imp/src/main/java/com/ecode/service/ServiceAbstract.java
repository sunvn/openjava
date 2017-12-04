
package com.ecode.service;

import java.util.Properties;

public abstract class ServiceAbstract {
  
  protected String statusCode;
  protected String errorMessage;
  protected String version;
  protected String messageID;
  protected String serviceUri;

  protected Properties prop = null;

  protected String transID;

  public <T> T buildCommonParameter(T arg) throws Exception {
    return (T) arg;
  }
  
  public void buildCommonParameter() {
    System.out.println("buildCommonParameter");
  }
  
  public void  initializeContext (String serviceName, String uri) {
    
  }

  public Object execute() {
    // TODO Auto-generated method stub
    return null;
  }
  
}
