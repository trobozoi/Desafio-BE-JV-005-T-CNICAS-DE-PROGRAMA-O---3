package model;

import java.time.ZoneId;

public class LugarImpl implements Lugar {
    private String nome;
    private ZoneId zoneId;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public ZoneId getZoneId() {
        return zoneId;
    }

    @Override
    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public LugarImpl(String nome, ZoneId zoneId) {
        this.nome = nome;
        this.zoneId = zoneId;
    }
}
