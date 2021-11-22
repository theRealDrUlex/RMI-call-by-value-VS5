package Server;

import java.io.Serializable;
import java.util.Date;

public class Röntgenbild implements Serializable {
    private Date aufnameVom;
    private transient String patientenName;
    private byte[] rawData;

    public Röntgenbild(Date aufnameVom, String patientenName, byte[] rawData) {
        this.aufnameVom = aufnameVom;
        this.patientenName = patientenName;
        this.rawData = rawData;
    }
}
