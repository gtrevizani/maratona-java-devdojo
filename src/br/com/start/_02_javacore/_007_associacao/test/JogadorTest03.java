package br.com.start._02_javacore._007_associacao.test;

import br.com.start._02_javacore._007_associacao.model.Jogador;
import br.com.start._02_javacore._007_associacao.model.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-----------------Jogador--------------------");
        jogador.imprime();
        System.out.println("-----------------Time--------------------");
        time.imprime();


    }
}
