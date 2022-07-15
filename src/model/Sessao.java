package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Sessao {
    ZonedDateTime horaInicio;
    ZonedDateTime horaFim;
    Lugar lugar;

    public ZonedDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(ZonedDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public ZonedDateTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(ZonedDateTime horaFim) {
        this.horaFim = horaFim;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Sessao(ZonedDateTime horaInicio, Lugar lugar) {
        this.horaInicio = horaInicio.withZoneSameInstant(lugar.getZoneId());
        this.horaFim = horaInicio.plusHours(6);
        this.lugar = lugar;
    }

    public Sessao(LocalDateTime localDateTime, Lugar lugar) {
        this.horaInicio = ZonedDateTime.of(localDateTime, lugar.getZoneId());
        this.horaFim = horaInicio.plusHours(6);
        this.lugar = lugar;
    }

    public Sessao(String s, Lugar lugar) {
        LocalDateTime localDateTime = LocalDateTime.parse(s);
        this.horaInicio = ZonedDateTime.of(localDateTime, lugar.getZoneId());
        this.horaFim = horaInicio.plusHours(6);
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        String data = this.horaInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE"));
        String hora01 = this.horaInicio.format(DateTimeFormatter.ofPattern("HH:mm"));
        String hora02 = this.horaFim.format(DateTimeFormatter.ofPattern("HH:mm"));
        String lugar = this.getLugar().getNome();
        return String.format("%-15s = %-10s\n" +
                        "%-15s = %-10s\n" +
                        "%-15s = %-10s\n" +
                        "%-15s = %-10s\n","Data", data,
                "Hora de Inicio", hora01,
                "Hora de Fim", hora02,
                "Local", lugar);
    }
}
