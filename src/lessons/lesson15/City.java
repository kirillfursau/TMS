package lessons.lesson15;

public class City {
    int id;
    String name;
    int countryId;
    boolean isCapital;

    public City() {
    }

    public City(int id, String name, int countryId, boolean isCapital) {
        setId(id);
        setName(name);
        setCountryId(countryId);
        setCapital(isCapital);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                ", isCapital=" + isCapital +
                '}';
    }
}

