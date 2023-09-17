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

    @Test
    public void subtrairInteiroDeInteiro() {
        int subtracao = this.calculadora.subtrair(2, 1);
        Assert.assertEquals(1, subtracao);
    }

    @Test
    public void subtrairZeroDeInteiro() {
        int subtracao = this.calculadora.subtrair(1, 0);
        Assert.assertEquals(1, subtracao);
    }

    @Test
    public void subtrairInteiroDeZero() {
        int subtracao = this.calculadora.subtrair(0, 1);
        Assert.assertEquals(-1, subtracao);
    }

    @Test
    public void subtrairZeroDeZero() {
        int subtracao = this.calculadora.subtrair(0, 0);
        Assert.assertEquals(0, subtracao);
    }

    @Test
    public void subtrairNegativoDeInteiro() {
        int subtracao = this.calculadora.subtrair(1, -1);
        Assert.assertEquals(2, subtracao);
    }

    @Test
    public void subtrairNegativoDeNegativo() {
        int subtracao = this.calculadora.subtrair(-1, -1);
        Assert.assertEquals(0, subtracao);
    }
}
