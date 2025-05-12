package com.tarikyildiz;

import java.io.File;
import generated.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class XmlReader {

    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File xmlFile = new File("src/main/resources/person.xml");
            Person person = (Person) unmarshaller.unmarshal(xmlFile);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
