package homeWork.homeWork11;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class BooksList {
    private List<Book> books;

    public BooksList(List<Book> books) {
    setBooks(books);
    }

    public BooksList() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BooksList{}";
    }

}