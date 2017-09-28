package JAXB.SerializeAndDeserialize;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Bookstore")
@XmlType(propOrder = {"name","location","bookList"})
public class Bookstore {

    // XmLElementWrapper generates a wrapper element around XML representation
  @XmlElementWrapper(name = "booklist")

  //XmlElement sets the name of the entities

    @XmlElement(name = "book")
    private ArrayList<Book> bookList;
    private String name;
    private String location;

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
