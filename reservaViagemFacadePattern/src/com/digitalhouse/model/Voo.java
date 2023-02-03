package com.digitalhouse.model;

import java.time.LocalDate;

public class Voo {
    private LocalDate dataVoo;
    private String destino;

    private String companhia;

    public Voo(LocalDate dataVoo, String destino, String companhia) {
        this.dataVoo = dataVoo;
        this.destino = destino;
        this.companhia = companhia;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public LocalDate getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDate dataVoo) {
        this.dataVoo = dataVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
