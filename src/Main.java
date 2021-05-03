import Abstratc.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customerStarbucks = new Customer();
		customerStarbucks.setId(1);
		customerStarbucks.setNationalityId(10000000000L);
		customerStarbucks.setFirstName("Yusuf Enes");
		customerStarbucks.setLastName("Aras");
		customerStarbucks.setDateOfBirth(2000);
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager1.Save(customerStarbucks);
		
		Customer customerNero = new Customer();
		customerNero.setId(1);
		customerNero.setNationalityId(11111111111L);
		customerNero.setFirstName("Yusuf Enes");
		customerNero.setLastName("Aras");
		customerNero.setDateOfBirth(2000);
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager2.Save(customerNero);
		
		
	}

}
