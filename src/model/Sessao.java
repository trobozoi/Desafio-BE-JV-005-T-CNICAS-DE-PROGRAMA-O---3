package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sessao {
    LocalDateTime horaInicio;
    LocalDateTime horaFim;
    Lugar lugar;

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalDateTime horaFim) {
        this.horaFim = horaFim;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Sessao(LocalDateTime horaInicio, Lugar lugar) {
        this.horaInicio = horaInicio;
        this.horaFim = horaInicio.plusHours(6);
        this.lugar = lugar;
    }
}
