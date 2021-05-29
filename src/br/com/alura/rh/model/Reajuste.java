package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

    BigDecimal getValor();

    LocalDate getDate();
}
