package com.joao.services;

import com.joao.Database;
import com.joao.domain.Carro;
import com.joao.repositories.CarsRepository;

import java.util.ArrayList;

public class CarService {


    private CarsRepository repo = Database.getInstance();


    public ArrayList<Carro> findByType(Class type){
        return repo.findCarByType(type);
    }

}
