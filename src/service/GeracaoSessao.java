package service;

import model.Agenda;
import model.Lugar;
import model.Sessao;

import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GeracaoSessao {
    public Sessao mudarDeLocal(Sessao sessao, Lugar novoLugar){
        return new Sessao(sessao.getHoraInicio(), novoLugar);
    }

    public Agenda criarAgenda(Sessao sessaoInicial, int intervaloHoras, int intervaloDias){
        Sessao sessao = new Sessao(sessaoInicial.getHoraInicio(), sessaoInicial.getLugar());
        List<Sessao> sessaos = new ArrayList<>();
        sessaos.add(sessao);
        Agenda agenda = Agenda.getInstance(new ArrayList<>());
        agenda.getSessaos().addAll(sessaos);
        while (sessao.getHoraInicio().plusHours(intervaloHoras).plusDays(intervaloDias).getMonth() != Month.NOVEMBER){
            sessao = new Sessao(sessao.getHoraInicio().plusHours(intervaloHoras).plusDays(intervaloDias), sessao.getLugar());
            agenda.setSessao(sessao);
        }

        return agenda;
    }
}
