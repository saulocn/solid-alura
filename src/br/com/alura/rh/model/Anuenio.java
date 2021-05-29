package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {

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
}
