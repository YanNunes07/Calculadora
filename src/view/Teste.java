package view;

import model.Calculadora;

import java.util.Scanner;

public class Teste {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("digite o valor 1");
        calc.valor1 = ler.nextDouble();

        System.out.println("digite o valor 2");
        calc.valor2 = ler.nextDouble();

      System.out.println(calc.mostrarDados());
      System.out.println(calc.somar());
      System.out.println(calc.subitrair());
      System.out.println(calc.multiplicar());
      System.out.println(calc.dividir());

    }

}
