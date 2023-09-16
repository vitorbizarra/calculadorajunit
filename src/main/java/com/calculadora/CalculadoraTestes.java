package com.calculadora;

public class CalculadoraTestes {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        System.out.println("Método somar(): \n");
        System.out.println("Cenário de testes 1: Soma de dois valores inteiros (10)");
        int soma = calc.somar(3, 7);
        System.out.println(soma);

        System.out.println("\nCenário de testes 2: Soma de um inteiro e zero (3)");
        soma = calc.somar(3, 0);
        System.out.println(soma);

        System.out.println("\nCenário de testes 3: Soma de um inteiro e um negativo (-4)");
        soma = calc.somar(1, -5);
        System.out.println(soma);

        System.out.println("\nCenário de testes 4: Soma de dois negativos (-4)");
        soma = calc.somar(-2, -2);
        System.out.println(soma);

        System.out.println("\nCenário de testes 5: Soma de um negativo e zero (-5)");
        soma = calc.somar(-5, 0);
        System.out.println(soma);

        System.out.println("\nCenário de testes 6: Soma de dois zeros (0)");
        soma = calc.somar(0, 0);
        System.out.println(soma);
    }
}