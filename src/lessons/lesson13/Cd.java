package lessons.lesson13;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cd {
    private String title;
    private Artist artist;
    private int year;
    private int price;

    Cd() {

    }

    Cd(String title, Artist artist, int year, int price) {
        setTitle(title);
        setArtist(artist);
        setYear(year);
        setPrice(price);
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n" + "Title " + getTitle() + ". Artist" + getArtist()
                + ". Product price " + getPrice() + ". Year "+  getYear();
    }
}
