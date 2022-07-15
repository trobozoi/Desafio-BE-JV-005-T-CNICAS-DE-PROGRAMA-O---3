package model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Objects;

public class Lugar {
    private String nome;
    private ZoneId zoneId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public Lugar(String nome, ZoneId zoneId) {
        this.nome = nome;
        this.zoneId = zoneId;
    }
}
