package com.digitalhouse.service.impl;

import com.digitalhouse.model.Voo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class VooAPI {
    public List<Voo> getVoo(LocalDate data, String destino){
        return Arrays.asList(new Voo(LocalDate.of(2023,2,10),"Campinas","Azul"),
                new Voo(LocalDate.of(2023,2,15),"Bonito","Latam"));
    }
}
