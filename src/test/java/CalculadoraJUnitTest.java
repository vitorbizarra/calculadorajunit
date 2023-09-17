import org.junit.Assert;
import org.junit.Test;

import com.calculadora.Calculadora;

public class CalculadoraJUnitTest {

    private Calculadora calculadora;

    public CalculadoraJUnitTest() {
        this.calculadora = new Calculadora();
    }

    @Test
    public void somarDoisNumerosPositivos() {
        int soma = this.calculadora.somar(1, 2);
        Assert.assertEquals(3, soma);
    }

    @Test
    public void somarUmNumeroInteiroEZero() {
        int soma = this.calculadora.somar(3, 0);
        Assert.assertEquals(3, soma);
    }

    @Test
    public void somarNumeroInteiroENumeroNegativo() {
        int soma = this.calculadora.somar(1, -5);
        Assert.assertEquals(-4, soma);
    }

    @Test
    public void somarDoisNumerosNegativos() {
        int soma = this.calculadora.somar(-2, -2);
        Assert.assertEquals(-4, soma);
    }

    @Test
    public void somarNumeroNegativoEZero() {
        int soma = this.calculadora.somar(0, -5);
        Assert.assertEquals(-5, soma);
    }

    @Test
    public void somarDoisZeros() {
        int soma = this.calculadora.somar(0, 0);
        Assert.assertEquals(0, soma);
    }

}
