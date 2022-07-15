package model;

import java.time.ZoneId;

public interface Lugar {
    String getNome();

    void setNome(String nome);

    ZoneId getZoneId();

    void setZoneId(ZoneId zoneId);
}
