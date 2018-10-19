package tns;


import java.net.MalformedURLException;
import java.net.URL;


public class WSClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:7789/?wsdl");
		Application_Service service = new Application_Service(url);
		Application application = service.getApplication();
		application.getGraph("cindy");
	}

}
