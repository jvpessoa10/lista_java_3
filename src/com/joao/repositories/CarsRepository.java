package com.joao.repositories;

import com.joao.domain.Carro;

import java.util.ArrayList;

public interface CarsRepository {

    ArrayList<Carro> findCarByType(Class classe);



}
