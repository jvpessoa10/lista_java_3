package com.joao.domain;

import java.util.Date;

public class CarroExecutivo extends Carro {


    public CarroExecutivo(boolean temArCondicionado, int nDePassageiros, TipoDeCombustivel tipoDeCombustivel, Double valorDaDiaria, boolean podeSerAluagadoComQuilometragemLivre, String placa, Date anoDeFabricação, Double quilometragemRodadaTotal) {
        super(temArCondicionado, nDePassageiros, tipoDeCombustivel, valorDaDiaria, podeSerAluagadoComQuilometragemLivre, placa, anoDeFabricação, quilometragemRodadaTotal);
    }

    @Override
    public void receberNota(Double nota) {

    }
}
