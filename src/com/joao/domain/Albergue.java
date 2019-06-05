package com.joao.domain;

import com.joao.utils.Rate;

import java.util.Date;

public class Albergue extends Hospedagem{

    private int quantidadeDeHospedesPorQuarto;

    public Albergue(Double valorDaDiaria, Date tempoMinimoDeHospedagem, Double temCafeDaManha, Date horarioCheckIn, Date horarioCheckOut, boolean permiteCancelamentoGratis, IdiomasFalados idiomasFalados , int quantidadeDeHospedesPorQuarto) {
        super(valorDaDiaria, tempoMinimoDeHospedagem, temCafeDaManha, horarioCheckIn, horarioCheckOut, permiteCancelamentoGratis, idiomasFalados);
        this.quantidadeDeHospedesPorQuarto = quantidadeDeHospedesPorQuarto;
    }


    public int getQuantidadeDeHospedesPorQuarto() {
        return quantidadeDeHospedesPorQuarto;
    }

    public void setQuantidadeDeHospedesPorQuarto(int quantidadeDeHospedesPorQuarto) {
        this.quantidadeDeHospedesPorQuarto = quantidadeDeHospedesPorQuarto;
    }

    @Override
    public String toString() {
        return "Albergue{" +
                "quantidadeDeHospedesPorQuarto=" + quantidadeDeHospedesPorQuarto +
                '}';
    }


}
