package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajuste implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate hoje = LocalDate.now();
        long mesesDoUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, hoje);

        if (mesesDoUltimoReajuste < 6) {
            throw new ValidacaoException("Funcionário só deve ter reajuste após 6 meses do último!");
        }
    }
}
