package trng.samp.core1.demo4;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XmlToObject {

	public static void main(String[] args) throws JAXBException {
		
		File file = new File("Customer1.xml");
		JAXBContext contextObj = JAXBContext.newInstance(Customer.class); 
		Unmarshaller unmarshalObj = contextObj.createUnmarshaller();
		
		Customer cust1 = (Customer)unmarshalObj.unmarshal(file);
		System.out.println(cust1);
		System.out.println("Success");
	}

}
