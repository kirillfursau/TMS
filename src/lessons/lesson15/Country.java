package lessons.lesson15;

public class Country {
    int id;
    String name;
    String code;
    int population;

    public Country(int id, String name, String code, int population) {
        setId(id);
        setName(name);
        setCode(code);
        setPopulation(population);
    }

    public Country() {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", population=" + population +
                '}';
    }
}
