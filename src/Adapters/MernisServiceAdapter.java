package Adapters;
import java.rmi.RemoteException;
import Entities.Customer;
import Abstratc.ICustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula((customer.getNationalityId()),
					  customer.getFirstName(), 
					  customer.getLastName(), 
					  customer.getDateOfBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}
	
}
