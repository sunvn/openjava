import com.ecode.service.TransactionService;
import com.ecode.service.ServiceFactory;


public class Main {
  public static void main(String args[]) {
    
    ServiceFactory sf = new ServiceFactory();
    TransactionService  sk = sf.getService("AccountService");
    sk.execute();
   
    TransactionService  sk1 = sf.getService("TransactionHistoryService");
    sk1.execute();
    
  }

}
