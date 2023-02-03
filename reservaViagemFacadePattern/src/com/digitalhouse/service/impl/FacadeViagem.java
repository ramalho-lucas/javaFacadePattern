package com.digitalhouse.service.impl;

import com.digitalhouse.model.Viagem;
import com.digitalhouse.service.IFacadeViagem;

import java.time.LocalDate;

public class FacadeViagem implements IFacadeViagem {

    private VooAPI vooAPI;
    private HotelAPI hotelAPI;

    public FacadeViagem() {
        this.vooAPI = new VooAPI();
        this.hotelAPI = new HotelAPI();
    }

    @Override
    public Viagem buscar(String destino, LocalDate data) {
        Viagem viagem = new Viagem();
        viagem.setHoteis(hotelAPI.getHoteis(destino,data));
        viagem.setVoo(vooAPI.getVoo(data, destino));

        return viagem;
    }
}
