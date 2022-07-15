package service;

import model.Agenda;
import model.Lugar;
import model.Sessao;
import model.SessaoImpl;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class GeracaoSessaoImpl implements GeracaoSessao {
    @Override
    public Sessao mudarDeLocal(Sessao sessao, Lugar novoLugar){
        return new SessaoImpl(sessao.getHoraInicio(), novoLugar);
    }

    @Override
    public Agenda criarAgenda(Sessao sessaoInicial, int intervaloHoras, int intervaloDias){
        Sessao sessao = new SessaoImpl(sessaoInicial.getHoraInicio(), sessaoInicial.getLugar());
        List<Sessao> sessaos = new ArrayList<>();
        sessaos.add(sessao);
        Agenda agenda = Agenda.getInstance(new ArrayList<>());
        agenda.getSessaos().addAll(sessaos);
        while (sessao.getHoraInicio().plusHours(intervaloHoras).plusDays(intervaloDias).getMonth() != Month.NOVEMBER){
            sessao = new SessaoImpl(sessao.getHoraInicio().plusHours(intervaloHoras).plusDays(intervaloDias), sessao.getLugar());
            agenda.setSessao(sessao);
        }

        return agenda;
    }
}
