package com.joao.services;

import com.joao.Database;
import com.joao.domain.Hospedagem;
import com.joao.repositories.HostingRepository;

import java.util.ArrayList;

public class HostService {


    private HostingRepository repo = Database.getInstance();


    public ArrayList<Hospedagem> findByType(Class type){
        return repo.findHostByType(type);
    }
}
