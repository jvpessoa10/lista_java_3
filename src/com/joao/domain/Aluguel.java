package com.joao.domain;

import com.joao.utils.Rate;

import java.util.Date;

public class Aluguel extends Hospedagem {

    private int nDeQuartos;
    private Double temCozinha;

    public Aluguel(Double valorDaDiaria, Date tempoMinimoDeHospedagem, Double temCafeDaManha, Date horarioCheckIn, Date horarioCheckOut, boolean permiteCancelamentoGratis, IdiomasFalados idiomasFalados, Rate avaliacao, int nDeQuartos, Double temCozinha) {
        super(valorDaDiaria, tempoMinimoDeHospedagem, temCafeDaManha, horarioCheckIn, horarioCheckOut, permiteCancelamentoGratis, idiomasFalados, avaliacao);
        this.nDeQuartos = nDeQuartos;
        this.temCozinha = temCozinha;
    }

    public int getnDeQuartos() {
        return nDeQuartos;
    }

    public void setnDeQuartos(int nDeQuartos) {
        this.nDeQuartos = nDeQuartos;
    }

    public Double getTemCozinha() {
        return temCozinha;
    }

    public void setTemCozinha(Double temCozinha) {
        this.temCozinha = temCozinha;
    }
}
