package com.joao.domain;

import java.util.Date;

abstract public class Carro implements Avaliavel {

    private boolean temArCondicionado;
    private int nDePassageiros;
    private TipoDeCombustivel tipoDeCombustivel;
    private Double valorDaDiaria;
    private boolean podeSerAluagadoComQuilometragemLivre;
    private String placa;
    private Date anoDeFabricação;
    private Double quilometragemRodadaTotal;

    public Carro(boolean temArCondicionado, int nDePassageiros, TipoDeCombustivel tipoDeCombustivel, Double valorDaDiaria, boolean podeSerAluagadoComQuilometragemLivre, String placa, Date anoDeFabricação, Double quilometragemRodadaTotal) {
        this.temArCondicionado = temArCondicionado;
        this.nDePassageiros = nDePassageiros;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorDaDiaria = valorDaDiaria;
        this.podeSerAluagadoComQuilometragemLivre = podeSerAluagadoComQuilometragemLivre;
        this.placa = placa;
        this.anoDeFabricação = anoDeFabricação;
        this.quilometragemRodadaTotal = quilometragemRodadaTotal;
    }

    public enum TipoDeCombustivel{
        GASOLINA,
        FLEX,
        DIESEL,
        ELETRICO
    }
}
