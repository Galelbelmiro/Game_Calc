package model;

import java.util.Random;

public class Calcular {

    // Atributos -------------------------------------------------------

    //Nível de dificuldade do cálculo pode ser de 1 até 4
    private int dificuldade;

    // Valor 1
    private int valor1;

    // Valor 2
    private int valor2;

    // Operação (+) (-) (*) será aleatória
    private int operacao;

    // Resultado da Operação
    private int resultado;


    // Construtor da classe -------------------------------------------
    public Calcular(int dificuldade){

        // Objeto da classe Random que gera números aleatorios
        Random rand = new Random();
        this.operacao = rand.nextInt(3); // 0 - Somar , 1 - Diminuir, 2 - multiplicar
        this.dificuldade = dificuldade;

        // Verificando dificuldade escolhida
        if(dificuldade == 1){
            // Fácil
            this.valor1 = rand.nextInt(10); // 0 a 9
            this.valor2 = rand.nextInt(10); // 0 a 9
        } else if (dificuldade == 2) {
            // Médio
            this.valor1 = rand.nextInt(100); // 0 a 99
            this.valor2 = rand.nextInt(100); // 0 a 99
        } else if (dificuldade == 3) {
            // Difícil
            this.valor1 = rand.nextInt(1000); // 0 a 999
            this.valor2 = rand.nextInt(1000); // 0 a 999
        }else if (dificuldade == 4) {
            // Insano
            this.valor1 = rand.nextInt(10000); // 0 a 9999
            this.valor2 = rand.nextInt(10000); // 0 a 9999
        }else{
            // Ultra
            this.valor1 = rand.nextInt(100000); // 0 a 99999
            this.valor2 = rand.nextInt(100000); // 0 a 99999
        }
    }


    // Métodos Especiais -------------------------------------------------------

    public int getDificuldade(){
        return dificuldade;
    }

    public int getValor1(){
        return valor1;
    }

    public int getValor2(){
        return valor2;
    }

    public int getOperacao(){
        return operacao;
    }

    public int getResultado(){
        return resultado;
    }

    public String toString(){
        String op;
        if(this.getOperacao() == 0){
            op = "Somar";
        }else if(this.getOperacao() == 1) {
            op = "Diminuir";
        }else if(this.getOperacao() == 2) {
            op = "Multiplicar";
        }else{
            op = "Operação Desconhecida";
        }
        return "Valor 1: " + this.getValor1() +
                "\nValor 2: " + this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op;
    }

    // Função Somar
    public boolean somar(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            certo = true;
        }else{
            System.out.println("Resposta Errada # ");
        }
        System.out.println(this.getValor1() +  " + " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    // Função Diminuir
    public boolean diminuir(int resposta){
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            certo = true;
        }else{
            System.out.println("Resposta Errada # ");
        }
        System.out.println(this.getValor1() +  " - " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    // Função Multiplicar
    public boolean multiplicar(int resposta){
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            certo = true;
        }else{
            System.out.println("Resposta Errada # ");
        }
        System.out.println(this.getValor1() +  " * " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }
}
