package trng.imcs.soap.client;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import trng.imcs.soap.MobileService;
import trng.imcs.soap.RechargeMobileRequest;
import trng.imcs.soap.RechargeMobileResponse;

public class ServiceConsumer {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8080/MySOAPWS/MobileService?wsdl");
			QName qName = new QName("http://soap.imcs.trng/", "MobileServiceImplService");
			Service service = Service.create(url, qName);
			MobileService mobileService = service.getPort(MobileService.class);
			RechargeMobileRequest request = new RechargeMobileRequest();
			request.setAmount(new BigDecimal(100));
			request.setConsumerId("C101");
			request.setMobileNumber(34343434343l);
			request.setPlan("PLAN-A");
			RechargeMobileResponse response = mobileService.rechargeMobile(request );
			System.out.println(response.getResponseCode());
			System.out.println(response.getResponseMessage());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
