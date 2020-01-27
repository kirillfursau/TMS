package lessons.lesson13;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Artist {
    private String name;
    private Instruments instruments;

    Artist(){
    }
    Artist(String name, Instruments instruments){
        setName(name);
        setInstruments(instruments);
    }

    public String getName() {
        return name;
    }

    public Instruments getInstruments() {
        return instruments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstruments(Instruments instruments) {
        this.instruments = instruments;
    }
}
