package com.joao.domain;

import com.joao.utils.Rate;

import java.util.Date;

public class Hotel extends Hospedagem implements Comparable {

    private final int N_ESTRELAS = 5;

    private boolean ofereceTranslado;
    private Rate estrelas;


    public Hotel(Double valorDaDiaria, Date tempoMinimoDeHospedagem, Double temCafeDaManha, Date horarioCheckIn, Date horarioCheckOut, boolean permiteCancelamentoGratis, IdiomasFalados idiomasFalados, boolean ofereceTranslado) {
        super(valorDaDiaria, tempoMinimoDeHospedagem, temCafeDaManha, horarioCheckIn, horarioCheckOut, permiteCancelamentoGratis, idiomasFalados);
        this.ofereceTranslado = ofereceTranslado;
        this.estrelas = new Rate(N_ESTRELAS);
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


    @Override
    public String toString() {
        return "Hotel{" +
                "N_ESTRELAS=" + N_ESTRELAS +
                ", ofereceTranslado=" + ofereceTranslado +
                ", estrelas=" + estrelas +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        Hotel child = (Hotel) o;

        Double thisStars = this.getEstrelas().getRate();
        Double otherStars = child.getEstrelas().getRate();
        if(thisStars<otherStars) {
            return 1;
        }else if(thisStars> otherStars)return -1;
        return 0;
    }
}
