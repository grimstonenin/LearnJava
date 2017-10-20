package JAXB.SerializeAndDeserialize;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.*;
import java.util.Map;

@XmlRootElement(name="bookstore")

@XmlType(propOrder = {"bookNumber","name","author","publisher","ISBN","releaseDate","totalPages","testMap"})
public class Book {

    private String name;
    private String ISBN;
    private LocalDate releaseDate;
    private String author;
    private String publisher;
    private int bookNumber;
    private double totalPages;
    private Map<String,String> testMap;

    @XmlElement(name="bookname",nillable = false)
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @XmlElement(name="booknumber")
    public int getBookNumber(){
        return this.bookNumber;
    }

    public void setBookNumber(int n){
        this.bookNumber = n;
    }

    @XmlElement(name = "bookauthor")
    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String name){
        this.author = name;
    }

    @XmlElement(name="isbn")
    public String getISBN(){
        return this.ISBN;
    }

    public void setISBN(String n){
        this.ISBN = n;
    }

    @XmlElement(name = "bookpublisher")
    public String getPublisher(){
        return this.publisher;
    }

    public void setPublisher(String n){
        this.publisher = n;
    }

    @XmlElement(name="bookpages")
    public double getTotalPages(){
        return this.totalPages;
    }

    public void setTotalPages(double d){
        this.totalPages = d;
    }

    @XmlElement(name="releaseDate")
    public LocalDate getReleaseDate(){
        return this.releaseDate;
    }


    @XmlJavaTypeAdapter(DateTypeAdapter.class)
    public void setReleaseDate(LocalDate d){
        this.releaseDate = d;
    }

    @XmlElement(name="testmap")
    public Map<String,String> getTestMap() {
        return this.testMap;
    }

    public void setTestMap(Map<String, String> testMap) {
        this.testMap = testMap;
    }

}
