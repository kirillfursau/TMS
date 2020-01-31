package lessons.lesson13;


import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
/*
Создайте класс Converter, а в нём методы convertToXml(Catalog catalog, String fileName), readFromXml(String fileName),
convertToJson(Catalog catalog, String fileName), readFromJson(String fileName).
Все методы пишут и читают файлы, расположенные в конкретной директории, путь к которой указан в private static final
поле в классе Converter.
6. Можно приделать консольный интерфейс в виде меню, чтобы программа стала чуть-чуть похожа на БД магазина :)
типа можно записать новый альбом в каталог, удалить из каталога итд.
Также можно искать в каталоге все cd по имени исполнителя, а ещё можно выводить их в разных форматах на консоль
(XML, JSON, просто текстом как раньше). Если мало идей, я могу ещё подкинуть)
*/
@XmlRootElement
public class Converter {
    private static final String FILECATALOG = "/Users/kirylfursau/Desktop/TMS/src/lessons/lesson13/";

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

    public static Catalog readFromXml(String fileName) {
        try {
            File file = new File(FILECATALOG + fileName);
            JAXBContext context = JAXBContext.newInstance(Catalog.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Catalog) unmarshaller.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void convertToJson(Catalog catalog, String fileName) {
        try {
            File file = new File(FILECATALOG + fileName);
            ObjectMapper writeMapper = new ObjectMapper();
            writeMapper.writeValue(file, catalog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Catalog readFromJson(String fileName) {
        try {
            File file = new File(FILECATALOG + fileName);
            ObjectMapper readMapper = new ObjectMapper();
            return readMapper.readValue(file, Catalog.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Artist artist = new Artist("Bob marley", Instruments.GUITAR);
        Cd cd = new Cd("HeartSongs", artist, 1993, 100);
        Artist artist1 = new Artist("Edwar", Instruments.DRUM);
        Cd cd1 = new Cd("Some songs", artist1, 1998, 200);
        List<Cd> cds = new ArrayList<Cd>();
        cds.add(cd);
        cds.add(cd1);
        Catalog catalog = new Catalog(cds);
        convertToXml(catalog, "Xml.xml");
        System.out.println(readFromXml("Xml.xml"));
        convertToJson(catalog, "Json.json");
        System.out.println(readFromJson("Json.Json"));
    }
}
