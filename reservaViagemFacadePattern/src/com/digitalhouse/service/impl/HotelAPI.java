package com.digitalhouse.service.impl;

import com.digitalhouse.model.Hotel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class HotelAPI {
    public List<Hotel> getHoteis(String destino, LocalDate data){
        return Arrays.asList(new Hotel(LocalDate.of(2023,2,15), "Bonito", "Ibis"),
                new Hotel(LocalDate.of(2023, 2, 10), "Campinas","Campineiro"));
    }
}
