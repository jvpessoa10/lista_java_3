package com.joao.services;

import com.joao.domain.Hospedagem;
import com.joao.repositories.HostingRepository;

import java.util.ArrayList;

public class HostService {


    private HostingRepository repo;

    public ArrayList<Hospedagem> findByType(Class type){
        return repo.findHostByType(type);
    }
}
