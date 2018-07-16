package trng.samp.core1.demo4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXml {

	public static void main(String[] args) throws FileNotFoundException, JAXBException {

		JAXBContext contextObj = JAXBContext.newInstance(Customer.class);
		Marshaller marshallerObj = contextObj.createMarshaller();

		Customer cust1 = new Customer();
		cust1.setCustomerID(1);
		cust1.setCustomerName("Sachin");
		cust1.setAddress("1026 San Jacinto Drive");
		cust1.setAnnualSalary(120000.0);
		cust1.setDateOfBirth(null);

		marshallerObj.marshal(cust1, new FileOutputStream("Customer1.xml"));
		System.out.println("Success");
	}

}
