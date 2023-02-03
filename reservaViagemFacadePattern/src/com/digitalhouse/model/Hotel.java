package com.digitalhouse.model;

import java.time.LocalDate;

public class Hotel {
    private LocalDate data;
    private String Destino;

    private String nomeHotel;

    public Hotel(LocalDate data, String destino, String nomeHotel) {
        this.data = data;
        Destino = destino;
        this.nomeHotel = nomeHotel;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }
}
