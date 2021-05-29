package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {

    private BigDecimal valor;
    private LocalDate data;

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public LocalDate getDate() {
        return data;
    }

    @Override
    public BigDecimal getValorImpostoDeRenda() {
        return valor.multiply(new BigDecimal("0.1"));
    }
}
