package com.iq.gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class MarshilingDemo {
	public class MarshillingDemo {
		public void main(String[] args) throws JAXBException, FileNotFoundException  {
			// setting the values in POJO class
			Student student = new Student(100, "anil");
			// creating the JAXB context
			JAXBContext jContext = JAXBContext.newInstance(Student.class);
			// creating the marshaller object
			Marshaller marshallObj = jContext.createMarshaller();
			// setting the property to show xml format output
			marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// calling the marshall method
			marshallObj.marshal(student, new FileOutputStream("student.xml"));
			System.out.println("success");
		}

	}
}
