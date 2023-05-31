package view;

import model.Calcular;

import java.util.Scanner;

public class Game {

    static Scanner teclado = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc;

    public static void main(String[] args) {

        // Chamando método responsável pelo jogo
        Game.jogar();
    }


    // Método responsável pelo jogo
    public static void jogar(){
        // Solicitando para o cliente digitar a dificuldade
        System.out.println(" Informe o nível de dificuldade desejado [1 , 2 , 3 ou 4]. ");

        // Atribuindo valor digitado pelo cliente na variável dificuldade
        int dificuldade = Game.teclado.nextInt();

        // Instanciando novo objeto
        Game.calc = new Calcular(dificuldade);

        System.out.println(" Informe o resultado para a seguinte operação: ");

        // Somar
        if(dificuldade == 0){
            System.out.println(calc.getValor1() + " + " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            // Recebemos a resposta do cliente e verificamos se está certa.
            if(calc.somar(resposta)){
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + "ponto(s). ");
            }
        }


        // Diminuir
        else if(dificuldade == 1){
            System.out.println(calc.getValor1() + " - " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            // Recebemos a resposta do cliente e verificamos se está certa.
            if(calc.diminuir(resposta)){
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + "ponto(s). ");
            }
        }


        // Multiplicar
        else if(dificuldade == 2){
            System.out.println(calc.getValor1() + " * " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            // Recebemos a resposta do cliente e verificamos se está certa.
            if(calc.multiplicar(resposta)){
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + "ponto(s). ");
            }
        }else{
            System.out.println(" A operação mais " + calc.getOperacao() + " não é reconhecida. ");
        }

        System.out.println("Deseja continuar? [1 - SIM , 0 - NÃO] ");
        int continuar = Game.teclado.nextInt();

        if(continuar == 1){
            // Inicia um novo Jogo
            Game.jogar();
        }else{
            System.out.println("Você fez " +  Game.pontos + " ponto(s) ");
            System.out.println("Até a proxima! ");
            System.exit(0);
        }



    }

}
