package com.joao.repositories;

import com.joao.domain.Hospedagem;

import java.util.ArrayList;

public interface HostingRepository{


    ArrayList<Hospedagem> findHostByType(Class clase);

}
