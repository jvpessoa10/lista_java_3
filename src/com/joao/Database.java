package com.joao;

import com.joao.domain.*;
import com.joao.repositories.CarsRepository;
import com.joao.repositories.HostingRepository;

import java.util.ArrayList;
import java.util.Date;

public class Database implements CarsRepository, HostingRepository {

    ArrayList<Carro> carros;
    ArrayList<Hospedagem> hospedagens;


    private static Database instance;

    public Database(){

        carros = new ArrayList<>();
        carros.add(new CarroBasico(false,3,Carro.TipoDeCombustivel.GASOLINA,4.0,false,"placa",new Date(), 4.0));
        carros.add(new CarroComum(true,1,Carro.TipoDeCombustivel.FLEX,1.0,false,"placaq",new Date(), 5.0));
        carros.add(new CarroBasico(false,5,Carro.TipoDeCombustivel.DIESEL,3.0,false,"plaqweca",new Date(), 2.1));
        carros.add(new CarroLuxo(true,2,Carro.TipoDeCombustivel.ELETRICO,2.0,false,"placwwwwa",new Date(), 10.1));
    }


    public static synchronized Database getInstance() {

        if(instance == null) instance = new Database();
        return instance;
    }

    @Override
    public ArrayList<Carro> findCarByType(Class classe) {

        ArrayList<Carro> result = new ArrayList<>();
        for (Carro carro: carros
             ) {
            if(carro.getClass().equals(classe)) result.add(carro);
        }

        return result;
    }



    @Override
    public ArrayList<Hospedagem> findHostByType(Class classe) {
        ArrayList<Hospedagem> result = new ArrayList<>();
        for (Hospedagem hospedagem: hospedagens
        ) {
            if(hospedagem.getClass().equals(classe)) result.add(hospedagem);
        }

        return result;
    }




}
