package homeWork.homeWork11;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book = new Book(101, "Harry Potter", 2001, books);
        books.add(book);
        Book book1 = new Book(102, "Harry Shproter", 2003, books);
        books.add(book1);
        Book book2 = new Book(103, "Henry Proper", 2005, books);
        books.add(book2);
        String fileCatalog = "/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork11/";
        BooksList booksList = new BooksList(books);
        try {
            File file = new File(fileCatalog + "Books.xml");
            JAXBContext context = JAXBContext.newInstance(BooksList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(booksList, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
