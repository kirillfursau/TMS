package lessons.lesson13;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Converter {
    private static final String FILECATALOG = "/Users/kirylfursau/Desktop/TMS/";

    public static void convertToXml(Catalog catalog, String fileName) {
        try {

            File file = new File(FILECATALOG + fileName);
            JAXBContext context = JAXBContext.newInstance(Catalog.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(catalog, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFromXml(String fileName) {
        try {
            File file = new File(FILECATALOG + fileName);
            JAXBContext context = JAXBContext.newInstance(Catalog.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Catalog catalog = (Catalog) unmarshaller.unmarshal(file);
            System.out.println(catalog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void convertToJson(Catalog catalog, String fileName) {

    }

    public void readFromJson(String fileName) {

    }

    public static void main(String[] args) {
        Artist artist = new Artist("Bob marley", Instruments.GUITAR);
        Cd cd = new Cd("HeartSongs", artist, 1993, 100);
        Artist artist1 = new Artist("Edwar", Instruments.DRUM);
        Cd cd1 = new Cd("Some songs", artist1, 1998, 200);
        List<Cd> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);
        Catalog catalog = new Catalog(cds);
        convertToXml(catalog, "Xml.xml");
        readFromXml("Xml.xml");
    }
}
