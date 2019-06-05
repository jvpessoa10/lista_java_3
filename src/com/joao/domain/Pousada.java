package com.joao.domain;

import com.joao.utils.Rate;

import java.util.Date;

public class Pousada extends Hospedagem {

    private boolean ofereceTranslado;

    public Pousada(boolean ofereceTranslado ,Double valorDaDiaria, Date tempoMinimoDeHospedagem, Double temCafeDaManha, Date horarioCheckIn, Date horarioCheckOut, boolean permiteCancelamentoGratis, IdiomasFalados idiomasFalados) {
        super(valorDaDiaria, tempoMinimoDeHospedagem, temCafeDaManha, horarioCheckIn, horarioCheckOut, permiteCancelamentoGratis, idiomasFalados);
        this.ofereceTranslado = ofereceTranslado;
    }


    public boolean ofereceTranslado() {
        return ofereceTranslado;
    }


    public void setOfereceTranslado(boolean ofereceTranslado) {
        this.ofereceTranslado = ofereceTranslado;
    }

    @Override
    public String toString() {
        return "Pousada{" +
                "ofereceTranslado=" + ofereceTranslado +
                '}';
    }


}
