package homeWork.homeWork11;

import java.util.List;

public class Book {
    private int article;
    private String name;
    private int year;
    private List<Book> books;

    public Book(int article, String name, int year) {
        setArticle(article);
        setName(name);
        setYear(year);
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}