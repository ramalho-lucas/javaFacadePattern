package com.digitalhouse.service;

import com.digitalhouse.model.Cartao;
import com.digitalhouse.model.Produto;

public interface IFacadeDesconto {
    int desconto(Cartao cartao, Produto produto, int quantidade);
}
