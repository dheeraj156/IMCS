package trng.imcs.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "trng.imcs.soap.MobileService")
public class MobileServiceImpl implements MobileService {

	public RechargeMobileResponse rechargeMobile(RechargeMobileRequest request) {
		RechargeMobileResponse response = new RechargeMobileResponse();
		response.setResponseCode("101");
		response.setResponseMessage("Successfully processed");
		return response;
	}

}
