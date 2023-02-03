package com.digitalhouse.service;

import com.digitalhouse.model.Viagem;

import java.time.LocalDate;

public interface IFacadeViagem {
    Viagem buscar(String destino, LocalDate data);
}
