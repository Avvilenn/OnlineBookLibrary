package com.book.parsers;


import com.book.basicTypes.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class ParserToXML {
    private static ParserToXML ourInstance = new ParserToXML();

    public static ParserToXML getInstance() {
        return ourInstance;
    }

    private ParserToXML() {
    }

    public void writeToXML (Book book, StringWriter stringWriter) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(book, stringWriter);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
