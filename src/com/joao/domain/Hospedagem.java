package com.joao.domain;



import com.joao.utils.Rate;

import java.util.Date;


abstract public class Hospedagem  {

    private final Double MAX_RATE = 10.0;

    private Double valorDaDiaria;
    private Date tempoMinimoDeHospedagem;
    private Double temCafeDaManha;
    private Date horarioCheckIn;
    private Date horarioCheckOut;
    private boolean permiteCancelamentoGratis;
    private IdiomasFalados idiomasFalados;
    private Rate avaliacao = new Rate(MAX_RATE);

    public Hospedagem(Double valorDaDiaria, Date tempoMinimoDeHospedagem, Double temCafeDaManha, Date horarioCheckIn, Date horarioCheckOut, boolean permiteCancelamentoGratis, IdiomasFalados idiomasFalados, Rate avaliacao) {
        this.valorDaDiaria = valorDaDiaria;
        this.tempoMinimoDeHospedagem = tempoMinimoDeHospedagem;
        this.temCafeDaManha = temCafeDaManha;
        this.horarioCheckIn = horarioCheckIn;
        this.horarioCheckOut = horarioCheckOut;
        this.permiteCancelamentoGratis = permiteCancelamentoGratis;
        this.idiomasFalados = idiomasFalados;
        this.avaliacao = avaliacao;
    }


    public Double getValorDaDiaria() {
        return valorDaDiaria;
    }

    public void setValorDaDiaria(Double valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }

    public Date getTempoMinimoDeHospedagem() {
        return tempoMinimoDeHospedagem;
    }

    public void setTempoMinimoDeHospedagem(Date tempoMinimoDeHospedagem) {
        this.tempoMinimoDeHospedagem = tempoMinimoDeHospedagem;
    }

    public Double getTemCafeDaManha() {
        return temCafeDaManha;
    }

    public void setTemCafeDaManha(Double temCafeDaManha) {
        this.temCafeDaManha = temCafeDaManha;
    }

    public Date getHorarioCheckIn() {
        return horarioCheckIn;
    }

    public void setHorarioCheckIn(Date horarioCheckIn) {
        this.horarioCheckIn = horarioCheckIn;
    }

    public Date getHorarioCheckOut() {
        return horarioCheckOut;
    }

    public void setHorarioCheckOut(Date horarioCheckOut) {
        this.horarioCheckOut = horarioCheckOut;
    }

    public boolean isPermiteCancelamentoGratis() {
        return permiteCancelamentoGratis;
    }

    public void setPermiteCancelamentoGratis(boolean permiteCancelamentoGratis) {
        this.permiteCancelamentoGratis = permiteCancelamentoGratis;
    }

    public IdiomasFalados getIdiomasFalados() {
        return idiomasFalados;
    }

    public void setIdiomasFalados(IdiomasFalados idiomasFalados) {
        this.idiomasFalados = idiomasFalados;
    }

    public Rate getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Rate avaliacao) {
        this.avaliacao = avaliacao;
    }

    public enum IdiomasFalados{
        PORTUGUES,
        INGLES,
        ESPANHOL
    }
}
