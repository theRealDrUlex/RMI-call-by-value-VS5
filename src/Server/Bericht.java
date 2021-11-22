package Server;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bericht implements Serializable {
    private Date datum;
    private String diagnose;
    private String weiteresVorgehen;

    @Override
    public String toString() {
        return "Bericht{" +
                "datum=" + datum +
                ", diagnose='" + diagnose + '\'' +
                ", weiteresVorgehen='" + weiteresVorgehen + '\'' +
                '}';
    }

    public Bericht(Date datum, String diagnose, String weiteresVorgehen) {
        this.datum = datum;
        this.diagnose = diagnose;
        this.weiteresVorgehen = weiteresVorgehen;
    }
}
