import com.ecode.service.IntergationService;
import com.ecode.service.ServiceFactory;


public class Main {
  public static void main(String args[]) {
    
    ServiceFactory sf = new ServiceFactory();
    IntergationService  sk = sf.getService("AccountService");
    sk.execute();
   
    IntergationService  sk1 = sf.getService("TransactionHistoryService");
    sk1.execute();
    
  }

}
