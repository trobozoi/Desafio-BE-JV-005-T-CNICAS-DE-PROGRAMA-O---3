package model;

import java.time.ZonedDateTime;

public interface Sessao {
    ZonedDateTime getHoraInicio();

    void setHoraInicio(ZonedDateTime horaInicio);

    ZonedDateTime getHoraFim();

    void setHoraFim(ZonedDateTime horaFim);

    Lugar getLugar();

    void setLugar(Lugar lugar);

    @Override
    String toString();
}
