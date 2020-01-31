package lessons.lesson13;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


@XmlRootElement
public class Catalog {
    private List<Cd> cds;

    Catalog(List<Cd> cds) {
        setCds(cds);
    }

    Catalog() {
    }

    public List<Cd> getCds() {
        return cds;
    }

    public void setCds(List<Cd> cds) {
        this.cds = cds;
    }

    @Override
    public String toString() {
        return "Cd " + getCds();
    }
}
