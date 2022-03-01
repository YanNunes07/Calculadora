package model;

public class Calculadora {
    public double valor1;
    public double valor2;

    public double somar(){
     return this.valor1 + this.valor2;
    }

    public double subitrair(){
        return this.valor1 - this.valor2;
    }

    public double dividir(){
        return this.valor1 / this.valor2;
    }

    public double multiplicar(){
        return this.valor1 * this.valor2;
    }

    public String mostrarDados(){
        return "\nValor1: "+this.valor1+
                "\nValor2: "+this.valor2;
    }


}
