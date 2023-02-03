package com.digitalhouse.model;

import java.util.ArrayList;
import java.util.List;

public class Viagem {

    private List<Voo> voo = new ArrayList<>();
    private  List<Hotel> hoteis = new ArrayList<>();

    public Viagem(List<Voo> voo, List<Hotel> hoteis) {
        this.voo = voo;
        this.hoteis = hoteis;
    }

    public Viagem() {
    }

    public void getVoo() {
        for (Voo voo : this.voo){
            System.out.println("------Lista de Voo---------");
            System.out.println(voo.getDestino());
            System.out.println(voo.getDataVoo());
            System.out.println(voo.getCompanhia());
            System.out.println("---------------------------");
        }
    }

    public void setVoo(List<Voo> voo) {
        this.voo = voo;
    }

    public void getHoteis() {
        for (Hotel hotel : this.hoteis){
            System.out.println("-------Lista de Hoteis--------");
            System.out.println(hotel.getDestino());
            System.out.println(hotel.getData());
            System.out.println(hotel.getNomeHotel());
            System.out.println("------------------------------");
        }
    }

    public void setHoteis(List<Hotel> hoteis) {
        this.hoteis = hoteis;
    }
}
