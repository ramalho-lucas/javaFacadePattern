package com.digitalhouse.service.impl;

import com.digitalhouse.model.Produto;

public class APIProduto {
    public int desconto(Produto produto){
        if(produto.getTipo().equals("Lata")){
            return 10;
        } else {
            return 0;
        }
    }
}
