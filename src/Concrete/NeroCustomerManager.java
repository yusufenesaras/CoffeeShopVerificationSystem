package Concrete;

import Abstratc.BaseCustomerManager;
import Abstratc.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	
private ICustomerCheckService customerService;
	
	public NeroCustomerManager(ICustomerCheckService customerService) {
		this.customerService = customerService;
	}
	@Override
	public void Save(Customer customer){
		if(customerService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db nero: " +customer.getFirstName());
		} else {
			System.out.println("Nero Validation Error - Not a valid person.");
		}
	}
	
}
