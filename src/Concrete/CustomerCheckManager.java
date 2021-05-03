package Concrete;
//import java.lang.Boolean;
import Abstratc.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}
}
