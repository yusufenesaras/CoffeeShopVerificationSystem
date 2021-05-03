package Concrete;
import Entities.Customer;
import Abstratc.BaseCustomerManager;
import Abstratc.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Validation successfull.");
			super.Save(customer);
			
		}else {
			
			System.out.println("Not a valid person.");
		}
	}
}
