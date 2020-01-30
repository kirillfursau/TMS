package homeWork.homeWork11;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import java.util.List;

@XmlRootElement
public class Book {
    private int article;
    private String name;
    private int year;
    private static List<Book> books;


    public Book(int article, String name, int year, List<Book> books) {
        setArticle(article);
        setName(name);
        setYear(year);
        setBooks(books);
    }

    public Book() {
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @JsonIgnore
    @XmlTransient
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Book{" +
                "article=" + article +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", books=" + books +
                '}';
    }
}