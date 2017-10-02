package JAXB.SerializeAndDeserialize;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class BookStoreMainSchema {

    private static final String BOOKSTORE_XML = "./bookstore-jaxb-failed-validation.xml";

    public static void main(String[] args) throws JAXBException, SAXException, IOException {

        Stores s = new Stores();
        
        //Unmarshall info from xml with wrong data

        JAXBContext context = JAXBContext.newInstance(Stores.class);

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("bookstore-fail-validation.xsd"));

        Unmarshaller unmarshaller = context.createUnmarshaller();
        unmarshaller.setSchema(schema);

        s = (Stores)unmarshaller.unmarshal(new File(BOOKSTORE_XML));

        JAXBSource source = new JAXBSource(context,s);


//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setSchema(schema);
//
//        marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
//

        //validate against xsd - bookname is required but missing for a book

        Validator validator = schema.newValidator();

        try{
            validator.validate(source);
            System.out.println("No problems");
        }
        catch (SAXException e){
            e.printStackTrace();
        }




    }
}
