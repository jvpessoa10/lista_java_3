package com.joao.domain;

import com.joao.utils.Rate;

import java.util.Date;

public class Hotel extends Hospedagem {

    private final int N_ESTRELAS = 5;

    private boolean ofereceTranslado;
    private Rate estrelas = new Rate(N_ESTRELAS);


    public Hotel(Double valorDaDiaria, Date tempoMinimoDeHospedagem, Double temCafeDaManha, Date horarioCheckIn, Date horarioCheckOut, boolean permiteCancelamentoGratis, IdiomasFalados idiomasFalados, Rate avaliacao, boolean ofereceTranslado, Rate estrelas) {
        super(valorDaDiaria, tempoMinimoDeHospedagem, temCafeDaManha, horarioCheckIn, horarioCheckOut, permiteCancelamentoGratis, idiomasFalados, avaliacao);
        this.ofereceTranslado = ofereceTranslado;
        this.estrelas = estrelas;
    }

    public boolean isOfereceTranslado() {
        return ofereceTranslado;
    }

    public void setOfereceTranslado(boolean ofereceTranslado) {
        this.ofereceTranslado = ofereceTranslado;
    }

    public Rate getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(Rate estrelas) {
        this.estrelas = estrelas;
    }
}
