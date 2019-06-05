package com.joao.domain;

import java.util.Calendar;
import java.util.Date;

public interface Arrumavel {

    default Date arrumacao(){
        return Calendar.getInstance().getTime();
    }

}
