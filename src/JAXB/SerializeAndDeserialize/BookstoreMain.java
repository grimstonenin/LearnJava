package JAXB.SerializeAndDeserialize;

import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@XmlRootElement(name = "root")


class Stores{

  @XmlElement(name="BookStore")
  private ArrayList<Bookstore> stores = new ArrayList();

  public ArrayList<Bookstore> getStores(){
      return this.stores;
  }

  public void setStores(){


      ArrayList<Book> bookList1 = new ArrayList<Book>();

      Map<String,String> newMap = new HashMap<>();
      newMap.put("testKey","testValue");
      newMap.put("testkey2","testValue2");

      Book book11 = new Book();

      book11.setAuthor("Frank Herbert");
      book11.setName("Dune");
      book11.setBookNumber(1);
      book11.setPublisher("Chilton Books");
      book11.setISBN("978-0441172719");
      book11.setReleaseDate(LocalDate.of(1965,8,1));
      book11.setTotalPages(412.0);
      bookList1.add(book11);
      book11.setTestMap(newMap);

      Book book12 = new Book();

      book12.setAuthor("Frank Herbert");
      book12.setName("Dune Messiah");
      book12.setBookNumber(2);
      book12.setPublisher("Putnam Publishing");
      book12.setISBN("9780441172696");
      book12.setReleaseDate(LocalDate.of(1969,8,1));
      book12.setTotalPages(256.0);
      bookList1.add(book12);

      Book book13 = new Book();

      book13.setAuthor("Frank Herbert");
      book13.setName("Children of Dune");
      book13.setBookNumber(3);
      book13.setPublisher("Putnam Publishing");
      book13.setISBN("0-399-11697-4");
      book13.setReleaseDate(LocalDate.of(1976,8,1));
      book13.setTotalPages(416.0);
      bookList1.add(book13);


      Bookstore bookstore1 = new Bookstore();
      bookstore1.setName("Fraport Bookstore");
      bookstore1.setLocation("Frankfurt Airport");
      bookstore1.setBookList(bookList1);

      ArrayList<Book> bookList2 = new ArrayList<Book>();

      Book book21 = new Book();

      book21.setAuthor("Frank Herbert");
      book21.setName("God Emperor of Dune");
      book21.setBookNumber(4);
      book21.setPublisher("Putnam Publishing");
      book21.setISBN("0-575-02976-5");
      book21.setReleaseDate(LocalDate.of(1981,8,1));
      book21.setTotalPages(412.0);
      bookList2.add(book21);

      Book book22 = new Book();

      book22.setAuthor("Frank Herbert");
      book22.setName("Heretics of Dune");
      book22.setBookNumber(5);
      book22.setPublisher("Putnam Publishing");
      book22.setISBN("0-399-12898-0");
      book22.setReleaseDate(LocalDate.of(1984,8,1));
      book22.setTotalPages(256.0);
      bookList2.add(book22);

      Book book23 = new Book();

      book23.setAuthor("Frank Herbert");
      book23.setName("Chapterhouse: Dune");
      book23.setBookNumber(6);
      book23.setPublisher("Putnam Publishing");
      book23.setISBN("0-399-13027-6");
      book23.setReleaseDate(LocalDate.of(1985,8,1));
      book23.setTotalPages(464.0);
      bookList2.add(book23);

      Bookstore bookstore2 = new Bookstore();
      bookstore2.setName("Otopeni Bookstore");
      bookstore2.setLocation("Otopeni Airport");
      bookstore2.setBookList(bookList2);

      stores.add(bookstore1);
      stores.add(bookstore2);
  }


}
public class BookstoreMain {

    private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";

    public static void main(String[] args) throws JAXBException, IOException {


        Stores s = new Stores();

        s.setStores();

        JAXBContext context = JAXBContext.newInstance(Stores.class);

        //marshall stuff into file

        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);


        // Write to System.out
        m.marshal(s, System.out);
       // m.marshal(bookstore2, System.out);

        // Write to File
        m.marshal(s, new File(BOOKSTORE_XML));


        //unmarshall

//        File input = new File(BOOKSTORE_XML);
//
//        JAXBContext unmarshallContext = JAXBContext.newInstance(Stores.class);
//        Unmarshaller unmarshaller = unmarshallContext.createUnmarshaller();
//
//        Stores stores = (Stores)unmarshaller.unmarshal(input);
//
//        for(Bookstore b: stores.getStores()){
//            System.out.println(b.getName());
//            System.out.println(b.getLocation());
//            for(Book book: b.getBookList()){
//                System.out.println(book.getName());
//                System.out.println(book.getAuthor());
//                System.out.println(book.getReleaseDate());
//                System.out.println(book.getISBN());
//                System.out.println(book.getPublisher());
//                System.out.println(book.getTotalPages());
//                System.out.println(book.getBookNumber());
//            }
//        }

//create schema from xml
//        SchemaOutputResolver outputResolver = new SchemaOutputResolver() {
//            @Override
//            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
//                suggestedFileName = "bookstore.xsd";
//                File file = new File(suggestedFileName);
//                StreamResult result = new StreamResult(file);
//                result.setSystemId(file.toURI().toURL().toString());
//                return result;
//            }
//        };
//
//        context.generateSchema(outputResolver);
//
//
   }
}
