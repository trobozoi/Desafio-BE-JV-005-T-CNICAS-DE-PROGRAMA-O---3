package app;

import model.Agenda;
import model.Lugar;
import model.Sessao;
import service.GeracaoSessao;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime dataHoraZonaAgora = ZonedDateTime.of(LocalDateTime.now(ZoneOffset.UTC),ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime dataHoraZonaAgora2 = ZonedDateTime.of(LocalDateTime.now(ZoneOffset.UTC), ZoneId.of("Europe/Paris"));
        System.out.println(dataHoraZonaAgora);
        System.out.println(dataHoraZonaAgora2);

        System.out.println(ZoneId.of("America/Sao_Paulo").getRules().getStandardOffset(Instant.now()));
        System.out.println(ZoneId.of("Europe/Paris").getRules().getStandardOffset(Instant.now()));
        long x = ChronoUnit.HOURS.between(LocalDateTime.now(), LocalDateTime.now(ZoneOffset.UTC));
        long y = ChronoUnit.HOURS.between(LocalDateTime.now(), LocalDateTime.now());

        System.out.println(x);
        System.out.println(LocalDateTime.now(ZoneOffset.UTC));



/*
        List<Sessao> sessaos = new ArrayList<>();
        Sessao sessaoSaoPaulo = new Sessao(LocalDateTime.of(2022, 07, 20, 10, 0, 0), new Lugar("São Paulo", ZoneId.of("America/Sao_Paulo")));
        Sessao sessaoParis = new GeracaoSessao().mudarDeLocal(sessaoSaoPaulo, new Lugar("Paris", ZoneId.of("America/Sao_Paulo")));
        sessaos.add(sessaoSaoPaulo);
        Agenda agenda = Agenda.getInstance(sessaos);
        */
    }
}
